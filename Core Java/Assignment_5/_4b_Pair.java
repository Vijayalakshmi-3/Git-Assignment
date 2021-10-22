package Assignment_5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class _4b_Pair {
	String key;
	Date value;

	void setValue(Date date) {
	    this.value=new Date();
		this.value = date;
	}

	void setKey(String s) {
		this.key = s;
	}
	public static Date readDate(Scanner sc, String format) throws ParseException{
//		SimpleDateFormat sdf=new SimpleDateFormat(format);
//		Date d=new Date();
//		d=sdf.parse(sc.nextLine());
//		System.out.println(d);
	    return new SimpleDateFormat(format).parse(sc.nextLine());
	}

	public static void main(String[] args) throws ParseException {
		
		//HashMap<String, String> map = new HashMap<String, String>();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number of key and value pair you want to enter:");
		//map.put(sc.nextLine(), sc.nextLine());
		int n=sc.nextInt();
		sc.nextLine();
		_4b_Pair[] pair=new _4b_Pair[n];
		for(int i=0;i<n;i++) {
			System.out.println(i+1+"\nEnter key:");
			String key=sc.nextLine();
			System.out.println("Enter date for Value:");
			pair[i]=new _4b_Pair();
			pair[i].setKey(key);
			pair[i].setValue(readDate(sc,"dd/MM/yyyy"));
		}
		for(_4b_Pair obj:pair) {
			System.out.println("[ Key: \""+obj.key+"\", Value: \""+obj.value+"\" ]");
		}
		sc.close();
	}

}
