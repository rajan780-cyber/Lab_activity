
import java.util.List;
import java.util.Scanner;
public class Swap {  
		int a, b;  

   void swapNum(Swap s)  
   {  
	   int t;   
		t = s.a;   
		s.a = s.b; 
		s.b = t;  
		}  
	public static void main(String args[])   
		{  
		  
		Swap t = new Swap();   
		Scanner sc = new Scanner(System.in);                
		System.out.print("Enter the first number: ");  
		t.a = sc.nextInt();  
		System.out.print("Enter the second number: ");  
		t.b = sc.nextInt();  
		 
		t.swapNum(t);  
		  
		System.out.println("After swapping: a= " + t.a + ", b= " + t.b);  	
		}  
}


