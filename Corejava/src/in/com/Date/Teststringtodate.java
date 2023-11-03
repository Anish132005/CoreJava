package in.com.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Teststringtodate {
	public static void main(String[] args) throws ParseException {
		
	
	String str = "07/07/2011";
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	Date d = sdf.parse(str);
	
	System.out.println(d);
	
	
	
	}


}

