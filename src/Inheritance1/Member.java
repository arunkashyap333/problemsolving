package Inheritance1;

public class Member {
	
	String name,address;
	int age,phone,salary;
	
	
	@Override
	public String toString() {
		return "Member [name=" + name + ", address=" + address + ", age=" + age + ", phone=" + phone + ", salary="
				+ salary + "]";
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getPhone() {
		return phone;
	}


	public void setPhone(int phone) {
		this.phone = phone;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	void printSalary() {
		System.out.println(salary);
	}

}
