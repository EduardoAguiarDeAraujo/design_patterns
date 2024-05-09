package Builder;

public class ScooterBuilder extends VehicleBuilder {
	// Methods
	public ScooterBuilder() {
		vehicle = new Vehicle("Scooter");
	}

	public void BuildFrame() {
		vehicle.setParts("frame", "Scooter frame");
	}

	public void BuildEngine() {
		vehicle.setParts("engine", "none");
	}

	public void BuildWheels() {
		vehicle.setParts("wheels", "2");
	}

	public void BuildDoors() {
		vehicle.setParts("doors", "0");
	}
}