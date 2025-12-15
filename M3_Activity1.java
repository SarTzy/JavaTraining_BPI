package Module3_1;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;


public class M3_Activity1 {
	public static void main(String[] args) {
//List method
			List<String> products = new ArrayList<>();
			
				products.add("Laptop");
				products.add("Mouse");
				products.add("Keyboard");
				products.add("Monitor");
				products.add("Printer");
			
			System.out.println("All Products");
			System.out.println("1 " + products.get(0));
			System.out.println("2 " + products.get(1));
			System.out.println("3 " + products.get(2));
			System.out.println("4 " + products.get(3));
			System.out.println("5 " + products.get(4));
			System.out.println();
			System.out.println("Removing and updating items . . . . ");
			products.remove(1);
			products.add(1, "Webcam");
			System.out.println();
			System.out.println("All Products");
			System.out.println("1 " + products.get(0));
			System.out.println("2 " + products.get(1));
			System.out.println("3 " + products.get(2));
			System.out.println("4 " + products.get(3));
			System.out.println("5 " + products.get(4));
			
			
			Scanner input = new Scanner(System.in);
			System.out.println("Enter a product ");
			String name = input.next();
			boolean found = false;
			
			for (int i = 0; i < products.size(); i++) {
			    if (products.get(i).equals(name)) {
			        found = true;
			        break;
			    }
			}
			if (found) {
		            System.out.println("The product " + name + " is found ");
		        }	 else {
		            System.out.println("Product Not Found");
		        }
			  }
}
