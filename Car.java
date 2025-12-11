package OOP_2;

public class Car {
		int modelYear;
		String modelName;
		String modelColor;
		
		 public Car(int year, String name, String color) {
		    modelYear = year;
		    modelName = name;
		    modelColor = color;
		  }
		
		 public void details() {
		     Car myCar1 = new Car(1956,"Mustang","Red");
			    System.out.println("The Car is " + myCar1.modelName);
			    System.out.println("The Car is bought in " + myCar1.modelYear);
			    System.out.println("The Car color is " + myCar1.modelColor);
		 }

		  public Car() {
		    this.modelName = "Nissan GTR";
		    this.modelYear = 2021;
		    this.modelColor = "Black";
		  }
		  		 
		 public void details2() {
			 Car myCar2 = new Car();
			    System.out.println("The Car is " + myCar2.modelName);
			    System.out.println("The Car is bought in " + myCar2.modelYear);
			    System.out.println("The Car color is " + myCar2.modelColor);
		 }
}

