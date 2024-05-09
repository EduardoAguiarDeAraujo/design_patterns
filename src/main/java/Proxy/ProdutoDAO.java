package Proxy;

public class ProdutoDAO implements IProdutoDAO {
	
	public ProdutoDAO() {
		System.out.println("Criando conexão com o banco");
		simulaTempoAlto();
	}

	public Object find(long id) {
		System.out.println("Buscando produto na base");
		simulaTempoAlto();
		return new Object();
	}
	
	private void simulaTempoAlto() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
