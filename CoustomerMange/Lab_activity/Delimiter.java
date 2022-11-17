package scanner;

import java.util.Scanner;

public class Delimiter {
	public static void main(String [] args) {
		
		Scanner input1=new Scanner("Java scanner Java Rajan pushpakar");
		input1.useDelimiter("Java");
		while(input1.hasNext()) {
			System.out.println(input1.next());
		}
		input1.close();
	System.out.println("-----------------");
	
	Scanner input2=new Scanner("Java scanner Java Rajan pushpakar");
	input2.useDelimiter("\\s");
	while(input2.hasNext()) {
		System.out.println(input2.next());
	}
	input2.close();
	System.out.println("-----------------");
	
	Scanner input3=new Scanner("Java/scanner/Java/Rajan pushpakar");
	input3.useDelimiter("/");
	while(input3.hasNext()) {
		System.out.println(input3.next());
	}
	input3.close();
	System.out.println("-----------------");

	String input5="1 fish 2 fish red fish blue fish";
	Scanner sc=new Scanner (input5).useDelimiter("\\s*fish\\s*");
	System.out.println(sc.nextInt());
	System.out.println(sc.nextInt());
	System.out.println(sc.next());
	System.out.println(sc.next());
	
	sc.close();
	}

}
