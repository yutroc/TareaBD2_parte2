package main;

import java.io.File;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Query;

import model.Empleado;
import model.EncargadoSucursal;
import model.Horario;
import model.Mapper;
import model.Pelicula;
import model.Sucursal;
import model.TickEspecial;
import model.TickNormal;

public class Main {

	public static ObjectContainer db;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean cargarBD = false;
		if(cargarBD){
			File f = new File("BD/test3.db");
			f.delete();
		}
		db = Db4oEmbedded.openFile(
				Db4oEmbedded.newConfiguration(), "BD/test3.db");
		
		if(cargarBD){
			Mapper.readAllCSV("../CSV", Main.class, db);
			db.commit();
			List empleados = db.query(Empleado.class);
			for(int i=0; i< empleados.size(); i++ ){
				Empleado empleado = (Empleado) empleados.get(i);
				Empleado proto= new Empleado();
				proto.setRute(empleado.getRutsupervisor());
				List lista = db.queryByExample(proto);
				Sucursal sproto = new Sucursal();
				sproto.setNumerosu(empleado.getNumsucursal());
		        Sucursal sucursal = (Sucursal) Main.db.queryByExample(sproto).next();
		        empleado.setSucursal(sucursal);
				if(lista.size() > 0){
					Empleado l =(Empleado) ( lista.get(0));
					empleado.setSupervisor(l);
					db.store(empleado);

					db.commit();
				}
			}
			db.commit();		
			List encargado_sucursal = db.query(EncargadoSucursal.class);
			for(int i=0; i< encargado_sucursal.size(); i++ ){
				EncargadoSucursal encargado = (EncargadoSucursal) encargado_sucursal.get(i);
				Empleado proto= new Empleado();
				proto.setRute(encargado.getRute());
				List lista = db.queryByExample(proto);
				if(lista.size() > 0){
					Empleado l =(Empleado) ( lista.get(0));
					encargado.setEmpleado(l);
					db.store(encargado);

					db.commit();
				}
				Query query=db.query();
				query.constrain(Sucursal.class);
				query.descend("rutEncargado").equals(encargado.getRute());		
				ObjectSet result=query.execute();
				Sucursal next = (Sucursal)result.next();
				next.setEncargado(encargado);
				db.store(next);	

				db.commit();
			}	
			//Relacion de ticket con pelicula
			List<TickNormal> tickNormal = db.query(TickNormal.class);
			for(int i=0; i< tickNormal.size(); i++ ){
				Horario hproto = new Horario();
				hproto.setCodigoh(""+tickNormal.get(i).getCodigoh());
				Horario h = (Horario) db.queryByExample(hproto).next();
				Pelicula pproto = new Pelicula();
				pproto.setCodigo(""+tickNormal.get(i).getCodigopeli());
				Pelicula p = (Pelicula) db.queryByExample(pproto).next();
				p.addTickNormal(tickNormal.get(i));
				h.addTickNormal(tickNormal.get(i));
				tickNormal.get(i).setHorario(h);
				tickNormal.get(i).setPelicula(p);
				db.store(tickNormal.get(i));
				db.store(p);
				db.store(h);
				db.commit();
			}
			
			List<TickEspecial> tickEspecial = db.query(TickEspecial.class);
			for(int i=0; i< tickEspecial.size(); i++ ){
				Horario hproto = new Horario();
				hproto.setCodigoh(""+tickEspecial.get(i).getCodigoh());
				Horario h = (Horario) db.queryByExample(hproto).next();
				Pelicula pproto = new Pelicula();
				pproto.setCodigo(""+tickEspecial.get(i).getCodigopeli());
				Pelicula p = (Pelicula) db.queryByExample(pproto).next();
				p.addTickEspecial(tickEspecial.get(i));
				h.addTickEspecial(tickEspecial.get(i));
				tickEspecial.get(i).setHorario(h);
				tickEspecial.get(i).setPelicula(p);
				db.store(tickEspecial.get(i));
				db.store(p);
				db.store(h);
				db.commit();
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
		for(Pelicula pelicula : peliculas){
			int visitas = 0;
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			Date inicio = null;
			Date fin = null;
			try {
				inicio = new Date(format.parse("2012-08-01").getTime());
				fin = new Date(format.parse("2012-08-31").getTime());				
				
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for(TickEspecial ticket : pelicula.getTickEspecial()){
				//System.out.println("\t"+ticket.getHorario().getFecha());
				if(ticket.getHorario().getFecha().after(inicio) && ticket.getHorario().getFecha().before(fin) ){
					visitas++;
				}
			}
			for(TickNormal ticket : pelicula.getTickNormal()){
				//System.out.println("/t"+ticket.getHorario().getFecha());
				if(ticket.getHorario().getFecha().after(inicio) && ticket.getHorario().getFecha().before(fin) ){
					visitas++;
				}
			}
			if (visitas > 0 && visitas < 100 && (pelicula.getClasificacion().contains("13") || pelicula.getClasificacion().contains("15") || pelicula.getClasificacion().contains("18")))
				result.add(pelicula);
			System.out.println(pelicula.toString() + " " + pelicula.getTickEspecial().size() + " " + pelicula.getTickNormal().size());
		}
		
		for(Pelicula pelicula : result){
			System.out.println(pelicula.getTitulo() + " " + pelicula.getDirector());
		}
	}
}
