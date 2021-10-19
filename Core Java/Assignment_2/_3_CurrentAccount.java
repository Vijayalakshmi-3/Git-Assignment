package Assignment_2;

public class _3_CurrentAccount extends _3_Bank{
int balance,cashCredit;
_3_CurrentAccount(){
	balance=5000;
	cashCredit=500;
}
@Override
int getBalance() {
	return this.balance+cashCredit;
}
}
