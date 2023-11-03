package in.com.javabasics;

import java.util.ArrayList;

public class foreachloop {
 
	public static void main(String[] args) {
		int[]numbers= {1,2,3,4,5,6,7,8,9,10};
		for(int n:numbers) {
			System.out.println(n);
		}
		ArrayList<String>names=new ArrayList<String>();
		names.add("one");
		names.add("two");
		names.add("three");
		for(String n: names) {
			System.out.println(n);
		}
		
	}
}
