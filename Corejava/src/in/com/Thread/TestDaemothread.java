package in.com.Thread;

public class TestDaemothread {
public static void main(String[] args) {
		
		Daemothread t = new Daemothread();
		
		t.setDaemon(true);
 t.start();
 
 try {
	Thread.sleep(3000);
	
} catch (InterruptedException e ) {
}
System.out.println("chlo chle ");
System.out.println("chlo nahi chle ");
	}

}

