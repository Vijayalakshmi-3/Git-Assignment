package StringsAssignment.StringBuffer;

public class _1_StringBufferAppend {

	public static void main(String[] args) {
		String str1 = "StringBuffer", str2 = "is a peer class of String", str3 = "that provides much of",
				str4 = "the functionality of strings";
		StringBuffer str=new StringBuffer();
		str.append(str1+" "+str2+" "+str3+" "+str4);
		System.out.println(str);
	}

}
