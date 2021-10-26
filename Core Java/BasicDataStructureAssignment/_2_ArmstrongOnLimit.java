package BasicDataStructureAssignment;

import java.util.Scanner;

public class _2_ArmstrongOnLimit {

	public static void main(String[] args) {
		int a, b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two numbers for range");
		a=sc.nextInt();
		b=sc.nextInt();
		for(int i=a; i<=b; i++) {
			int x=0, temp=0, j=i;
			while(j!=0) {
				temp=j%10;
				j=j/10;
				x=x+(temp*temp*temp);
			}
			if(x==i)
				System.out.println(i);
		}
		sc.close();
	}

}
