package in.com.exception;

public class TestAccount {
public static void main(String[] args) {
	Accountone a = new Accountone();
	
	a.deposite(6000);
	try {
		a.Withdrawl(5000);
		
	} catch (Exception e) {
		System.out.println(e);
	}
}
}
