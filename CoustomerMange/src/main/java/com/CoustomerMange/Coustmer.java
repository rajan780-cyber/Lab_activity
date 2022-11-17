package com.CoustomerMange;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Coustmer")
public class Coustmer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int CoustmerId;
	@Column(length=100)
	private String name;
	@Column(name="number",length=50)
	private int Contactnumber;
	private String Address;
	public int getCoustmerId() {
		return CoustmerId;
	}
	public void setCustomerId(int CoustmerId) {
		this.CoustmerId = CoustmerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getContactnumber() {
		return Contactnumber;
	}
	public void setContactnumber(int contactnumber) {
		Contactnumber = contactnumber;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	@Override
	public String toString() {
		return "Coustmer [customerId=" + CoustmerId + ", name=" + name + ", Contactnumber=" + Contactnumber
				+ ", Address=" + Address + "]";
	}
	public Coustmer(int CoustmerId, String name, int contactnumber, String address) {
		super();
		this.CoustmerId = CoustmerId;
		this.name = name;
		Contactnumber = contactnumber;
		Address = address;
	}
	public Coustmer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
