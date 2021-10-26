package CollectionAssignment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class _4_DOBWithLeapYear {
	private static String dateWithoutTime(Date date){
		 return new SimpleDateFormat("dd/MMM/yyyy").format(date);
		}

	public static Date readDate(Scanner sc, String format) throws ParseException {
		return new SimpleDateFormat(format).parse(sc.nextLine());
	}
	
	private static boolean isLeapYear(int year) 
    {
        //1583 was the first year of the Gregorian Calendar
        assert year >= 1583; 
         
        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		Map<Integer, Date> dob = new LinkedHashMap<>();
		System.out.println("Enter the number of date set:");
		int num = sc.nextInt();
		sc.nextLine();
		for (int i = 1; i <= num; i++) {
			System.out.println("Enter the Date in dd/mm/yyyy for set " + i);
			dob.put(i, readDate(sc, "dd/MM/yyyy"));
		}
		//reversing with arraylist
		List<Integer> alKeys = new ArrayList<Integer>(dob.keySet());
        Collections.reverse(alKeys);
        System.out.println();
		for (Integer entry:alKeys) {
			System.out.print(entry + " ---> " + dateWithoutTime(dob.get(entry)));
			if(isLeapYear(dob.get(entry).getYear()))
				System.out.println(" is a Leap Year");
			else
				System.out.println(" is not a Leap Year");
		}
	}

}
