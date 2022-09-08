package thread;


	import java.util.Scanner;
	import java.io.File;
	import java.io.FileNotFoundException;
	public class largestWord {
	
	     public static void main(String [ ] args) 
	    		 throws FileNotFoundException {
	              new largestWord().findLongestWords();
	         }

	     public String findLongestWords() 
	    		 throws FileNotFoundException {
	    	 largestFile skr = new largestFile();
	    	 
	 	    skr.readMax("RajanP.txt");
	 	   
	 	   System.out.println("\n");
	 	  System.out.println("The longest word in this text file is:- ");
	 	 
	       String longest_word = "";
	       String current;
	       Scanner sc = new Scanner(new File("RajanP.txt"));


	       while (sc.hasNext()) {
	          current = sc.next();
	           if (current.length() > longest_word.length()) {
	             longest_word = current;
	           }

	       }
	         System.out.println("\n"+longest_word);
	            return longest_word;
	            }
	}


