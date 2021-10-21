package Assignment_4.BankAccount;

public class IllegalBankTransactionException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IllegalBankTransactionException(String s){
		super(s);
	}
}
