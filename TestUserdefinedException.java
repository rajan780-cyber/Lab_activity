package com.java;

class InvalidAgeException  extends Exception  
{  
    public InvalidAgeException (String str)  
    {   
        super(str);  
    }  
}   
public class TestUserdefinedException
{  
  
    static void validate (int age) throws InvalidAgeException{    
       if(age < 18){  
  
        throw new InvalidAgeException("not eligible for voting");    
    }  
       else {   
        System.out.println("eligible for voting");   
        }   
     }    
  
    public static void main(String args[])  
    {  
        try  
        {   
            validate(13);  
        }  
        catch (InvalidAgeException ex)  
        {  
            System.out.println("Caught the exception");  
      
            System.out.println("Exception occured: " + ex);  
        }  
  
        System.out.println("rest of the code...");    
    }  
}  

