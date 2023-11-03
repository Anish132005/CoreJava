package com.rays.exercise;

public class Armstrong {
public static void main(String[] args) {
	
	int nu = 153;
	int r;
	int sum =0;
	int n= nu;
	
	while(n>0) {
		r=n%10;
		
		sum= sum +(r*r*r);
		n=n/10;
	}
	
	if (nu==sum) {
		System.out.println("yes");
		
		
	}else {
		System.out.println("no");
		
	}
	
}
}
