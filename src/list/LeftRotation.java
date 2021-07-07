package list;

import java.util.ArrayList;
import java.util.List;

public class LeftRotation {

	public static void main(String[] args) {
		
		List<Integer> num=new ArrayList<>();
		for(int i=0;i<15;i++) {
			num.add(i+1);
		}
		System.out.println(num);
		System.out.println(rotate(num, 7));
	}
	
	private static List<Integer> rotate(List<Integer> inp, int d){
		int size = inp.size();
		d = d%size;
		List<Integer> list2=new ArrayList<>();
		
		for(int j=d;j<inp.size();j++) {
			list2.add(inp.get(j));
		}
		
		for(int k=0;k<d;k++) {
			
			list2.add(inp.get(k));
		}
		return list2;
	}
	
}
