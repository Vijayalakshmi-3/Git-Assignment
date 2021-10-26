package BasicDataStructureAssignment;
import java.util.Scanner;

public class _1_ArmstrongOrNot {

	public static void main(String[] args) {
		int a, b, temp=0, x=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		a=sc.nextInt();
		b=a;
		while(b!=0) {
			temp=b%10;
			b=b/10;
			x=x+(temp*temp*temp);
		}
		if(x==a)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not Armstrong Number");
		sc.close();
	}

}
