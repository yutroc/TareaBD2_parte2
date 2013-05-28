import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import au.com.bytecode.opencsv.CSVReader;

public class Mapper {

	static CSVReader csv;

	static void readAllCSV(Class c) {
		String applicationDir = c.getProtectionDomain()
				.getCodeSource().getLocation().getPath();
		File folder = new File(applicationDir+"../test");
		File[] listOfFiles = folder.listFiles();
		
		for(File file : listOfFiles){
			String classname = capitalize(file);
			try {
				csv = new CSVReader(new FileReader(file.getAbsolutePath()));
				String[] row = csv.readNext();
				Class clasetabla = Class.forName("model."+classname);				
				Constructor<?> ctor = null;
				for(Constructor cr : clasetabla.getConstructors()){
					System.out.println(row.length + " "+ cr.getParameterTypes().length);
					if(cr.getParameterTypes().length == row.length)
						ctor = cr;
				}
								
				Object object = ctor.newInstance(row);
				System.out.println(object.toString());
				
				
				
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	private static String capitalize(File file){
		String longname = file.getName();
		String name = longname.substring(0, longname.lastIndexOf(".")).toLowerCase();
		final StringBuilder result = new StringBuilder(name.length());
		String[] words = name.split("_");
		for(int i=0,l=words.length;i<l;++i) {
		  result.append(Character.toUpperCase(words[i].charAt(0)))
		        .append(words[i].substring(1));

		}
		return result.toString();
	}

}
