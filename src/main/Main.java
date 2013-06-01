package main;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;

import model.Mapper;

public class Main {

	public static ObjectContainer db;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		db = Db4oEmbedded.openFile(
				Db4oEmbedded.newConfiguration(), "BD/test2.db");
		Mapper.readAllCSV("../CSV/nivel 1", Main.class, db);
		Mapper.readAllCSV("../CSV/nivel 2", Main.class, db);
		Mapper.readAllCSV("../CSV/nivel 3", Main.class, db);
		db.close();
	}
}
