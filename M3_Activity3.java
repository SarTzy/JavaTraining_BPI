package Module3_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class M3_Activity3 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int choice; 
		
		Map<String, Integer> products = new HashMap<>();
		
		products.put("Laptop", 50000);
		products.put("Mouse", 2500);
		products.put("Keyboard", 5000);
		products.put("Monitor", 10000);
		products.put("Printer", 20000);
		
	do {
		Map<String, String> mainMenu = new HashMap<>();
		mainMenu.put("1", "Search for Product");
		mainMenu.put("2", "Add a Product");
		mainMenu.put("3", "Print the Product List and Number"); 
		mainMenu.put("4", "Find the cheapest product");
		mainMenu.put("5", "Quit");

		// Display Menu
		System.out.println("--- Main Menu ---");
		mainMenu.forEach((key, value) -> System.out.println(key + ". " + value));
		choice = input.nextInt();
		switch(choice) {
		
			case 1:
				System.out.println("Enter product to search");
				String productSearch = input.next();
			
				if(products.containsKey(productSearch)) {
					System.out.println("Product " + productSearch + " is found");
				} else {
				System.out.println("Product is not found");
			}
			break;
			
			case 2:
				System.out.println("Add product to the list");
				String addProduct = input.next();
				System.out.println("Add product price to the list");
				int addProductPrice = input.nextInt();
				products.put(addProduct, addProductPrice);
				System.out.println("Product " + addProduct + " has been added"); 
				break;
				
			case 3:
				System.out.println("---Listing Productss ---");
				products.forEach((key, value) -> System.out.println(key + ". " + value));
				System.out.println("The total number of unique products is " + products.size());
				System.out.println();
				break;
			
			case 4:
				Integer leastValue = Integer.MAX_VALUE;
				String leastKey = null;
				for (HashMap.Entry<String, Integer> entry : products.entrySet()) {
			    if (entry.getValue() < leastValue) {
			        leastKey = entry.getKey();
			        leastValue = entry.getValue();
			    		}
				}
				System.out.println(leastKey + " " + leastValue);
				break;
				
			case 5:
				System.out.println("Exiting program. Goodbye!");
				break;
			}
				} while (choice != 5);
	
		input.close();
	}
}
