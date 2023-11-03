package in.com.Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Testdatetostring {
public static void main(String[] args) {
		
		Date d = new Date();
		
	    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
		
		String s = sdf.format(d);
		
		System.out.println(s);
		
		
	}

}

