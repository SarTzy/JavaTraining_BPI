package OOP_1;

public class Activity_1 {
	
	public static void main(String[] args) {
		
		OOP_BOOK book = new OOP_BOOK();
		OOP_TREE displaytree = new OOP_TREE();
		OOP_HOUSE displayHouse = new OOP_HOUSE();
		
		book.title = "Twilight";
		book.classify = "Fictional";
		book.DisplayBook();
		
		System.out.println();
		
		displaytree.name = "Narra";
		displaytree.type = "Local";
		displaytree.DisplayTree();
		
		System.out.println();
		
		displayHouse.house_name = "Loyola Heights";
		displayHouse.house_type = "Hacienda";
		displayHouse.DisplayHouse();
		
		System.out.println();
	} 
}
