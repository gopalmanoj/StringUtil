package com.custome.immutable;

class Address implements Cloneable
{
	public String addressType;
	   public String address;
	   public String city;
	public Address(String addressType, String address, String city) {
		super();
		this.addressType = addressType;
		this.address = address;
		this.city = city;
	}
	public String getAddressType() {
		return addressType;
	}
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	   public Object clone() throws CloneNotSupportedException
	   {
		   return super.clone();
	   }
}
class Employee
{
	private final String empName;
	   private final int age;
	   private final Address address;
	   public Employee(String name, int age, Address address) {
	      super();
	      this.empName = name;
	      this.age = age;
	      this.address = address;
	   }
	   public String getEmpName() {
		      return empName;
		   }
		   public int getAge() {
		      return age;
		   }
		   
		   public Address getAddress() throws CloneNotSupportedException
		   {
			   return (Address)address.clone();
		   }
}
public class CustomeImmutable {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee emp=new Employee("Gopal", 15, new Address("Home", "UP","Vrindavan"));
		
		System.out.println(emp.getEmpName()+"\t"+emp.getAge()+"\t"+
		emp.getAddress().addressType+"\t"+emp.getAddress().address+"\t"+emp.getAddress().city); 
		
		Address address=emp.getAddress(); 
		address.setAddress("Duwarika");
		address.setAddressType("Work");
		address.setCity("Ahmadabad"); 

		System.out.println(emp.getEmpName()+"\t"+emp.getAge()+"\t"+
				emp.getAddress().addressType+"\t"+emp.getAddress().address+"\t"+emp.getAddress().city);
	}

}
