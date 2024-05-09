package Singleton;

public enum ProdutoFactory2 {
	INSTANCE;
	
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
