package in.com.Thread;

public class Account {
	private int balance = 0;
	public int getBalance() {
		try {
			Thread.sleep(200);
			
		} catch (InterruptedException e ) {
			// TODO: handle exception
		}
		return balance;
	}
	public void setBalance(int balance) {
		try {
			Thread.sleep(200);
			
		} catch (InterruptedException e ) {
		}
		this.balance=balance;
	}
	 

}

