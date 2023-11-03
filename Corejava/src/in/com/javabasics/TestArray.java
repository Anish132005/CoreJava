package in.com.javabasics;

public class TestArray {
public static void main(String[] args) {
	int[]table1= {1,2,3,4,5,6,7};
	int[]table2= new int[10];
	for (int i = 0; i < table2.length; i++) {
		table2[i]=2*(i+1);
		
	}
	for(int i:table2) {
		System.out.println(i);
	}
		
}
}

class testarray2{
	public static void main(String[] args) {
		int[][]table = new int[10][10];
		for (int i = 0; i < table.length; i++) {
		for (int j = 0; j < table.length; j++) {
			table[i][j] = (i+j)*(j+1);
			System.out.println(table[i][j]+"\t");
			System.out.println();
			System.out.println();
			
			
		}	
			
			
		}
	}
}