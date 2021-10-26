package StringsAssignment.String;

public class _3_StringPractice {

	public static void main(String[] args) {
		String str="Java string pool refers to collection of strings which are stored in heap memory";
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.replace('a', '$'));
		//checking if word collection present in string
		System.out.println(str.contains("collection"));
		//comparing if the following string is same
		String str1="java string pool refers to collection of strings which are stored in heap memory";
		System.out.println(str.equals(str1));
		//using ignore case to compare the string
		System.out.println(str.equalsIgnoreCase(str1));
	}

}
