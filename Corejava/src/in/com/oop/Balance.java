package in.com.oop;

public class Balance {

	
	private int balance =0;
	private int deposite =0;
	private int withdrawl =0;
	
	public void setbalance(int balance) {
		this.balance= balance;
	}
	public int getbalance() {
		return balance;
	}
	 public void  setdeposite(int deposite) {
		 this.deposite = getbalance() + deposite;
	 }
	 
	 public int getdeposite() {
		 return deposite;
	 }
	 
	 public void setwithdrawl(int withdrawl) {
		 this.withdrawl = getdeposite() - withdrawl;
	 }
	 
	 public int getwithdrawl() {
		 return withdrawl;
	 }
	 
	 
}
