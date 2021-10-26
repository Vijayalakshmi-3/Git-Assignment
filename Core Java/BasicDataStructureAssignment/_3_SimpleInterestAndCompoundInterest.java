package BasicDataStructureAssignment;
import java.util.Scanner;
public class _3_SimpleInterestAndCompoundInterest {

	public static void main(String[] args) {
		double p, n, r,si,ci;
        Scanner s=new Scanner (System. in);
        System.out.println("Enter the amount:");
        p=s.nextDouble( );
        System. out. println("Enter the No. of years:");
        n=s.nextDouble( );
        System. out. println("Enter the Rate of  interest");
        r=s.nextDouble( );
        si=(p*n*r)/100;
        ci=p*Math.pow(1.0+r/100.0,n)-p;
        System.out. println("Amount="+p );
        System. out. println("No. of years="+n);
        System. out. println("Rate of interest="+r);
        System.out.println("Simple Interest="+si);
        System.out. println("Compound Interest="+ci);
        s.close();
	}

}
