package in.com.exception;

import javax.security.auth.login.LoginException;

public class Testloginexception {
public static void main(String[] args) {
		
		try {
			
			String name = "sunil";
			
			if(name.equals("admin")) {
				System.out.println("valid user......!!!");
				
			}else {
				LoginException e = new LoginException();
				throw e;
				
			}
			
		}catch(Exception e) {
			System.out.println(e);
			
		}
	}

}
