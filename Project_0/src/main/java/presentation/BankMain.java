package presentation;

import java.util.Scanner;

import pojo.CustomerPojo;
import pojo.EmployeePojo;
import service.CustomerService;
import service.CustomerServiceImpl;
import service.EmployeeService;
import service.EmployeeServiceImpl;

public class BankMain {

	public static void main(String[] args) {
		// Scanner class
		// CustomerPojo customerPojo = new CustomerPojo();
		CustomerService customerService = new CustomerServiceImpl();
		// EmployeePojo employeePojo = new EmployeePojo();
		EmployeeService employeeService = new EmployeeServiceImpl();

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
				
				EmployeePojo login = new EmployeePojo();
				System.out.println("Welcome Employee please login");
				System.out.println("***********************************************************");
				System.out.println("Username : ");
				login.setEmployeeUserName(sc.nextLine());
				System.out.println("Password : ");
				login.setEmployeePassword(sc.nextLine());

				employeeService.employeeLogin(login);

				if (login.isCheck() == true) {
					System.out.println("What would you like to do? ");
					// when registering it needs to list all pending and there id number
					System.out.println("1. Register pending customers");
					System.out.println("Current pending customers");
					System.out.println("2. View a customers information");
					System.out.println("3. view all customers");
					System.out.println("4. Log out");
					System.out.println("******************************************************");
					int choice = sc.nextInt();
					sc.nextLine();
					switch (choice) {
					case 1:
					case 2:
					case 3:
					case 4:

					}

				} else {
					System.out.println("incorrect login, please try again.");
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
					CustomerPojo customerPending = new CustomerPojo();
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
						System.out.println("What would you like to do? ");
						// when registering it needs to list all pending and there id number
						System.out.println("1. Register pending customers");
						System.out.println("Current pending customers");
						System.out.println("2. View a customers information");
						System.out.println("3. view all customers");
						System.out.println("4. Log out");
						System.out.println("******************************************************");
						int choice = sc.nextInt();
						sc.nextLine();
						switch (choice) {
						case 1:
						case 2:
						case 3:
						case 4:

						}

					} else {
						System.out.println("incorrect login, please try again.");
					}
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
