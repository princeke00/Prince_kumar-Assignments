package third;

public class BankAccountRepositoryImpl implements BankAccountRepository {
	@SuppressWarnings("unused")
	private void BankAccountRepositoryImplementation()
	{
		BankAccount bankAccount = new BankAccount();
		bankAccount.setAccountHolderName("Prince");
		bankAccount.setAccountId(12);
		bankAccount.setAccountType("Savings");
		bankAccount.setAccountBalance((long) 20000.222);
	}

	public double getBalance(long accountId) {
		// TODO Auto-generated method stub
		return 0;
	}

	public double updateBalance(long accountId, double newBalance) {
		// TODO Auto-generated method stub
		return 0;
	}
}
