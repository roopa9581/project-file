package Activity;

public interface IHDFCBankAccount {
	static void showMessage() {
		System.out.println("Welcome to HDFC Bank");
	}
	

}
interface IBankTransaction extends IHDFCBankAccount{
	void depositAmount();
	void withdrawAmount();
	void balanceCheck();
}
class SavingAccount implements IBankTransaction{

	@Override
	public void depositAmount() {
		System.out.println("Deposit in Saving account");// TODO Auto-generated method stub
		
	}

	@Override
	public void withdrawAmount() {
		System.out.println("withdraw in Saving account");// TODO Auto-generated method stub
		
	}

	@Override
	public void balanceCheck() {
		System.out.println("balance in Saving account");// TODO Auto-generated method stub
		
	}
	
}
class CurrentAccount implements IBankTransaction{

	@Override
	public void depositAmount() {
		System.out.println("Deposit in  current account");// TODO Auto-generated method stub
		
	}

	@Override
	public void withdrawAmount() {
		System.out.println("withdraw in current account");// TODO Auto-generated method stub
		
	}

	@Override
	public void balanceCheck() {
		System.out.println("balance in current account");// TODO Auto-generated method stub
		
	}
	
}
