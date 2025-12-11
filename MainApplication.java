package seatwork5;

public class MainApplication {
	public static void main(String[] args) {
		Truck truck = new Truck("Honda", 12);
		Car car = new Car("Mitsubishi",4);
		
		
		car.startEngine();
		car.refuel();
		destroyVehicle(car);
		
		truck.startEngine();
		truck.refuel();
		destroyVehicle(truck);
	}

	private static void destroyVehicle(Vehicle destroy) {
		destroy.destroy();	
	}
}
