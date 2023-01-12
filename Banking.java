package Bank_account;

import java.util.Scanner;

public class Banking {
	public static void main(String[] args) {
		System.out.println("Welcome to RBI Bank Services!");
		System.out.println("Do You want to open an account 1.Yes 2.No");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
	 if (choice==1){
			Account obj1 = new Account();
			obj1.openAccount();
		}
	 else if (choice==2) {
				System.out.println("Thank You For Chosing our Website!");
			}
	while (true) {
		
			System.out.println("----------------------------------------------------------------------------------");
			System.out.println("1.Display Account details 2. Deposit 3. Withdraw 4 .Check balance 5 . CalculateInterest 6 .Exit");
							int choice1 = sc.nextInt();
							Account obj1 = new Account();
							switch(choice1) {
							case 1:
								obj1.showAccount();
								break;
							case 2:
								obj1.deposit();
								break;
							case 3:
								obj1.withdrawal();
								break;
							case 4:
								obj1.getPreviousTransaction();
								break;
							case 5: 
								obj1.calculateInterest();
								break;
							case 6:  
								System.out.println("Thank you!!!!");
								break;
				
							default:
								System.out.println("Invalid input");
							}
							break;
		}
	
	}
	}
class Account {
	private static String customerName;
	private static String accountType;
	private static String bankName;
	private static String address;
	private static double balance;
	private static long previousTransaction;
	private static double interest;
	Scanner sc = new Scanner(System.in);

	public void openAccount() {

		Scanner sc = new Scanner(System.in);		
			System.out.println("In which bank you want to open account 1. SBI 2. PNB 3. ICICI");
			int choice = sc.nextInt();
			if (choice == 1) {
				bankName = "SBI";		
			} else if (choice == 2) {
				bankName = "PNB";	
			} else if (choice == 3) {
				bankName = "ICICI";	
			} else
				System.out.println("Invalid Input");
			System.out.println("Enter Your name :");
			customerName = sc.next();
			System.out.println("Enter your address");
			address = sc.next();
			System.out.println("Account type 1. Saving 2. Current");
			int ch =sc.nextInt();
			if(ch==1) {
				accountType ="Saving";
			}else if(ch==2) {
				accountType = "Current";		
			}else
				System.out.println("Inavlid input");
			
			System.out.println("Enter balance: ");
			balance = sc.nextDouble();
			if (balance < 2000) {
				System.out.println("Invalid amount account cannot be created");
			} else
				System.out.println("Account created successfully");
				
	}
	public void noAccount() {
		System.out.println("Thank You For Visiting RBI Services.");
		
	}
	public void showAccount() {
		System.out.println("Customer name :" + customerName);
		System.out.println("Bank name :" + bankName);
		System.out.println("Account type :" + accountType);
		System.out.println("Customer address: " + address);
		System.out.println("Account number: " + Math.random());
	}

	public void deposit() {
		long amt = 0;
		setPreviousTransaction(amt);
		System.out.println("Enter the amount you want to deposit: ");
		amt = sc.nextLong();
		balance = balance + amt;
		System.out.println("Balance after deposit :" +balance);
	}

	public void withdrawal() {
		long amt = 0;
		setPreviousTransaction(amt);
		System.out.println("Enter the amount you want to withdraw: ");
		amt = sc.nextLong();
		if (balance >= amt) {
			balance = balance - amt;
			System.out.println("Balance after withdrawal: " + balance);
		} else {
			System.out.println("Your balance is less than " + amt + " Transaction failed...!!");
		}
	}

	public void calculateInterest() {
		System.out.println("Enter number of years");
		double rate = 5;
		double n = sc.nextDouble();
		interest =(balance*rate*n)/100;
		System.out.println(interest);
	}
	
	
	public long getPreviousTransaction() {
		System.out.println("Current Balance is :"+balance);
		return previousTransaction;
	}
	
	
	public static void setPreviousTransaction(long previousTransaction) {
		Account.previousTransaction = previousTransaction;
	}
}

