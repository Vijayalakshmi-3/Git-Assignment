package Assignment_5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _2_HashMap {

	public static void main(String[] args) {
		HashMap<Integer, Double> map = new HashMap<Integer, Double>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 10 key, value in integer and double:");
		for(int i=1;i<=10;i++) {
			System.out.println("Enter value for index "+i);
			int n=sc.nextInt();
			double d=sc.nextDouble();
			map.put(n, d);
		}
		for(Map.Entry<Integer, Double> m : map.entrySet()){    
		    System.out.println("Key:"+m.getKey()+" Value:"+m.getValue());    
		   } 
		sc.close();
	}

}
