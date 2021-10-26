package GenericsAssignment;

import java.util.HashSet;
import java.util.Scanner;

public class _1_HashSet {
	String id, name, department;
	double salary;

//	@Override
//	public String toString() {
//		return "ID: " + id + "\nNAME: " + name + "\nDEPARTMENT:" + department + "\nSALARY:" + salary;
//	}

	static public void display(HashSet<_1_HashSet> hs) {
		for(_1_HashSet h:hs){
			System.out.println("ID:"+h.id);
			System.out.println("NAME:"+h.name);
			System.out.println("DEPARTMENT:"+h.department);
			System.out.println("SALARY:"+h.salary);
			System.out.println();
		}
	}

	_1_HashSet(String id, String name, String department, double salary) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	public _1_HashSet() {
	}

	public static void main(String[] args) {
		HashSet<_1_HashSet> employee = new HashSet<_1_HashSet>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of employees");
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 1; i <= n; i++) {
			String id = sc.nextLine(), name = sc.nextLine(), department = sc.nextLine();
			double salary = sc.nextDouble();sc.nextLine();
			employee.add(new _1_HashSet(id, name, department, salary));
		}
		display(employee);
//		throws exception that HashSet is of type _1_HashSet thus other type cannot be added
//		_2_HashMap hm=new _2_HashMap();
//		employee.add(hm);
		sc.close();
	}

}
