package StringsAssignment.StringBuilder;

public class _3_StringReverse {

	public static void main(String[] args) {
		String str = "This method returns the reversed object on which it was called";
		StringBuilder strrev = new StringBuilder();
		strrev.append(str);
		System.out.println(strrev.reverse());
	}

}
