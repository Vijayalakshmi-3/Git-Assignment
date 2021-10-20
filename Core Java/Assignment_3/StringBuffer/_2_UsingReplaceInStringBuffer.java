package Assignment_3.StringBuffer;

public class _2_UsingReplaceInStringBuffer {

	public static void main(String[] args) {
		String str1="insert text", str2="It is used to _ at the specified index position";
		StringBuffer str=new StringBuffer(str2.replaceAll("_", str1));
		/*str.append(str2);
		str.replace(14,15,str1);*/
		System.out.println(str);
	}

}
