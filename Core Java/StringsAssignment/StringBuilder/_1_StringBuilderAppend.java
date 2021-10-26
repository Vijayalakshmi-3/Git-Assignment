package StringsAssignment.StringBuilder;

public class _1_StringBuilderAppend {

	public static void main(String[] args) {
		String str1 = "StringBuffer", str2 = "is a peer class of String", str3 = "that provides much of",
				str4 = "the functionality of strings";
		StringBuilder str=new StringBuilder();
		str.append(str1+" "+str2+" "+str3+" "+str4);
		System.out.println(str);
	}

}
