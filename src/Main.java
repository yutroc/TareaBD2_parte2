import java.sql.Date;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import au.com.bytecode.opencsv.CSVReader;


public class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mapper.readAllCSV(Main.class);
	}
	
	private static Date toDate(String fechas){
		SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-DD");
		try {
			return new Date(format.parse(fechas).getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
		
	}
	
	private static Timestamp toTime(String times){
		SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-DD");
		try {
			return new Timestamp(format.parse(times).getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
		
	}

}
