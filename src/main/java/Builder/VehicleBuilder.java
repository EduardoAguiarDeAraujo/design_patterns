package Builder;

public abstract class VehicleBuilder {

	// Fields
	protected Vehicle vehicle;

	// Methods
	public Vehicle getVehicle() {
		return this.vehicle;
	}

	abstract public void BuildFrame();

	abstract public void BuildEngine();

	abstract public void BuildWheels();

	abstract public void BuildDoors();

}
