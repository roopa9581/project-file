package Activity;
import java.util.Scanner; 
class initalBalance{
	final int count=10000;
}
public class TransactionType {
	private static final int count=10000;
	private static final int limit=5000;
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter D for deposit");
		System.out.println("enter W for withdraw");
		System.out.println("enter B for balance");
		String s= scan.next();
		char choice=s.charAt(0);
		switch (choice) {
		case 'D':
			System.out.println("enter Deposit amount");
			 int d=scan.nextInt();
			System.out.println("Deposited balance is"+(d+count));
			break;
		case 'W':
			System.out.println("enter withdraw amount");
			int Wamount=scan.nextInt();
			if(Wamount<=count) {
				if(Wamount==limit) {
					System.out.println("Insufficent balance");
					break;
				}
			
			if(Wamount>count) {
				System.out.println("Withdraw amount failed");
				break;
			}
			else 
				System.out.println("Transaction balance is"+(count-Wamount));
			
			
		}
		break;
		case 'B':
			System.out.println("balance is"+count);
	}
		System.out.println("enter Y for continue or N for exit");
		String a=scan.next();
		char option=a.charAt(0);
				switch (option) {
				case 'Y':
					TransactionType.main(args);
				case 'N' :
				break;
				}
	
	}
}
