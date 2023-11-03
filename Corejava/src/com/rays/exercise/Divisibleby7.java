package com.rays.exercise;

public class Divisibleby7 {
public static void main(String[] args) {
	int sum = 0;
	for (int i = 101; i < 200; i++) {
		if (i % 7==0) {
			sum += i;
			
		}
	}
	System.out.println("100 to 200 =  "+ sum);
}
}
