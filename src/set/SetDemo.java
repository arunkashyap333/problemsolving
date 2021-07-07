package set;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
	public static void main(String[] args) {
		Set<Integer> sets = new HashSet<>();
		sets.add(1);
		sets.add(100);
		sets.add(3);
		sets.add(100);
		System.out.println(sets);
	}
}
