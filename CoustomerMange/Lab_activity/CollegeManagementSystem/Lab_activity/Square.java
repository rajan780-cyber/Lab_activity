package test;

abstract class Square {
	    private String color;
	    private boolean filled;

	    public Square() {       
	        color = "green";
	        filled = true;
	    }

	    Square(String color, boolean filled) {
	    	this.color = color;
	        this.filled = filled;
	    }

	    public String getColor() {
	        return color;
	    }

	    public void setColor(String color) {
	        this.color = color;
	    }

	    public boolean Filled() {
	        return filled;
	    }

	    public void setFilled(boolean filled) {
	        this.filled = filled;
	    }

	    public String toString() {  
	        if(this.filled==true)   
	        {
	        	return "shap with colour " +this.color+" and filled";
	        }
	        else
	        {
	        	return "shap with colour " +this.color+" and not filled";
	        	
	        }
	    }
	  abstract double getarea();  //it is not possible to create abstract class
	   
		public static void main(String[] args) {
			Square square = new Square();
	        

		}

	}
	class Circle extends Square
	{
		double getarea()
		{
			return 0;
		}
	}
	class Rectagle extends Square
	{
		int length;
		int width;
		public Rectagle(int length, int width) {
			this.length = length;
			this.width = width;
		}

		double getarea()
		{
			return 0;
		}
		
	}
	class Square1 extends Rectagle
	{
		Square1()
		{
			super(20,20);
			System.out.println("length :- "+super.length);
			System.out.println("width :-"+super.width);
		}
		public static void main(String args[])
		{
			Square1 s = new Square1();
			if(s.length==s.width)
			{
				System.out.println("this rec class is square");
			}
		}
	}

