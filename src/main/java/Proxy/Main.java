package Proxy;

public class Main {
	
	public static void main(String[] args) {
//		ProdutoDAO produtoDAO = new ProdutoDAO();
//		ProdutoDAO produtoDAO = new LogProdutoDAO();
//		IProdutoDAO produtoDAO = new CacheProdutoDAO();
		IProdutoDAO produtoDAO = new LazyProdutoDAO();
		ProdutoService produtoService = new ProdutoService(produtoDAO);
		System.out.println("Criando produto service");
		
		produtoService.buscarProduto(1);
		produtoService.buscarProduto(2);
		produtoService.buscarProduto(3);

		produtoService.buscarProduto(3);
		produtoService.buscarProduto(3);
		produtoService.buscarProduto(3);

	}

}
