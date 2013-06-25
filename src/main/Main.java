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
import com.db4o.ext.DatabaseClosedException;
import com.db4o.ext.DatabaseFileLockedException;
import com.db4o.ext.DatabaseReadOnlyException;
import com.db4o.ext.Db4oIOException;
import com.db4o.ext.IncompatibleFileFormatException;
import com.db4o.ext.OldFormatException;
import com.db4o.query.Query;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;

import model.*;

public class Main {

    public static ObjectContainer db;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        CargarBD();
        Scanner scan = new Scanner(System.in);
        int caso = 0;
        int primerCaso;
        do {

            System.out.println("INGRESE UNA OPCION");
            System.out.println("1.-Cargar Datos                 2.-Ver Consultas");
            primerCaso = scan.nextInt();
            if (primerCaso == 1) {
            }
            if (primerCaso == 2) {
                System.out.println("INGRESE NUMERO DE CONSULTA QUE DESEA EJECUTAR");
                System.out.println("1.-Consulta 1               5.-Consulta 5");
                System.out.println("2.-Consulta 2               6.-Consulta 6");
                System.out.println("3.-Consulta 3               7.-Consulta 7");
                System.out.println("4.-Consulta 4               8.-Consulta 8");
                System.out.println("0.-SALIR");
                caso = scan.nextInt();
                switch (caso) {
                    case (1):
                        consulta1();
                        break;
                    case (2):
                        consulta2();
                        break;
                    case (3):
                        consulta3();
                        break;
                    case (4):
                        consulta4();
                        break;
                    case (5):
                        consulta5();
                        break;
                    case (6):
                        consulta6();
                        break;
                    case (7):
                        consulta7();
                        break;
                    case (8):
                        consulta8();
                        break;
                }
            }
        } while (caso != 0);
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
                } else if (cont == max) {
                    peliculadelmes.add(pelicula);
                }
            }
            DateFormat formatter = new SimpleDateFormat("MMMMM");
            GregorianCalendar calendar = new GregorianCalendar();
            calendar.set(Calendar.MONTH, mes);
            formatter.format(calendar.getTime());
            System.out.println("\nPelicula del Mes " + formatter.format(calendar.getTime()) + " : VentaTotal: " + max);
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
        for (Sucursal sucursal : sucursales) {
            int[] suma = new int[12];
            for (Horario horario : horarios) {
                if (horario.getNumsucur() == sucursal.getNumerosu()) {
                    suma[horario.getFecha().getMonth()] += horario.getSala().getValorEntrada();
                }
            }

            for (ClienteCompraProduc ccproducto : ccproductos) {
                if (ccproducto.getProducto().getComercioAsociado().getEmpleado().getNumsucursal().equals(sucursal.getNumerosu() + "")) {
                    suma[ccproducto.getFecha().getMonth()] += ccproducto.getProducto().getValorEnPesos();
                }
            }
            float prom = (suma[0] + suma[1] + suma[2] + suma[3] + suma[4] + suma[5] + suma[6] + suma[7] + suma[8] + suma[9] + suma[10] + suma[11]) / 12;
            System.out.println("Sucursal " + sucursal.getNombre() + ", Promedio ventas: " + prom + ", Comuna " + sucursal.getComuna());

        }
    }

    private static void consulta4() {
        System.out.println("4.- Resultado:");
        List<Sucursal> sucursales = db.query(Sucursal.class);
        List<FullTime> fullTimes = db.query(FullTime.class);
        List<TickNormal> tickNormales = db.query(TickNormal.class);
        List<TickEspecial> tickEspeciales = db.query(TickEspecial.class);
        Map h = new HashMap<Integer, Sucursal>();
        for (Sucursal sucursal : sucursales) {
            float ventas = 0;
            float pagos = 0;

            for (TickNormal tickNormal : tickNormales) {
                if (tickNormal.getHorario().getNumsucur() == sucursal.getNumerosu()) {
                    ventas += tickNormal.getHorario().getSala().getValorEntrada();
                }
            }
            for (TickEspecial tickEspecial : tickEspeciales) {
                if (tickEspecial.getHorario().getNumsucur() == sucursal.getNumerosu()) {
                    ventas += tickEspecial.getHorario().getSala().getValorEntrada();
                }
            }

            for (FullTime fullTime : fullTimes) {
                if (fullTime.getEmpleado().getNumsucursal().equals(sucursal.getNumerosu() + "")) {
                    pagos += fullTime.getSueldo();
                }
            }
            double ROI = ventas / pagos;
            h.put(-ROI, sucursal);
            //System.out.println("Sucursal " + sucursal.getNombre() + ", ROI: " + ROI);
        }
        Map<Integer, Sucursal> sortedMap = new TreeMap<Integer, Sucursal>(h);
        int i = 1;
        for (Sucursal sucursal : sortedMap.values()) {
            System.out.println(i + ".- Sucursal " + sucursal.getNombre() + " " + sucursal.getEncargado().getEmpleado().getNombre());
        }
    }

    private static void consulta5() {
        System.out.println("5.- Resultado:");
        List<Cajero> cajeros = db.query(Cajero.class);
        List<Ticket> tickets = db.query(Ticket.class);
        Query query = db.query();

        for (Cajero cajero : cajeros) {
            if (!cajero.getAntecedentes().equals("sin antecedentes") && (cajero.getEmpleado().getSucursal().getRegion().equals("RM")
                    || cajero.getEmpleado().getSucursal().getRegion().equals("IV")
                    || cajero.getEmpleado().getSucursal().getRegion().equals("V")
                    || cajero.getEmpleado().getSucursal().getRegion().equals("VI"))) {
                Calendar dob = Calendar.getInstance();
                dob.setTime(cajero.getEmpleado().getFechaNacimiento());
                Calendar today = Calendar.getInstance();
                int age = today.get(Calendar.YEAR) - dob.get(Calendar.YEAR);
                if (today.get(Calendar.MONTH) < dob.get(Calendar.MONTH)) {
                    age--;
                } else if (today.get(Calendar.MONTH) == dob.get(Calendar.MONTH)
                        && today.get(Calendar.DAY_OF_MONTH) < dob.get(Calendar.DAY_OF_MONTH)) {
                    age--;
                }
                Query q = db.query();
                q.constrain(Ticket.class);
                q.descend("rutcajero").constrain(cajero.getRute());
                ObjectSet t = q.execute();
                int desc = 0;
                for (int i = 0; i < t.size(); i++) {
                    desc += ((Ticket) t.get(i)).getDctoPorDia();
                }
                t.size();



                System.out.println("Cajero: " + cajero.getEmpleado().getNombre() + " RUT: " + cajero.getRute() + " EDAD:" + age + " NºTICKETS: " + t.size() + " DESC TOTAL: " + desc);
            }
        }

    }

    private static void consulta6() {
        
    }
    
    private static void consulta7() {
        List<Empleado> empleados = db.query(Empleado.class);
        String rut = "";
        for (Empleado empleado : empleados) {
            if (empleado.getNombre().equalsIgnoreCase("Ricitos Magica")) {
                rut = empleado.getRute();
            }
        }
        //crear comercio asociado
        List<ComercioAsociado> comercios = db.query(ComercioAsociado.class);
        int codigo = comercios.get(comercios.size() - 1).getCodigoca() + 1;
        ComercioAsociado com = new ComercioAsociado();
        com.setCodigoca(codigo+"");
        com.setRutadmin(rut);
        com.setNombre("CCU");
        com.setRubro("Vendedora Gaseosas");
        db.store(com);
        db.commit();
        List<Producto> prod = db.query(Producto.class);
        int numero = prod.get(prod.size() - 1).getNumero();
        Producto p1 = new Producto();
        p1.setNumero(numero + 1 + "");
        p1.setCategoria("Gaseosas");
        p1.setCodigoca(codigo + "");
        p1.setNombre("Pepsi 500cc");
        p1.setValorEnPesos("700");
        p1.setValorEnPuntos("50");
        Producto p2 = new Producto();
        p2.setNumero(numero + 2 + "");
        p2.setCategoria("Gaseosas");
        p2.setCodigoca(codigo + "");
        p2.setNombre("Cachantun 750cc");
        p2.setValorEnPesos("800");
        p2.setValorEnPuntos("50");
        Producto p3 = new Producto();
        p3.setNumero(numero + 3 + "");
        p3.setCategoria("Gaseosas");
        p3.setCodigoca(codigo + "");
        p3.setNombre("Bilz 500cc");
        p3.setValorEnPesos("600");
        p3.setValorEnPuntos("50");
        Producto p4 = new Producto();
        p4.setNumero(numero + 4 + "");
        p4.setCategoria("Gaseosas");
        p4.setCodigoca(codigo + "");
        p4.setNombre("Pap 500cc");
        p4.setValorEnPesos("600");
        p4.setValorEnPuntos("50");
        Producto p5 = new Producto();
        p5.setNumero(numero + 5 + "");
        p5.setCategoria("Gaseosas");
        p5.setCodigoca(codigo + "");
        p5.setNombre("7up 500cc");
        p5.setValorEnPesos("600");
        p5.setValorEnPuntos("50");
        Producto p6 = new Producto();
        p6.setNumero(numero + 6 + "");
        p6.setCategoria("Gaseosas");
        p6.setCodigoca(codigo + "");
        p6.setNombre("Limon Soda 500cc");
        p6.setValorEnPesos("600");
        p6.setValorEnPuntos("50");
        Producto p7 = new Producto();
        p7.setNumero(numero + 7 + "");
        p7.setCategoria("Gaseosas");
        p7.setCodigoca(codigo + "");
        p7.setNombre("Crush 500cc");
        p7.setValorEnPesos("600");
        p7.setValorEnPuntos("50");
        db.store(p1);
        db.store(p2);
        db.store(p3);
        db.store(p4);
        db.store(p5);
        db.store(p6);
        db.store(p7);
        db.commit();
        List<Producto> p = db.query(Producto.class);
        for (Producto produ : p) {
            System.out.println(produ.getNombre());
        }
    }


