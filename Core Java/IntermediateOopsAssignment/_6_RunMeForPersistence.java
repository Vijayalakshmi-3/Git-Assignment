package IntermediateOopsAssignment;

import java.util.Scanner;

public class _6_RunMeForPersistence {

	public static void main(String[] args) {
		_6_Persistence per;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 for file and 2 for database");
		int n=sc.nextInt();
		if(n==1) {
			per= new _6_FilePersistence();
			per.persist();
			System.out.println("File: "+per.file+"\nDatabase: "+per.database);
			}
		else if(n==2) {
			per=new _6_DatabasePersistence();
			per.persist();
			System.out.println("File: "+per.file+"\nDatabase: "+per.database);
			}
			sc.close();
	}

}
