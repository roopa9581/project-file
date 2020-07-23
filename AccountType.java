package Activity;
import java.util.Scanner;
public class AccountType {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Press S for Saving Account");
		System.out.println("Press C for Current Account");
		String s= scan.nextLine();
		char choice=s.charAt(0);
		switch(choice) {
		case 'S':
			SavingAccount saving=new SavingAccount();
		
	case 'C':
		CurrentAccount current =new CurrentAccount();
	}

	}

}
