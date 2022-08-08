package com.java;


public class JavaException {
	
	public static void main(String[] args) {
		try {
			int[] a=new int[10];
			a[11]=100;
			
		}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(" it is an array index out of bound exception");
				
			}
		System.out.println("rest of code");
		System.out.println("rest of code");
		System.out.println("rest of code");
		
	}

}
