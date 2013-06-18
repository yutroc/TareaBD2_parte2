package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;
import java.sql.Timestamp;
import java.text.Normalizer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.regex.Pattern;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;

import au.com.bytecode.opencsv.CSVReader;
import main.Main;

public class Mapper {

	static CSVReader csv;

	public static void readAllCSV(String sFolder, Class c, ObjectContainer db) {
		String applicationDir = c.getProtectionDomain()
				.getCodeSource().getLocation().getPath();
		File folder = new File(sFolder);
                
                System.out.println(folder);
		File[] listOfFiles = folder.listFiles();

		for (File file : listOfFiles) {
			String classname = capitalize(file.getName());
			
			try {
				csv = new CSVReader(new FileReader(file.getAbsolutePath()));
				String[] cabecera = csv.readNext();
				Class clasetabla = Class.forName("model." + classname);
				String[] row;
				while ((row = csv.readNext()) != null) {
					// Obtener el constructor Correspondiente
					Constructor<?> ctor = getConstructor(clasetabla, row);
					Object object = ctor.newInstance();
					for (int i = 0; i < cabecera.length; i++) {
						for (Method method : clasetabla.getDeclaredMethods()) {
							// System.out.println("Field "+method.toString());
						}

						Method m = clasetabla.getMethod("set"
								+ capitalize(cabecera[i]), String.class);
						m.invoke(object, new Object[] { row[i] });
					}

					//System.out.println(object.toString());
					try {
						db.store(object);
					}catch(Exception e){
						e.printStackTrace();
					}					
					finally {
						//db.close();
					}
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Done - " + sFolder);
	}

	private static Constructor<?> getConstructor(Class clasetabla, String[] row) {
		for (Constructor cr : clasetabla.getConstructors()) {
			if (cr.getParameterTypes().length == 0)// row.length
				return cr;
		}
		return null;
	}

	public static String capitalize(String longname) {
		String name = longname;
		if (name.contains(".")) {
			name = name.substring(0, name.lastIndexOf("."));
		}
		name = name.toLowerCase();
		// System.out.println(name);
		final StringBuilder result = new StringBuilder(name.length());
		String[] words = name.split("_");
		for (int i = 0, l = words.length; i < l; ++i) {
			result.append(Character.toUpperCase(words[i].charAt(0))).append(
					words[i].substring(1));
		}
		return remove1(result.toString());
	}
	
	public static String remove1(String input) {

		input = input.replace ('á','a'); 
		input = input.replace ('é','e'); 
		input = input.replace ('í','i'); 
		input = input.replace ('ó','o'); 
		input = input.replace ('ú','u'); 
	    return input;
	}//remove1
	
	private static String remove2(String input) {
	    // Descomposicion canonica
	    String normalized = Normalizer.normalize(input, Normalizer.Form.NFD);
	    // Nos quedamos unicamente con los caracteres ASCII
	    Pattern pattern = Pattern.compile("\\p{ASCII}+");
	    return pattern.matcher(normalized).replaceAll("");
	}

	public static Date toDate(String fechas) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date date = new Date(format.parse(fechas).getTime());
			//System.out.println(fechas+ " " + date.toString());
			return date;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;

	}

	public static Timestamp toTime(String times) {
		SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
		try {
			return new Timestamp(format.parse(times).getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;

	}

}
