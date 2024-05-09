package Singleton;

public class ProdutoFactory {

	private static ProdutoFactory instance;
	
	private ProdutoFactory() {
		
	}
	
	public static synchronized ProdutoFactory getInstance() {
		if (instance == null) {
			instance = new ProdutoFactory();
		}
		return instance;
	}

	public Produto novoProduto(int tipoProduto) {
		switch (tipoProduto) {
			case 1:
				return new ProdutoPadrao();
			case 2:
				return new ProdutoDigital();
			case 3:
				return new ProdutoFisico();
			default:
				throw new IllegalArgumentException();
		}
	}

}
