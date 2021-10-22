package Assignment_5;

//import java.util.HashMap;
import java.util.Scanner;

public class _4a_Pair {
	String key, value;

	void setValue(String s) {
		this.value = s;
	}

	void setKey(String s) {
		this.key = s;
	}

	public static void main(String[] args) {
		
		//HashMap<String, String> map = new HashMap<String, String>();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number of key and value pair you want to enter:");
		//map.put(sc.nextLine(), sc.nextLine());
		int n=sc.nextInt();
		sc.nextLine();
		_4a_Pair[] pair=new _4a_Pair[n];
		
		for(int i=0;i<n;i++) {
			System.out.println(i+1+"\nEnter key:");
			String key=sc.nextLine(), value;
			System.out.println("Enter Value:");
			value=sc.nextLine();
			pair[i]=new _4a_Pair();
			pair[i].setKey(key);
			pair[i].setValue(value);
		}
		for(_4a_Pair obj:pair) {
			System.out.println("Key:"+obj.key+", Value:"+obj.value);
		}
		sc.close();
	}

}
