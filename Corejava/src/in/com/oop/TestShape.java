package in.com.oop;

import in.com.inheritance.Rectangle;

public class TestShape {
	public static void main(String[] args) {
		Shape s = new Shape();
		Rectangle r = new Rectangle();
				s.SetColor("red");
				s.Setborderwidth(10);
				r.setLength(20);
				r.setWidth(20);
				System.out.println(s.getColor());
				System.out.println(s.getborderwidth());
				System.out.println(r.getLength());
				System.out.println(r.getWidth());
	
	}
}