package presentation;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import pojo.AccountPojo;
import pojo.CustomerPojo;
import pojo.EmployeePojo;
import service.AccountService;
import service.AccountServiceImpl;
import service.CustomerService;
import service.CustomerServiceImpl;
import service.EmployeeService;
import service.EmployeeServiceImpl;

public class BankMain {

	public static void main(String[] args) {
		// Scanner class
		// CustomerPojo customerPojo = new CustomerPojo();
		CustomerService customerService = new CustomerServiceImpl();
		EmployeeService employeeService = new EmployeeServiceImpl();
		AccountService accountService = new AccountServiceImpl();
		CustomerPojo customerPending = new CustomerPojo();
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
				
				EmployeePojo login = new EmployeePojo();
				System.out.println("Welcome Employee please login");
				System.out.println("***********************************************************");
				System.out.println("Username : ");
				login.setEmployeeUserName(sc.nextLine());
				System.out.println("Password : ");
				login.setEmployeePassword(sc.nextLine());

				employeeService.employeeLogin(login);

				while (login.isCheck() == true) {
					System.out.println("What would you like to do? ");
					// when registering it needs to list all pending and there id number
					System.out.println("1. Register pending customers");
					System.out.println("2. View a customers information");
					System.out.println("3. view all customers");
					System.out.println("4. Log out");
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
						AccountPojo account = new AccountPojo();
						
						// print all pending customers
						while(itr.hasNext()) {
							CustomerPojo cp = itr.next();
							System.out.println("ID: "+cp.getCustomerId() +"\tFirst Name : "+ cp.getCustomerFirstName() +"\tLast Name : "+
							cp.getCustomerLastName() +"\tAddress : "+ cp.getCustomerAddress() +"\tEmail : "+ cp.getCustomerEmail()+"\tPhone Number : "+
							cp.getCustomerPhoneNumber() +"\tSocial Security : "+ cp.getCustomerSocial() + "\tStarting Balance : " + cp.getStartingBalance());
						}
						System.out.println("\nWould you like to approve or deny an account");
						System.out.println("a: for approve.");
						System.out.println("d: for deny");
						char app = sc.next().charAt(0);
						if(app == 'a') {
							System.out.println("Please enter the Id of the customer your approving");
							register.setCustomerId(sc.nextInt());
							sc.nextLine();
							register.setCheck(true);
						}else if(app == 'd') {
							System.out.println("Please enter the Id of the customer your denying");
							register.setCustomerId(sc.nextInt());
							sc.nextLine();
							register.setCheck(false);
							break;
						}else {
							System.out.println("You have not entered an applicable choice");
							
							break;
						}
						
						System.out.println("***********************************************************");
						//it to the regulare customer table and giving the customer a user and password
						System.out.println("Please give the user a Username for their account ");
						register.setCustomerUserName(sc.nextLine());
						System.out.println(register.getCustomerUserName());
						System.out.println("Please give the user a Password for their account");
						register.setCustomerUserName(sc.nextLine());
						System.out.println("***********************************************************\n");
						
						System.out.println("What is the name of the first account: ");
						account.setAccountName(sc.nextLine());
						System.out.println(account.getAccountName());
						System.out.println("What is the name of the second account: ");
						account.setAccountName2(sc.nextLine());
						
						employeeService.customerRegistration(register);
					case 2:
						//System.out.println("Choice 2");
					case 3:
					case 4:
//						System.out.println("************************************");
//						System.out.println("Exiting System....");
//						System.out.println("Thankyou for using Book Management System");
//						System.out.println("************************************");
//		
////						System.exit(0);

					}
					System.out.println("Do you want to continue working(y/n) : ");
					char log = sc.next().charAt(0);
					if (log != 'y') {
						login.setCheck(false);
						break;
					}
					
				} 
					
				if(login.isCheck() == false) {
					System.out.println("Wrong username or password.");
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
					System.out.println("Starting balance");
					customerPending.setStartingBalance(sc.nextInt());
					sc.nextLine();// skipped by nextInt
					customerService.creatingAccount(customerPending);

					System.out.println("\nThank you, please wait for your acount to be under review!");

					System.out.println("************************************************************");

				} else if (answer == 2) {
					// Customer Login window
					CustomerPojo login = new CustomerPojo();
					System.out.println("Welcome please login");
					System.out.println("Username : ");
					login.setCustomerUserName(sc.nextLine());
					System.out.println("Password : ");
					login.setCustomerPassword(sc.nextLine());
					customerService.customerLogin(login);
					
					if (login.isCheck() == true) {
						System.out.println("You have logged in thank you");
						System.out.println("What would you like to do? ");
						// when registering it needs to list all pending and there id number
						System.out.println("What would you like to do? ");
						System.out.println("1. Account details");
						System.out.println("2. Transfer money");
						System.out.println("3. View Transaction History");
						System.out.println("4. Log out");
						System.out.println("******************************************************");
						int choice = sc.nextInt();
						sc.nextLine();
						switch (choice) {
						case 1:
						case 2:
						case 3:
						case 4:
//							System.out.println("************************************");
//							System.out.println("Exiting System....");
//							System.out.println("Thankyou for using Book Management System");
//							System.out.println("************************************");
//			
//							System.exit(0);

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
