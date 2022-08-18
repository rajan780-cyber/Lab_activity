package test;

	class Encapsulation{
	    private int AccountNumber;
	    private String empName;
	    private int empAge;
	    private String empEmail;
	    private int Ammount;

	   
	    public int getEmpAccountNumber1(){
	        return AccountNumber;
	    }
	    public int getEmpAmmount(){
	        return Ammount;
	    }


	    public String getEmpName(){
	        return empName;
	    }

	    public int getEmpAge(){
	        return empAge;
	    }
	    public String getEmpEmail(){
	        return empEmail();
	    }

	    private String empEmail() {
			
			return empEmail;
		}

		public void setEmpAge(int newValue){
	        empAge = newValue;
	    }

	    public void setEmpName(String newValue){
	        empName = newValue;
	    }
	    public void setEmpEmail(String newValue){
	      empEmail = newValue;
	    }
	    public void setEmpAccountNumber(int newValue){
	    	AccountNumber = newValue;
	    }
	    public void setEmpAmmount(int newValue){
	    	Ammount = newValue;
	    }

		

		
	}
	public class Account{
	    public static void main(String args[]){
	         Encapsulation obj = new Encapsulation();
	         obj.setEmpName("Rajan");
	         obj.setEmpAge(32);
	         obj.setEmpAccountNumber(112233);
	         obj.setEmpAmmount(10000);
	         obj.setEmpEmail("abc@gmail.com");
	         System.out.println("Employee Name: " + obj.getEmpName());
	         System.out.println("Employee AccountNumber: " + obj.getEmpAccountNumber1());
	         System.out.println("Employee Age: " + obj.getEmpAge());
	         System.out.println("Employee Email: " + obj.getEmpEmail());
	         System.out.println("Employee Ammount: " + obj.getEmpAmmount());
	    } 
	}


