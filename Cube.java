import java.util.Scanner;
 public class Cube {                                 

   public static void main(String[] args)

{
    int i,no,cube;
    System.out.println("Enter a No :- ");
    Scanner sc = new Scanner(System.in);     
		    no = sc.nextInt();

     for(i=1;i<=no;i++)                       
     {

         cube = i*i*i;                		
         System.out.println("no is " +i+ " cube of no :-" +i+" is "  +cube );


    }

 }
} 