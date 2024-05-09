package Singleton;

public class Main {
	
	public static void main(String[] args) {
		
		Produto produto1 = ProdutoFactory.getInstance().novoProduto(1);//Opção com Classe
		Produto produto2 = ProdutoFactory2.INSTANCE.novoProduto(2); //Opção com Enum
		Produto produto3 = ProdutoFactory2.INSTANCE.novoProduto(3); //Opção com Enum
		
		produto1.show();
		produto2.show();
		produto3.show();
	}

}
