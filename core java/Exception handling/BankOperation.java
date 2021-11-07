import java.util.Scanner;

public class BankOperation extends MainWithdrawal {
	long id;
	double balance = 0;
	double amount;

	public void deposit(double amount) {
		System.out.println("the Amount in your account : " + (balance + amount));
	}

	public void withdraw(double amount) {
		try {
			if(amount>0 && amount<balance) {
				balance = balance - amount;
				System.out.println("Balance After Withdrawal:" + balance);
			}else if (amount > balance) {
				throw new Exception("InsufficientBalanceException");
			} else if (amount < 0) {
				throw new Exception("IllegalBankTransactionException");
			} 
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

class MainWithdrawal extends Throwable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BankOperation sa = new BankOperation();
		System.out.println("enter the amount you want to deposit : ");
		double d1 = sc.nextDouble();
		sa.deposit(d1);
		System.out.println("enter the amount you want to withdraw : ");
		double d2 = sc.nextDouble();
		sa.withdraw(d2);
		sc.close();
	}

}
