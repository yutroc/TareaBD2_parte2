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
import java.util.logging.Level;
import java.util.logging.Logger;

import model.*;

public class Main {

    public static ObjectContainer db;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        boolean cargarBD = false;
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
            for(Horario horario : horarios){
                Sala sproto = new Sala();
                sproto.setNumerosa(""+horario.getNumsala());
                Sala sala = (Sala) db.queryByExample(sproto).next();
                horario.setSala(sala);
                db.store(horario);
            }
            db.commit();
            System.out.println("done - Relacion de ticket - pelicula y horario");
        }
        consulta1();
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
        System.out.println("1.- Peores Pelculas de adolecentes de Agosto: Muestre el ttulo de las pelculas y sus\n"
                + "correspondientes Directores, de la que ha sido vistas menos de 100 veces solo en el mes\n"
                + "de Agosto del 2012 y ademas posean clasicacion \\+13\", \\+15\" y \\+17\" para que los\n"
                + "comentaristas realicen una crtica al director de la pelicula.\n"
                + "Resultado:");
        for (Pelicula pelicula : result) {
            System.out.println(pelicula.getTitulo() + " " + pelicula.getDirector());
        }
    }

    private static void consulta2() {
        List<Pelicula> peliculas = db.query(Pelicula.class);
        for (Pelicula pelicula : peliculas) {
            int cont = 0;
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            try {
                List<TickNormal> tickNormales = db.query(TickNormal.class);
                List<TickEspecial> tickEspeciales = db.query(TickEspecial.class);
                for (TickNormal tickNormal : tickNormales) {
                    if (tickNormal.getCodigopeli() == pelicula.getCodigo()
                            && tickNormal.getHorario().getFecha().getMonth() == mes) {
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


        System.out.println("2.- Director mas rentable: La empresa quiere saber quienes son los directores de pelculas que\n"
                + "dejan mas dinero en nuestros cines, para verificar publico objetivo y publicitarlos cuando\n"
                + "estrenen una nueva pelcula, por lo que debe mostrar el nombre del director, para cada mes,\n"
                + "de la pelcula que mas dinero recaudo en cada mes, tambien la cantidad y monto de ventas\n"
                + "mensuales en tickets para todo lo que va del 2012, en orden descendente de monto de ventas.\n"
                + "Resultado:");
    }
}
