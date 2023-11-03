package in.com.javabasics;

public class Stringcount {
public static void main(String[] args) {

	String name = "core java";
	
	int count = 0;
	
	for (int i = 0; i < name.length(); i++) {
		
		if(name.charAt(i) == 'e') {
			
			count++;
		}
		
	}
	System.out.println(count);
}


}