private static void consulta8() {
        List<Sucursal> sucursal = db.query(Sucursal.class);
        for (Sucursal s : sucursal) {
            if (s.getRegion().equalsIgnoreCase("I")) {
                s.setRegion("1");
            }
            if (s.getRegion().equalsIgnoreCase("II")) {
                s.setRegion("2");
            }
            if (s.getRegion().equalsIgnoreCase("III")) {
                s.setRegion("3");
            }
            if (s.getRegion().equalsIgnoreCase("IV")) {
                s.setRegion("4");
            }
            if (s.getRegion().equalsIgnoreCase("V")) {
                s.setRegion("5");
            }
            if (s.getRegion().equalsIgnoreCase("VI")) {
                s.setRegion("6");
            }
            if (s.getRegion().equalsIgnoreCase("VII")) {
                s.setRegion("7");
            }
            if (s.getRegion().equalsIgnoreCase("VIII")) {
                s.setRegion("8");
            }
            if (s.getRegion().equalsIgnoreCase("IX")) {
                s.setRegion("9");
            }
            if (s.getRegion().equalsIgnoreCase("X")) {
                s.setRegion("10");
            }
            if (s.getRegion().equalsIgnoreCase("XI")) {
                s.setRegion("11");
            }
            if (s.getRegion().equalsIgnoreCase("XII")) {
                s.setRegion("12");
            }
            if (s.getRegion().equalsIgnoreCase("RM")) {
                s.setRegion("13");
            }
            if (s.getRegion().equalsIgnoreCase("XIII")) {
                s.setRegion("14");
            }
            if (s.getRegion().equalsIgnoreCase("IVX")) {
                s.setRegion("15");
            }
            System.out.println(s.getRegion());
        }
    }

    public static void CargarBD() throws OldFormatException, Db4oIOException, DatabaseClosedException, DatabaseReadOnlyException, DatabaseFileLockedException, IncompatibleFileFormatException {
//        if (cargarBD) {
//            File f = new File("BD/test3.db");
//            f.delete();
//        }
        File f = new File("BD/test.db");
        boolean cargar = !f.exists();
        db = Db4oEmbedded.openFile(
                Db4oEmbedded.newConfiguration(), "BD/test.db");

        if (cargar) {
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
            }
            db.commit();
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
            for (ComercioAsociado comercioAsociado : comercioAsociados) {
                Empleado eproto = new Empleado();
                eproto.setRute(comercioAsociado.getRutadmin());
                Empleado empleado = (Empleado) db.queryByExample(eproto).next();
                comercioAsociado.setEmpleado(empleado);
                db.store(comercioAsociado);
            }

            //Relacion producto - comercioAsociado
            List<Producto> productos = db.query(Producto.class);
            for (Producto producto : productos) {
                ComercioAsociado cproto = new ComercioAsociado();
                cproto.setCodigoca(producto.getCodigoca() + "");
                ComercioAsociado comercioAsociado = (ComercioAsociado) db.queryByExample(cproto).next();
                producto.setComercioAsociado(comercioAsociado);
                db.store(producto);
            }

            //Relacion producto - cliente compra producto
            List<ClienteCompraProduc> clienteCompraProductos = db.query(ClienteCompraProduc.class);
            for (ClienteCompraProduc clienteCompraProducto : clienteCompraProductos) {
                Producto pproto = new Producto();
                pproto.setNumero(clienteCompraProducto.getNumproducto());
                Producto producto = (Producto) db.queryByExample(pproto).next();
                clienteCompraProducto.setProducto(producto);
                db.store(clienteCompraProducto);
            }

            //Relacio fulltime - empleado
            List<FullTime> fullTimes = db.query(FullTime.class);
            for (FullTime fullTime : fullTimes) {
                Empleado eproto = new Empleado();
                eproto.setRute(fullTime.getRute());;
                Empleado empleado = (Empleado) db.queryByExample(eproto).next();
                fullTime.setEmpleado(empleado);
                db.store(fullTime);
            }

            //Relacion encargado - sucursal
            List<Sucursal> sucursales = db.query(Sucursal.class);
            for (Sucursal sucursal : sucursales) {
                EncargadoSucursal eproto = new EncargadoSucursal();
                eproto.setRute(sucursal.getRutEncargado());
                EncargadoSucursal empleado = (EncargadoSucursal) db.queryByExample(eproto).next();
                sucursal.setEncargado(eproto);
                db.store(sucursal);
            }

            //Relacion encargado - empleado
            List<EncargadoSucursal> encargadoSucursales = db.query(EncargadoSucursal.class);
            for (EncargadoSucursal encargadoSucursal : encargadoSucursales) {
                Empleado eproto = new Empleado();
                eproto.setRute(encargadoSucursal.getRute());
                Empleado empleado = (Empleado) db.queryByExample(eproto).next();
                encargadoSucursal.setEmpleado(empleado);
                db.store(encargadoSucursal);
            }

            //Cajero - Empleado

            List<Cajero> cajeros = db.query(Cajero.class);
            for (Cajero cajero : cajeros) {
                Empleado eproto = new Empleado();
                eproto.setRute(cajero.getRute());
                Empleado empleado = (Empleado) db.queryByExample(eproto).next();
                cajero.setEmpleado(empleado);
                db.store(cajero);
            }

            //Cajero - Ticket
            List<Ticket> tickets = db.query(Ticket.class);
            for (Ticket ticket : tickets) {
                Cajero cproto = new Cajero();
                cproto.setRute(ticket.getRutcajero());
                Cajero cajero = (Cajero) db.queryByExample(cproto).next();
                ticket.setCajero(cajero);
                db.store(ticket);
            }


            db.commit();

        }
    }
}
