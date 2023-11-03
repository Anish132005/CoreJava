package in.com.Thread;

public class HelloRunnable implements Runnable{
	
private String name =   null;


public  HelloRunnable( String  n ) {
	this.name= n;
	
}

	@Override
	public void run() {
		for (int i = 0; i <=50; i++) {
			
			System.out.println(i +name);
			
			
		}
		
	} 

}
