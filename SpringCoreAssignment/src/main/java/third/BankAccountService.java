package third;

public interface BankAccountService {
	public double withdraw(long accountId,double balance);
	public double deposit(long accountId,double balance);
	public double getBalance(long accountId);
	public boolean fundTransfer(long fromAcccount,long toAccount,double account);
}
