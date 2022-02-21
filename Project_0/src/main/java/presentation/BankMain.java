package presentation;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import pojo.AccountPojo;
import pojo.CustomerPojo;
import pojo.EmployeePojo;
import pojo.TransactionPojo;
import service.AccountService;
import service.AccountServiceImpl;
import service.CustomerService;
import service.CustomerServiceImpl;
import service.EmployeeService;
import service.EmployeeServiceImpl;
import service.TransactionService;
import service.TransactionServiceImpl;

public class BankMain {

	public static void main(String[] args) {
		// Scanner class
		// CustomerPojo customerPojo = new CustomerPojo();
		CustomerService customerService = new CustomerServiceImpl();
		EmployeeService employeeService = new EmployeeServiceImpl();
		AccountService accountService = new AccountServiceImpl();
		TransactionService transactionService = new TransactionServiceImpl();
		AccountPojo login = new AccountPojo();
		AccountPojo account = new AccountPojo();
		Scanner sc = new Scanner(System.in);
		// calling preLogin
		int answer;
		boolean flag = true;
		while (flag) {
			// Beginning login window
			System.out.println("Login as employee or a customer");
			System.out.println("1: for employee");
			System.out.println("2: for customer");
			answer = sc.nextInt();
			System.out.println("***********************************************************");;
			sc.nextLine();// being skipped by sc.nextInt???
			if (answer == 1) {
				// Employee login window
				
				EmployeePojo eLogin = new EmployeePojo();
				System.out.println("Welcome Employee please login");
				System.out.println("***********************************************************");
				System.out.println("Username : ");
				eLogin.setEmployeeUserName(sc.nextLine());
				System.out.println("Password : ");
				eLogin.setEmployeePassword(sc.nextLine());

				employeeService.employeeLogin(eLogin);

				while (login.isCheck() == true) {
					System.out.println("You have logged in thank you");
					System.out.println("What would you like to do? ");
					// when registering it needs to list all pending and there id number
					System.out.println("1. Register pending customers");
					System.out.println("2. View all customers");
					System.out.println("3. Log Out");
					System.out.println("***********************************************************");
					int choice = sc.nextInt();
					sc.nextLine();
					switch (choice) {
					case 1:
						
						System.out.println("Current pending customers");
						System.out.println("***********************************************************");
						List<CustomerPojo> pending = employeeService.customersPending();
						Iterator<CustomerPojo> itr = pending.iterator();
						CustomerPojo register = new CustomerPojo();
						
						
						
						// print all pending customers
						while(itr.hasNext()) {
							CustomerPojo cp = itr.next();
							System.out.println("ID: "+cp.getCustomerId() +"\tFirst Name : "+ cp.getCustomerFirstName() +"\tLast Name : "+
							cp.getCustomerLastName() +"\tAddress : "+ cp.getCustomerAddress() +"\tEmail : "+ cp.getCustomerEmail()+"\tPhone Number : "+
							cp.getCustomerPhoneNumber() +"\tSocial Security : "+ cp.getCustomerSocial());
						}
					
						System.out.println("\nWould you like to approve or deny an account");
						System.out.println("a: for approve.");
						System.out.println("d: for deny");
						char app = sc.next().charAt(0);
						if(app == 'a') {
							System.out.println("Please enter the Id of the customer your approving");
							register.setCheck(true);
							register.setCustomerId(sc.nextInt());
							sc.nextLine();
							System.out.println("Please enter the starting balance of the account");
							account.setAccountBalance(sc.nextInt());
							sc.nextLine();
							
						}else if(app == 'd') {
							System.out.println("Please enter the Id of the customer your denying");
							register.setCheck(false);
							register.setCustomerId(sc.nextInt());
							sc.nextLine();
							
							break;
						}else {
							System.out.println("You have not entered an applicable choice");
							
							break;
						}
						
						System.out.println("***********************************************************");
						//it to the regulare customer table and giving the customer a user and password
						System.out.println("Please give the user a Username for their account ");
						account.setAccountUsername(sc.nextLine());
						
						System.out.println("Please give the user a Password for their account");
						account.setAccountPassword(sc.nextLine());
						System.out.println("***********************************************************\n");
						
						System.out.println("What is the name of the first account: ");
						account.setAccountName(sc.nextLine());
					
						System.out.println("What is the name of the second account: ");
						account.setAccountName2(sc.nextLine());
					
						employeeService.customerRegistration(register);
						accountService.accountCreate(account);
						break;
					case 2:
						//View all Customers information
						System.out.println("All current customers");
						List<CustomerPojo> allCust = employeeService.displayAllCustomers();
						Iterator<CustomerPojo> itr2 = allCust.iterator();
						while(itr2.hasNext()) {
							CustomerPojo ac = itr2.next();
							System.out.println("ID: "+ ac.getCustomerId()+ "  First Name: "+ ac.getCustomerFirstName()+"  Last Name: "+ ac.getCustomerLastName()+
									"  Address: "+ ac.getCustomerAddress()+"  email: "+ ac.getCustomerEmail()+
									"  Phone Number: "+ ac.getCustomerPhoneNumber()+"  Social: "+ ac.getCustomerSocial());
						}
						System.out.println("Those are all of the current Customers");
						break;
					case 3:
						System.out.println("************************************");
						System.out.println("Exiting System");
						System.out.println("Thank you");
						System.out.println("************************************");		
						System.exit(0);
						break;
					}
					
					System.out.println("Do you want to continue working(y/n) : ");
					char log = sc.next().charAt(0);
					if (log != 'y') {
						login.setCheck(false);
						break;
					}
					
				} 
					

			} else if (answer == 2) {

				// customer PreLogin window

				System.out.println();
				System.out.println("Welcome do you need to login or register for an account.");
				System.out.println("1 : to create account.");
				System.out.println("2 : to login to account");
				answer = sc.nextInt();
				sc.nextLine(); // being skipped by nextInt

				if (answer == 1) {

					// customer Account Creation
					
					System.out.println("************************************************************");
					CustomerPojo customerPending = new CustomerPojo();
					System.out.println(
							"\nTo register for your account please enter the following information for review :");
					System.out.println("First Name : ");
					customerPending.setCustomerFirstName(sc.nextLine());
					System.out.println("Last Name : ");
					customerPending.setCustomerLastName(sc.nextLine());
					System.out.println("Address : ");
					customerPending.setCustomerAddress(sc.nextLine());
					System.out.println("Email : ");
					customerPending.setCustomerEmail(sc.nextLine());
					System.out.println("Phone number : ");
					customerPending.setCustomerPhoneNumber(sc.nextLine());
					System.out.println("Social Security Number : ");
					customerPending.setCustomerSocial(sc.nextLine());
					customerService.creatingAccount(customerPending);

					System.out.println("\nThank you, please wait for your acount to be under review!");

					System.out.println("************************************************************");

				} else if (answer == 2) {
					// Customer Login window
					
					
					System.out.println("Welcome please login");
					System.out.println("Username : ");
					login.setAccountUsername(sc.nextLine());
					System.out.println("Password : ");
					login.setAccountPassword(sc.nextLine());
					
					
					accountService.accountLogin(login);
				
					
					if (login.isCheck() == true) {
						
						System.out.println("You have logged in thank you");
						System.out.println("What would you like to do? ");
						// when registering it needs to list all pending and there id number
						System.out.println("1. Account details");
						System.out.println("2. Transfer money");
						System.out.println("3. View Transaction History");
						System.out.println("4. Log out");
						System.out.println("******************************************************");
						int choice = sc.nextInt();
						sc.nextLine();
						switch (choice) {
						case 1:
							// display information such as balance
							//accountService.accountInfo(account.getAccountId());
							
							account.setAccountUsername(login.getAccountUsername());
							account.setAccountPassword(login.getAccountPassword());
				
							accountService.accountInfo(account);
						
							System.out.println(account.getAccountName()+" information");
							System.out.println("Balance: " + account.getAccountBalance());
							System.out.println(account.getAccountName2()+" information");
							System.out.println("Balance: " + account.getAccountBalance2());
							break;
						case 2:
							// Transfer money from either checking or savings to the other
							TransactionPojo transfer = new TransactionPojo();
							transactionService.transfer(transfer);
							account.setAccountUsername(login.getAccountUsername());
							account.setAccountPassword(login.getAccountPassword());
							System.out.println("Which account do you wanna transfer money from");
							System.out.println("1: " + account.getAccountUsername());
							System.out.println("2: " + account.getAccountName2());
							int tran = sc.next().charAt(0);
							if(tran == 1) {
								account.getAccountId();
								
								System.out.println("How much money do you want to transfer from you Checkings to Savings");
								
								
							}else if (tran =='s') {
								
							}
							
							break;
						case 3:
							//view the transaction history of the account with the date
							TransactionPojo hist =new TransactionPojo();
							System.out.println("Which account do you want to see the transaction history of");
							System.out.println("1: " + account.getAccountName());
							System.out.println("2: " + account.getAccountName2());
							//transferService 
							int tHist = sc.next().charAt(0);
							if(tHist == 1) {
								
								
							}else if(tHist == 2) {
								
							}
							break;
						case 4:
					
							System.out.println("************************************");
							System.out.println("Exiting System....");
							System.out.println("Thank you!");
							System.out.println("************************************");
			
							System.exit(0);

						}

					} else {
						System.out.println("incorrect login, please try again.");
					}


				}

				// switch()

			} else {
				System.out.println("You have not entered a choice try again!\n");

			}
			System.out.println("Do you want to login (y/n) : ");
			char cont = sc.next().charAt(0);
			if (cont != 'y') {
				flag = false;
			}

		}

		sc.close();
		System.out.println("*****************************************");
		System.out.println("Exiting System....");
		System.out.println("Thankyou for using Banking System");
		System.out.println("*****************************************");

	}
}
