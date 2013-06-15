package main;

import java.io.File;
import java.util.List;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Query;

import model.Empleado;
import model.EncargadoSucursal;
import model.Mapper;
import model.Sucursal;

public class Main {

	public static ObjectContainer db;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("BD/test3.db");
		f.delete();
		db = Db4oEmbedded.openFile(
				Db4oEmbedded.newConfiguration(), "BD/test3.db");
		Mapper.readAllCSV("../CSV/nivel 1", Main.class, db);
		Mapper.readAllCSV("../CSV/nivel 2", Main.class, db);
		Mapper.readAllCSV("../CSV/nivel 3", Main.class, db);
		db.commit();
		List empleados = db.query(Empleado.class);
		for(int i=0; i< empleados.size(); i++ ){
			Empleado empleado = (Empleado) empleados.get(i);
			Empleado proto= new Empleado();
			proto.setRute(empleado.getRutsupervisor());
			List lista = db.queryByExample(proto);
			if(lista.size() > 0){
				Empleado l =(Empleado) ( lista.get(0));
				empleado.setSupervisor(l);
				db.store(empleado);
			}
		}
		Mapper.readAllCSV("../CSV/nivel 4", Main.class, db);
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
			}
			Query query=db.query();
			query.constrain(Sucursal.class);
			query.descend("rutEncargado").equals(encargado.getRute());		
			ObjectSet result=query.execute();
			Sucursal next = (Sucursal)result.next();
			next.setEncargado(encargado);
			db.store(next);			
		}	
		db.commit();
		Mapper.readAllCSV("../CSV/nivel 5", Main.class, db);
		Mapper.readAllCSV("../CSV/nivel 6", Main.class, db);
		db.commit();
		db.close();
	}
}
