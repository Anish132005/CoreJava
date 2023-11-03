package in.com.Thread;

public class PriorityThread extends Thread{
	
	
	public PriorityThread(String name) {
		super(name);
		
		
	}
	public void run () {
		for (int i = 0; i <=50; i++) {
			System.out.println( i +getName());
			
		}
	} 

}
