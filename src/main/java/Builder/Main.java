package Builder;

public class Main {
	// Main method
	public static void main(String[] args) {
		
		// Create director and builders
		Shop shop = new Shop();
		VehicleBuilder b1 = new MotorCycleBuilder();
		VehicleBuilder b2 = new CarBuilder();
		VehicleBuilder b3 = new ScooterBuilder();
		
		// Construct and display vehicles
		shop.Construct(b1);
		b1.getVehicle().show();
		
		shop.Construct(b2);
		b2.getVehicle().show();
		
		shop.Construct(b3);
		b3.getVehicle().show();
	}
}
