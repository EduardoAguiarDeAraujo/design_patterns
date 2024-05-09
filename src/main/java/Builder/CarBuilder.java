package Builder;

class CarBuilder extends VehicleBuilder {
	// Methods
	public CarBuilder() {
		vehicle = new Vehicle("Car");
	}

	public void BuildFrame() {
		vehicle.setParts("frame", "Car frame");
	}

	public void BuildEngine() {
		vehicle.setParts("engine", "2500 cc");
	}

	public void BuildWheels() {
		vehicle.setParts("wheels", "4");
	}

	public void BuildDoors() {
		vehicle.setParts("doors", "4");
	}
}
