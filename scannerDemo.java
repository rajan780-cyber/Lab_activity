package scanner;

import java.util.Scanner;

public class scannerDemo {
	public static void main(String [] args) {
	Scanner input=new Scanner("Java/scanner/Java/Rajan pushpakar");
	input.useDelimiter("/");
	while(input.hasNext()) {
		System.out.println(input.next());
	}
	input.close();

}
	

}
