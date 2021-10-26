package StringsAssignment.String;

public class _2_StringJoin {

	public static void main(String[] args) {
		String s1 = "Hello,";
		String s2 = "How are you ?";
		/*StringBuilder str=new StringBuilder(100);
		str.append(s1);
		str.append(" ");
		str.append(s2);*/
		System.out.println(s1.concat(" ").concat(s2));
	}

}
