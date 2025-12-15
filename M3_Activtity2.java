package Module3_1;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;

public class M3_Activtity2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int choice; 
		
		Set<String> products = new HashSet<>();
		
		products.add("Laptop");
		products.add("Mouse");
		products.add("Keyboard");
		products.add("Monitor");
		products.add("Printer");
		
	do {
		Map<String, String> mainMenu = new HashMap<>();
		mainMenu.put("1", "Search for Product");
		mainMenu.put("2", "Add a Product");
		mainMenu.put("3", "Print the Product List and Number"); 
		mainMenu.put("4", "Quit");

		// Display Menu
		System.out.println("--- Main Menu ---");
		mainMenu.forEach((key, value) -> System.out.println(key + ". " + value));
		choice = input.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter product to search");
			String productSearch = input.next();
			
			if(products.contains(productSearch)) {
				System.out.println("Product " + productSearch + " is found");
			} else {
				System.out.println("Product is not found");
			}
			break;
		case 2:
			System.out.println("Add product to the list");
			String addProduct = input.next();
			products.add(addProduct);
			System.out.println("Product " + addProduct + " has been added"); 
			break;
		case 3:
			for (String i : products) {
				System.out.println(i);
			}
			System.out.println("The total number unique products is " + products.size());
			break;
		case 4:
            System.out.println("Exiting program. Goodbye!");
            break;
		}
			} while (choice <= 3);
		input.close();
	}
}
