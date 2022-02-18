package presentation;

import java.util.Scanner;

import pojo.CustomerPojo;
import pojo.EmployeePojo;
import service.CustomerService;
import service.CustomerServiceImpl;

public class BankMain {

	public static void main(String[] args) {
		// Scanner class
		CustomerPojo customerPojo = new CustomerPojo();
		CustomerService customerService = new CustomerServiceImpl();
		EmployeePojo employeePojo = new EmployeePojo();
		
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
			System.out.println("**************************************************************************");
			sc.nextLine();// being skipped by sc.nextInt???
			if (answer == 1) {
				// Employee login window
				System.out.println("Welcome Employee please login");
				System.out.println("Username : ");
				
				employeePojo.setEmployeeUserName(sc.nextLine());
				System.out.println("Password : ");
				employeePojo.setEmployeePassword(sc.nextLine());
				sc.nextLine();

//				
//				// View Account details
//				System.out.println("What would you like to do? ");
//				System.out.println("1. Register pending customers");
				//when registering it needs to list all pending and there id number
				//System.out.println("Current pending customers");
				//Lis<EmployeePojo>?? customerPending = 
				//employeePojo.setCustomerPendingId(sc.nextInt());
//				System.out.println("2. View a customers information");
//				System.out.println("3. view all customers");
//				System.out.println("4. Log out");
//				
//				
//				
//				
				break;
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
					CustomerPojo customer = new CustomerPojo();
					System.out.println("************************************************************");
					System.out.println("\nTo register for your account please enter the following information for review :");
					System.out.println("First Name : ");
					customer.setCustomerFirstName(sc.nextLine());
					System.out.println("Last Name : ");
					customer.setCustomerLastName(sc.nextLine());
					System.out.println("Address : ");
					customer.setCustomerAddress(sc.nextLine());
					System.out.println("Email : ");
					customer.setCustomerEmail(sc.nextLine());
					System.out.println("Phone number : ");
					customer.setCustomerPhoneNumber(sc.nextLine());
					System.out.println("Social Security Number : ");
					customer.setCustomerSocial(sc.nextLine());
					
					CustomerPojo pendingCustomer = customerService.creatingAccount(customer);
					
					
					System.out.println("\nThank you, please wait for your acount to be under review!");
		
					
					
					System.out.println("************************************************************");

				} else if (answer == 2) {
					// Customer Login window
					System.out.println("Welcome please login");
					System.out.println("Username : ");
					customerPojo.setCustomerUserName(sc.nextLine());
					System.out.println("Password : ");
					customerPojo.setCustomerPassword(sc.nextLine());

					// needs a condition to check and tell if account is still pending
					// if (username = database username)
					// View Account details
//				System.out.println("What would you like to do? ");
//				System.out.println("1. Account details");
//				System.out.println("2. Transfer money");
//				System.out.println("3. View Transaction History");
//				System.out.println("4. Log out");

				}

				// switch()

			} else {
				System.out.println("You have not entered a choice try again!\n");
			
		}
			System.out.println("Do you want to continue(y/n) : ");
			char cont = sc.next().charAt(0);
			if(cont != 'y') {
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
