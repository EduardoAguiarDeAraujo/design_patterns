package Factory;

public class CarroFactory {
	private Carro car;

	public Carro getCar(String nome) {
		car = null;
		if (nome.equalsIgnoreCase("FUSCA"))
			car = new Fusca();
		if (nome.equalsIgnoreCase("CIVIC"))
			car = new Civic();
		if (nome.equalsIgnoreCase("BMW"))
			car = new BMW();
		if (nome.equalsIgnoreCase("AUDI"))
			car = new Audi();
		if (nome.equalsIgnoreCase("VOLVO"))
			car = new Volvo();
		return car;
	}
}
