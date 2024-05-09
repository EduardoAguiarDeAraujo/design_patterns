package Builder;

import java.util.HashMap;
import java.util.Map;

class Vehicle {
// Fields
	private String type;
	private Map<String, String> parts = new HashMap<String, String>();

// Methods
	public Vehicle(String type) {
		this.type = type;
	}

	public Object getParts(String key) {
		return this.parts.get(key);
	}

	public void setParts(String key, String value) {
		this.parts.put(key, value);
	}

	public void show() {
		System.out.println("---------------------------");
		System.out.println("Vehicle Type: " + this.type);
		System.out.println(" Frame : " + this.getParts("frame"));
		System.out.println(" Engine : " + this.getParts("engine"));
		System.out.println(" #Wheels: " + this.getParts("wheels"));
		System.out.println(" #Doors : " + this.getParts("doors"));
		System.out.println();
	}
}