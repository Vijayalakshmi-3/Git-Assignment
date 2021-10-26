package BasicDataStructureAssignment;

import java.util.Scanner;

public class _5_IncomeTaxCalculations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter current CTC:");
		long CTC=sc.nextLong();
		long tax=0;
		if(CTC>=0 && CTC<=180000)
			tax=0;
		else if(CTC>=180001 && CTC<=300000)
			tax=CTC*10/100;
		else if(CTC>=300001 && CTC<=500000)
			tax=CTC*20/100;
		else if(CTC>=500001 && CTC<=1000000)
			tax=CTC*30/100;
		System.out.println("Tax amount: "+tax);
		sc.close();
	}

}
