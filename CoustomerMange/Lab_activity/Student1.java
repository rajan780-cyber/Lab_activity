package javainnerclass;

public class Student1 implements java.io.Serializable {
	private int id;
	private String name;
	public Student1() {
		System.out.println("no argument constructor");
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
