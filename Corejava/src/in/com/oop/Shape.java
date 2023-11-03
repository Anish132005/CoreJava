package in.com.oop;

public class Shape {
	private String color=null;
	private int  borderwidth = 0;
	
	
	public void SetColor(String color) {
		this.color= color;
		
	}
	public String getColor() {
		return color;
	}
	
	public  void Setborderwidth( int borderwidth) {
		this.borderwidth= borderwidth;
		
	}
	public int getborderwidth() {
		return borderwidth;
	}
	

}
