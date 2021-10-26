package CollectionAssignment;

import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class _1_TreeMap {
	String name, email;

	enum Gender {
		MALE, FEMALE, OTHER
	}

	Gender gender;

	public _1_TreeMap(String name, String email, Gender gen) {
		this.name = name;
		this.email = email;
		this.gender = gen;
	}

	public void display() {
		System.out.println("Name: " + this.name);
		System.out.println("Email: " + this.email);
		System.out.println("Gender: " + this.gender);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeMap<Long, _1_TreeMap> contacts = new TreeMap<Long, _1_TreeMap>();
		System.out.println("Enter the number of contacts to save:");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the number for set " +  (i + 1));
			long number = sc.nextLong();
			sc.nextLine();
			System.out.println("Enter the name for set " +  (i + 1));
			String name = sc.nextLine();
			System.out.println("Enter the email for set " + (i + 1));
			String email = sc.nextLine();

			Gender gen = null;
			while (true) {
				System.out.println("Enter the gender M for male, F for female, O for other for set " + (i + 1));
				char g = Character.toUpperCase(sc.next().charAt(0));
				switch (g) {
				case 'M':
					gen = Gender.MALE;
					break;
				case 'F':
					gen = Gender.FEMALE;
					break;
				case 'O':
					gen = Gender.OTHER;
					break;
				default:
					System.out.println("Invalid!");
				}
				if (gen != null)
					break;
			}

			contacts.put(number, new _1_TreeMap(name, email, gen));
		}
		System.out.println("Keys:-\n");
		for (Entry<Long, _1_TreeMap> tree : contacts.entrySet()) {
			System.out.println(tree.getKey());
		}
		System.out.println("\nValues:-\n");
		for (Entry<Long, _1_TreeMap> tree : contacts.entrySet()) {
			tree.getValue().display();
			System.out.println("==================================================");
		}
		System.out.println("\nKeys + Values:-\n");
		for (Entry<Long, _1_TreeMap> tree : contacts.entrySet()) {
			System.out.println("Mobile No: "+tree.getKey());
			 tree.getValue().display();
			 System.out.println("==================================================");
			 }
		sc.close();
	}

}
