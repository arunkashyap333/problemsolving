package Inheritance1;

public class MemberDemo {

//	Now, assign name, age, phone number, address and salary to an employee and 
//	a manager by making an object of both of these classes and print the same.
	public static void main(String[] args) {
		Manager man = new Manager();
		man.setName("chand");
		man.setAddress("abcd");
		man.setAge(28);
		man.setSalary(19999);
		man.setPhone(12890);
		System.out.println(man);
		
		Employee emp = new Employee();
		emp.setAddress("Hyd");
		emp.setAge(34);
		emp.setName("Arun");
		emp.setPhone(9087698);
		emp.setSalary(209909);
		System.out.println(emp);
	}
}
