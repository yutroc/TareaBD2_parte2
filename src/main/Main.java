package main;

import java.io.File;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Query;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

import model.*;

public class Main {

    public static ObjectContainer db;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        boolean cargarBD = true;
        if (cargarBD) {
            File f = new File("BD/test3.db");
            f.delete();
        }
        db = Db4oEmbedded.openFile(
                Db4oEmbedded.newConfiguration(), "BD/test3.db");

        if (cargarBD) {
            Mapper.readAllCSV("CSV", Main.class, db);
            db.commit();
            //Vincular Empleado y supervisor
            List empleados = db.query(Empleado.class);
            for (int i = 0; i < empleados.size(); i++) {
                Empleado empleado = (Empleado) empleados.get(i);
                Empleado proto = new Empleado();
                proto.setRute(empleado.getRutsupervisor());
                List lista = db.queryByExample(proto);
                Sucursal sproto = new Sucursal();
                sproto.setNumerosu(empleado.getNumsucursal());
                Sucursal sucursal = (Sucursal) Main.db.queryByExample(sproto).next();
                empleado.setSucursal(sucursal);
                if (lista.size() > 0) {
                    Empleado l = (Empleado) (lista.get(0));
                    empleado.setSupervisor(l);
                    db.store(empleado);
                }
            }
            db.commit();
            //Vincular Empleado - Sucursal
            List encargado_sucursal = db.query(EncargadoSucursal.class);
            for (int i = 0; i < encargado_sucursal.size(); i++) {
                EncargadoSucursal encargado = (EncargadoSucursal) encargado_sucursal.get(i);
                Empleado proto = new Empleado();
                proto.setRute(encargado.getRute());
                List lista = db.queryByExample(proto);
                if (lista.size() > 0) {
                    Empleado l = (Empleado) (lista.get(0));
                    encargado.setEmpleado(l);
                    db.store(encargado);
                }
                Query query = db.query();
                query.constrain(Sucursal.class);
                query.descend("rutEncargado").equals(encargado.getRute());
                ObjectSet result = query.execute();
                Sucursal next = (Sucursal) result.next();
                next.setEncargado(encargado);
                db.store(next);

                db.commit();
            }
            //Relacion de ticket con pelicula
            List<TickNormal> tickNormal = db.query(TickNormal.class);
            for (int i = 0; i < tickNormal.size(); i++) {
                Horario hproto = new Horario();
                hproto.setCodigoh("" + tickNormal.get(i).getCodigoh());
                Horario h = (Horario) db.queryByExample(hproto).next();
                Pelicula pproto = new Pelicula();
                pproto.setCodigo("" + tickNormal.get(i).getCodigopeli());
                Pelicula p = (Pelicula) db.queryByExample(pproto).next();
                tickNormal.get(i).setHorario(h);
                tickNormal.get(i).setPelicula(p);
                db.store(tickNormal.get(i));
                db.store(p);
                db.store(h);
            }

            List<TickEspecial> tickEspecial = db.query(TickEspecial.class);
            for (int i = 0; i < tickEspecial.size(); i++) {
                Horario hproto = new Horario();
                hproto.setCodigoh("" + tickEspecial.get(i).getCodigoh());
                Horario h = (Horario) db.queryByExample(hproto).next();
                Pelicula pproto = new Pelicula();
                pproto.setCodigo("" + tickEspecial.get(i).getCodigopeli());
                Pelicula p = (Pelicula) db.queryByExample(pproto).next();
                tickEspecial.get(i).setHorario(h);
                tickEspecial.get(i).setPelicula(p);
                db.store(tickEspecial.get(i));
                db.store(p);
                db.store(h);
            }
            db.commit();

            //Relacion horario - Sala
            List<Horario> horarios = db.query(Horario.class);
            for (Horario horario : horarios) {
                Sala sproto = new Sala();
                sproto.setNumerosa("" + horario.getNumsala());
                Sala sala = (Sala) db.queryByExample(sproto).next();
                horario.setSala(sala);
                db.store(horario);
            }
            db.commit();
            
            //Relacion Comercio Asociado - Empleado
            List<ComercioAsociado> comercioAsociados = db.query(ComercioAsociado.class);
            for(ComercioAsociado comercioAsociado :comercioAsociados){
                Empleado eproto = new Empleado();
                eproto.setRute(comercioAsociado.getRutadmin());
                Empleado empleado = (Empleado) db.queryByExample(eproto).next();
                comercioAsociado.setEmpleado(empleado);
                db.store(comercioAsociado);
            }
            
            //Relacion producto - comercioAsociado
            List<Producto> productos = db.query(Producto.class);
            for(Producto producto :productos){
                ComercioAsociado cproto = new ComercioAsociado();
                cproto.setCodigoca(producto.getCodigoca()+"");
                ComercioAsociado comercioAsociado = (ComercioAsociado) db.queryByExample(cproto).next();
                producto.setComercioAsociado(comercioAsociado);
                db.store(producto);
            }
            
            //Relacion producto - cliente compra producto
            List<ClienteCompraProduc> clienteCompraProductos = db.query(ClienteCompraProduc.class);
            for(ClienteCompraProduc clienteCompraProducto : clienteCompraProductos){
                Producto pproto = new Producto();
                pproto.setNumero(clienteCompraProducto.getNumproducto());
                Producto producto = (Producto) db.queryByExample(pproto).next();
                clienteCompraProducto.setProducto(producto);
                db.store(clienteCompraProducto);
            }
            db.commit();
            
        }
        consulta1();
        consulta2();
        consulta3();
        consulta4();
        consulta5();
        db.close();
    }

    private static void consulta1() {
        List<Pelicula> peliculas = db.query(Pelicula.class);
        List<Pelicula> result = new ArrayList<Pelicula>();
        for (Pelicula pelicula : peliculas) {
            int visitas = 0;
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Date inicio = null;
            Date fin = null;
            try {
                inicio = new Date(format.parse("2012-08-01").getTime());
                fin = new Date(format.parse("2012-08-31").getTime());
                List<TickNormal> tickNormales = db.query(TickNormal.class);
                List<TickEspecial> tickEspeciales = db.query(TickEspecial.class);
                for (TickNormal tickNormal : tickNormales) {
                    if (tickNormal.getCodigopeli() == pelicula.getCodigo()
                            && tickNormal.getHorario().getFecha().after(inicio)
                            && tickNormal.getHorario().getFecha().before(fin)) {
                        visitas++;
                    }
                }
                for (TickEspecial tickEspecial : tickEspeciales) {
                    if (tickEspecial.getCodigopeli() == pelicula.getCodigo()
                            && tickEspecial.getHorario().getFecha().after(inicio)
                            && tickEspecial.getHorario().getFecha().before(fin)) {
                        visitas++;
                    }
                }

            } catch (ParseException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            if (visitas > 0 && visitas < 100 && (pelicula.getClasificacion().contains("13") || pelicula.getClasificacion().contains("15") || pelicula.getClasificacion().contains("17"))) {
                result.add(pelicula);
            }
            //System.out.println(pelicula.toString());
        }
        System.out.println("1.- Resultado:");
        for (Pelicula pelicula : result) {
            System.out.println(pelicula.getTitulo() + " " + pelicula.getDirector());
        }
    }

    private static void consulta2() {
        System.out.println("2.- Resultado:");
        List<Pelicula> peliculas = db.query(Pelicula.class);
        List<TickNormal> tickNormales = db.query(TickNormal.class);
        List<TickEspecial> tickEspeciales = db.query(TickEspecial.class);
        for (int mes = 0; mes < 12; mes++) {
            int max = 0;
            List<Pelicula> peliculadelmes = new ArrayList<Pelicula>();
            for (Pelicula pelicula : peliculas) {
                int cont = 0;
                for (TickNormal tickNormal : tickNormales) {
                    if (tickNormal.getCodigopeli() == pelicula.getCodigo()
                            && tickNormal.getHorario().getFecha().getMonth() == mes
                            && tickNormal.getHorario().getFecha().getYear() == 2012) {
                        cont += tickNormal.getHorario().getSala().getValorEntrada();
                    }
                }
                for (TickEspecial tickEspecial : tickEspeciales) {
                    if (tickEspecial.getCodigopeli() == pelicula.getCodigo()
                            && tickEspecial.getHorario().getFecha().getMonth() == mes
                            && tickEspecial.getHorario().getFecha().getYear() == 112) {
                        cont += tickEspecial.getHorario().getSala().getValorEntrada();
                    }
                }
                if (cont > max) {
                    max = cont;
                    peliculadelmes.clear();
                    peliculadelmes.add(pelicula);
                }else if(cont == max){
                    peliculadelmes.add(pelicula);                    
                }
            }
            DateFormat formatter = new SimpleDateFormat("MMMMM");
            GregorianCalendar calendar = new GregorianCalendar();
            calendar.set(Calendar.MONTH, mes);
            formatter.format(calendar.getTime());
            System.out.println("\nPelicula del Mes "+formatter.format(calendar.getTime())+" : VentaTotal: "+ max);
            for (Pelicula pelicula : peliculadelmes) {
                System.out.println(pelicula.getTitulo() + " " + pelicula.getDirector());
            }
        }
        
    }
    
    private static void consulta3() {
        System.out.println("3.- Resultado:");
        List<Sucursal> sucursales = db.query(Sucursal.class);
        List<Horario> horarios = db.query(Horario.class);        
        List<ClienteCompraProduc> ccproductos = db.query(ClienteCompraProduc.class);
        for(Sucursal sucursal : sucursales){
            int[] suma = new int[12];
            for(Horario horario:horarios){
                if(horario.getNumsucur() == sucursal.getNumerosu()){                    
                    suma[horario.getFecha().getMonth()]+=horario.getSala().getValorEntrada();
                }
            }
            
            for(ClienteCompraProduc ccproducto : ccproductos){
                if(ccproducto.getProducto().getComercioAsociado().getEmpleado().getNumsucursal().equals(sucursal.getNumerosu()+"")){
                    suma[ccproducto.getFecha().getMonth()]+=ccproducto.getProducto().getValorEnPesos();
                }
            }
            float prom = (suma[0] + suma[1]+suma[2]+suma[3]+suma[4]+suma[5]+suma[6]+suma[7]+suma[8]+suma[9]+suma[10]+suma[11])/12;
            System.out.println("Sucursal " + sucursal.getNombre() +", Promedio ventas: "+prom +", Comuna " + sucursal.getComuna());
            
        }
    }

    private static void consulta4() {
        System.out.println("4.- Resultado:");
        List<Sucursal> sucursales = db.query(Sucursal.class);
        List<Horario> horarios = db.query(Horario.class);        
        List<ClienteCompraProduc> ccproductos = db.query(ClienteCompraProduc.class);
        for(Sucursal sucursal : sucursales){
            int[] suma = new int[12];
            for(Horario horario:horarios){
                if(horario.getNumsucur() == sucursal.getNumerosu()){                    
                    suma[horario.getFecha().getMonth()]+=horario.getSala().getValorEntrada();
                }
            }
            
            for(ClienteCompraProduc ccproducto : ccproductos){
                if(ccproducto.getProducto().getComercioAsociado().getEmpleado().getNumsucursal().equals(sucursal.getNumerosu()+"")){
                    suma[ccproducto.getFecha().getMonth()]+=ccproducto.getProducto().getValorEnPesos();
                }
            }
            float prom = (suma[0] + suma[1]+suma[2]+suma[3]+suma[4]+suma[5]+suma[6]+suma[7]+suma[8]+suma[9]+suma[10]+suma[11])/12;
            System.out.println("Sucursal " + sucursal.getNombre() +", Promedio ventas: "+prom +", Comuna " + sucursal.getComuna());
            
        }
    }

    private static void consulta5() {
        System.out.println("5.- Resultado:");
        List<Sucursal> sucursales = db.query(Sucursal.class);
        List<Horario> horarios = db.query(Horario.class);        
        List<ClienteCompraProduc> ccproductos = db.query(ClienteCompraProduc.class);
        for(Sucursal sucursal : sucursales){
            int[] suma = new int[12];
            for(Horario horario:horarios){
                if(horario.getNumsucur() == sucursal.getNumerosu()){                    
                    suma[horario.getFecha().getMonth()]+=horario.getSala().getValorEntrada();
                }
            }
            
            for(ClienteCompraProduc ccproducto : ccproductos){
                if(ccproducto.getProducto().getComercioAsociado().getEmpleado().getNumsucursal().equals(sucursal.getNumerosu()+"")){
                    suma[ccproducto.getFecha().getMonth()]+=ccproducto.getProducto().getValorEnPesos();
                }
            }
            float prom = (suma[0] + suma[1]+suma[2]+suma[3]+suma[4]+suma[5]+suma[6]+suma[7]+suma[8]+suma[9]+suma[10]+suma[11])/12;
            System.out.println("Sucursal " + sucursal.getNombre() +", Promedio ventas: "+prom +", Comuna " + sucursal.getComuna());
            
        }
    }
}
