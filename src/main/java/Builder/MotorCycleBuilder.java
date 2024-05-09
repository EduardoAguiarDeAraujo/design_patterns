package Builder;

class MotorCycleBuilder extends VehicleBuilder {
	// Methods
	public MotorCycleBuilder() {
		vehicle = new Vehicle("MotorCycle");
	}

	public void BuildFrame() {
		vehicle.setParts("frame", "MotorCycle frame");
	}

	public void BuildEngine() {
		vehicle.setParts("engine", "500 cc");
	}

	public void BuildWheels() {
		vehicle.setParts("wheels", "2");
	}

	public void BuildDoors() {
		vehicle.setParts("doors", "0");
	}
}