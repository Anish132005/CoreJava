package in.com.Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Testdate2 {
public static void main(String[] args) {
		
		Date d = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				
				System.out.println(sdf.format(d));
				
				
	}

}

