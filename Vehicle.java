package seatwork5;

public abstract class Vehicle{
	private String brand;
	private int numberofWheels;
	
	public Vehicle(){
	}
	
	public Vehicle(String brand, int numberofWheels){
			this.brand = brand;
			this.numberofWheels = numberofWheels;
	}
	
	public void setBrand(String brand){
		this.brand = brand;
	}
	public void setnumberofWheels(int numberofWheels){
		this.numberofWheels = numberofWheels;
	}
	public String getBrand(){
		return brand;
	}
	public int getnumberofWheels() {
		return numberofWheels;
	}
	
	public abstract void startEngine();
	
	public void destroy() {
		System.out.println("The " + numberofWheels + " wheels " + brand + " has been crushed and destroyed");
	}
		
}
