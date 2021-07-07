package Inheritance;

public class ParentChildDemo {

	public static void main(String[] args) {
//		1 - method of parent class by object of parent class
//		2 - method of child class by object of child class
//		3 - method of parent class by object of child class.
		Parent p = new Parent();
		Child c = new Child();
		p.print();
		c.print();
		
		Parent pc = new Child();
		pc.print();
	}
}
