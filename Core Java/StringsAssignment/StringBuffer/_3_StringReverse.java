package StringsAssignment.StringBuffer;

public class _3_StringReverse {

	public static void main(String[] args) {
		String str = "This method returns the reversed object on which it was called";
		StringBuffer strrev = new StringBuffer();
		strrev.append(str);
		System.out.println(strrev.reverse());
	}

}
