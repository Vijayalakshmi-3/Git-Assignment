package Assignment_3.StringBuilder;

public class _2_UsingReplaceInStringBuilder {

	public static void main(String[] args) {
		String str1="insert text", str2="It is used to _ at the specified index position";
		StringBuilder str=new StringBuilder(str2.replaceAll("_", str1));
		System.out.println(str);
	}

}
