package Assignment_2;

public class _3_SavingsAccount extends _3_Bank{
int balance,fixedDeposit;
_3_SavingsAccount(){
	balance=10000;
	fixedDeposit=100000;
}
@Override
int getBalance() {
	return balance+fixedDeposit;
}
}
