package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Pascaltriangle {

	public static void main(String[] args) {
		int number = 5;
		List<List<Integer>> out = solverPAscal(number);
		System.out.println(out);
	}
	
	private static List<List<Integer>> solverPAscal(int num) {
		List<List<Integer>> res = new ArrayList<>();
		List<Integer> temp;
		
		temp = new ArrayList<>(1);
		temp.add(1);
		res.add(temp);
		temp = null;
		List<Integer> inter;
		for(int i=1;i<num;i++) {
			temp = new ArrayList<>(i+1);
			temp.add(1);
			temp.add(1);
			inter = res.get(i-1);
			for(int j=1;j<i;j++) {
				
				temp.add(j, inter.get(j) + inter.get(j-1));
			}
			res.add(temp);
			temp = null;
		}
		return res;
	}
}
