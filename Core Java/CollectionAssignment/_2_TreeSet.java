package CollectionAssignment;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class _2_TreeSet implements Comparable<_2_TreeSet> {
	String string;

	_2_TreeSet(String string) {
		this.string = string;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<_2_TreeSet> s = new TreeSet<>();
		System.out.println("Enter 10 names:");
		for (int i = 0; i < 10; i++) {
			s.add(new _2_TreeSet(sc.nextLine()));
		}
		System.out.println("Printing before adding duplicate set:");
		for (_2_TreeSet tree : s)
			System.out.println(tree.string);
		for (_2_TreeSet tree : s)
			s.add(tree);
		System.out.println("After adding all 10 objects again to the same set:");
		for (_2_TreeSet tree : s)
			System.out.println(tree.string);
		sc.close();
	}

	@Override
	public int compareTo(_2_TreeSet o) {
			return this.string.compareTo(o.string);
		//return o.string.compareTo(this.string);
	}

}
