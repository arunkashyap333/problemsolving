package HackersRank;

import java.util.ArrayList;
import java.util.List;

public class Bribe {
	
	public static void main(String[] args) {
		
		List<Integer> l1 = new ArrayList<Integer>();
//		l1.add(2);l1.add(1);l1.add(5);l1.add(3);l1.add(4);	
//		l1.add(2);l1.add(5);l1.add(1);l1.add(3);l1.add(4);
		l1.add(1);
		l1.add(2);
		l1.add(5);
		l1.add(3);
		l1.add(7);
		l1.add(8);l1.add(6);
		l1.add(4);
//		1 2 5 3 7 8 6 4
		minimumBribes(l1);
	}

	public static void minimumBribes(List<Integer> q) {
		int ans =0;
		for(int i=q.size()-1;i>=0;i--) {
			System.out.println("i -> "+ q.get(i));
			if(q.get(i) - (i+1) > 2) {
				System.out.println("hhhsh");
				return;
			}
			for(int j= Math.max(0, q.get(i)-2);j<i;j++) {
				System.out.print(q.get(j)+" ");
				if(q.get(j) > q.get(i)) {
					ans++;
				}
			}
			System.out.println();
		}
		System.out.println(ans);
	}
}

