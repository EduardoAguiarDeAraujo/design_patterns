package Builder;

class Shop {
	// Methods
	public void Construct(VehicleBuilder vehicleBuilder) {
		vehicleBuilder.BuildFrame();
		vehicleBuilder.BuildEngine();
		vehicleBuilder.BuildWheels();
		vehicleBuilder.BuildDoors();
	}
}
