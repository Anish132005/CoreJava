package in.com.javabasics;

public class Teststring {
public static void main(String[] args) {
	String name = "anish malviya ";
	
	System.out.println("7th character is = "+name.charAt(6));
	System.out.println("string length is = "+name.length());
	System.out.println("anish index is ="+name.indexOf("Anish"));
	System.out.println("first i position ="+name.indexOf("i"));
	System.out.println("last h position is ="+name.lastIndexOf("h"));
	System.out.println("a is replace by e ="+name.replace("a", "s"));
	System.out.println("small later = "+name.toLowerCase());
	System.out.println("capital later ="+name.toUpperCase());
	System.out.println("start with anish ="+name.startsWith("Anish"));
	System.out.println("ends with malviya ="+name.endsWith("malviya"));
	System.out.println("substring = "+name.substring(2));

}


	
}

