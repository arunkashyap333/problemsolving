package encapsulation;

public class EmployeeDemo {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setId(-100);
		emp.setName("chandan");
		emp.setSalary(10000);
		
		System.out.println(emp);
		
	}
}
