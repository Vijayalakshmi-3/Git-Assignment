package IntermediateOopsAssignment;

public class _3_PolymorphismToFindBalance {

	public static void main(String[] args) {
		_3_CurrentAccount CA = new _3_CurrentAccount();
		_3_SavingsAccount SA = new _3_SavingsAccount();
		System.out.println("Total Salary:" + (CA.getBalance() + SA.getBalance()));
	}

}
