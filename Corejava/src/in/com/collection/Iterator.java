package in.com.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Iterator {
public static void main(String[] args) {
	Collection c = new ArrayList();
	
	c.add("anish");
	c.add("manthan");
	c.add("Shivam");
	

	java.util.Iterator it = c.iterator();
	
	while(it.hasNext()) {
	Object o = it.next();
		
		System.out.println(o);
	}
}

}

