package CollectionAssignment;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class _3_Employee implements Comparable<_3_Employee> {
	int id;
	String name, department;
	long salary;

	_3_Employee(int id, String name, String department, long salary) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	public static void sorting(Set<_3_Employee> tree, char ch) {
		Set<_3_Employee> set = new TreeSet<_3_Employee>(new Comparator<_3_Employee>() {

			@Override
			public int compare(_3_Employee o1, _3_Employee o2) {
				if (Character.compare(ch, 'a') == 0)
					return Integer.compare(o1.id, o2.id);
				else if (Character.compare(ch, 'b') == 0)
					return o1.name.compareTo(o2.name);
				else if (Character.compare(ch, 'c') == 0)
					return o1.department.compareTo(o2.department);
				else
					return Long.compare(o1.salary, o2.salary);
			}

		});
		set.addAll(tree);
		display(set);
	}

	public static void display(Set<_3_Employee> set) {
		int n=1;
		for (_3_Employee tree : set) {
			System.out.println(n+"---> ID: " + tree.id + ", NAME: " + tree.name + ", DEPARTMENT: " + tree.department
					+ ", SALARY:" + tree.salary);
			++n;
			}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<_3_Employee> set = new TreeSet<>();
		int id[] = { 245423, 8347, 987834, 34543, 345434, 56564, 23459, 43245, 67896, 723434 };
		String name[] = { "Vijaya", "Lakshmi", "Roja", "Monisha", "Kavitha", "Vidhya", "Anitha", "Bharathi", "Prameela",
				"Sakshi" };
		String department[] = { "Developer", "Testing", "Support", "Marketing", "Support", "Developer", "Testing",
				"Business", "Developer", "Testing" };
		long salary[] = { 1000000, 2000000, 300000, 200000, 100000, 500000, 700000, 12500000, 600000, 500000 };
		for (int i = 0; i < 10; i++) {
			set.add(new _3_Employee(id[i], name[i], department[i], salary[i]));
		}
		while (true) {
			System.out.println(
					"Enter \n a for sort by ID\n b for sort by NAME\n c for sort by DEPARTMENT\n d for sort by SALARY");
			char choice = Character.toLowerCase(sc.next().charAt(0));
			if (Character.compare(choice, 'a') == 0 || Character.compare(choice, 'b') == 0
					|| Character.compare(choice, 'c') == 0 || Character.compare(choice, 'd') == 0) {
				sorting(set, choice);
				break;
			}
			System.out.println("Invalid!");
		}
		sc.close();
	}

	@Override
	public int compareTo(_3_Employee o) {
		return Integer.compare(id, o.id);
		// return o.string.compareTo(this.string);
	}

}
