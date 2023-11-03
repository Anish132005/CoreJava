package in.com.oop;

public class Testbalance {

	public static void main(String[] args) {
		
		Balance b = new Balance();
		
		b.setbalance(1500);
		b.setdeposite(3000);
		b.setwithdrawl(500);
		
		
		System.out.println(b.getbalance());
		System.out.println(b.getdeposite());
		System.out.println(b.getwithdrawl());
	}
}
