package list;

import java.util.ArrayList;
import java.util.List;

//list of student
// 30%> pass%
class Student{
	int id;
	String name;
	int maxMarks;
	int marksObt;
	double percentage;
	public Student(int id,String name,int marksObt) {
		this.name = name;
		this.id = id;
		this.maxMarks = 500;
		this.marksObt = marksObt;
		this.percentage = ((double)marksObt/(double)maxMarks)*100;
	}
	@Override
	public String toString() {
		return "\nId : "+ id +",Nme : "+name+", Percentage : " + percentage;
	}
}
public class ListDemo {

	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>();
		students.add(new Student(1, "chan1", 312));
		students.add(new Student(2, "chan2", 149));
		students.add(new Student(3, "chan3", 315));
		students.add(new Student(4, "chan4", 212));
		students.add(new Student(5, "chan5", 412));
		students.add(new Student(6, "chan6", 112));
		students.add(new Student(7, "chan7", 321));
		
		System.out.println(students);
		int passCount =0;
		for(int i=0;i<students.size();i++) {
			if(students.get(i).percentage >= 30) {
				passCount++;
			}
		}
		System.out.println("Total Students : "+ students.size()+"\nPassed Students : "+ passCount);
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(20);
		list.add(14);
		System.out.println(list);
		list.add(2, 25);
		System.out.println(list);
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
		
		
		
	}
}
