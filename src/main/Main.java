package main;

import java.io.File;
import java.util.List;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;

import model.Empleado;
import model.Mapper;

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
		db.commit();
		Mapper.readAllCSV("../CSV/nivel 4", Main.class, db);
		
		
		db.close();
	}
}
