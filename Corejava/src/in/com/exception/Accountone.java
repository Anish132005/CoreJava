package in.com.exception;

public class Accountone {

	private int balance;
	
	private String accountnumber;
	
	public Accountone () {
		System.out.println("the the the");
	}
	public Accountone (int balance, String Accountnumber) {
		System.out.println("anish ,anish, anish");
	}
	public void setBalance(int balance) {
		this.balance=balance;
	}
	public int getBalance() {
		return balance;
	}
	public void setAccountnumber(String accountnumber) {
		this.accountnumber=accountnumber;
	}
	public String getaccountnumber() {
		return accountnumber;
	}
	
	 public void deposite(int amount) {
		 int total = getBalance() + amount;
		 setBalance(total);
		 System.out.println("Balance after deposite "+ getBalance());
	 }
	 public void  Withdrawl(int amount)throws insufficentbalance{
		 int total = getBalance()- amount;
		 if (total < 2000) {
			 throw new  insufficentbalance();
			
		}
		 else {
			setBalance (total);
			System.out.println("balance after Withdral"+ getBalance());
			
		}
	 }
	
}
