package seatwork5;

public class Car extends Vehicle implements Refuelable {
	
	public Car(String brand, int numberofWheels) {
		super (brand, numberofWheels);
	}
	@Override
	public void startEngine() {
		System.out.println("The " + getnumberofWheels() + " wheels " + getBrand() + " car has started the engine");
	}
	@Override
	public void refuel() {
		System.out.println("The " + getnumberofWheels() + " wheels " + getBrand() + " car has been refueled");
	}		
}
