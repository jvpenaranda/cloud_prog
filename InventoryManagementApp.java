import java.util.Scanner;

public class InventoryManagementApp {
	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);
		InventoryManagementSystem IMS = new InventoryManagementSystem();

		System.out.println("********************************************");
		System.out.println("*Welcome To The Inventory Management System*");
		System.out.println("*By: John Vincent Penaranda                *");
		System.out.println("********************************************");
		
		
		while (true) {
		    System.out.println("Menu:");
            System.out.println("1. Add Product");
            System.out.println("2. Display Products");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scan.nextInt();
    		scan.nextLine();
    		
    		switch (choice){
    		    
    		    case 1:
    		        System.out.print("Enter product Name: ");
                    String Name = scan.nextLine();
                    System.out.print("Enter product Price: ");
                    int Price = scan.nextInt();
                    IMS.addProduct(Name, Price);
                    break;
                case 2:
                    IMS.displayProducts();
                    break;
                case 3:
                    System.out.println("Goodbye!");
                    scan.close();
                    return;
                default:
                    System.out.println("Invalid Choice! Please Enter a valid option ");
		}
		
		}
	}

}

//John Vincent Penaranda