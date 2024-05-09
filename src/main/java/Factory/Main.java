package Factory;

public class Main {
	
	public static void main(String[] args) {
		
		Carro car = new CarroFactory().getCar("FUSCA");
		
		System.out.println("Carro selecionado: " + car.getNome() + "; preco: " + car.getPreco());
		
	}

}
