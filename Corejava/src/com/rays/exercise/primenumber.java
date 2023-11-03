package com.rays.exercise;

public class primenumber {
public static void main(String[] args) {
	
	int a = 13;
	int b =0;
	
	for (int i = 13; i < a; i++) {
		if (a % i == 0) {
			b++;
			
		}
		
	}
	if (b == 0) {
		System.out.println("it is prime.");
		
	}else {
		System.out.println("it is not prime");
	}
}
}
