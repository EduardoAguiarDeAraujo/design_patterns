package Proxy;

public class LogProdutoDAO extends ProdutoDAO {
	
	@Override
	public Object find(long id) {
		System.out.println("Buscando produto com id: "+ id);
		return super.find(id);
	}

}
