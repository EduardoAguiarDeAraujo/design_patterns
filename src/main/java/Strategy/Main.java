package Strategy;

import java.math.BigDecimal;

//Estrategia - Interface
//Estrategia - Concreta
//Contexto

public class Main {
	
	public static void main(String[] args) {
		
		BigDecimal valor = new BigDecimal("10");
		Compra compra = new Compra(valor);
		
		compra.processarPagamento(new PagamentoCartaoDeDebito());
		compra.processarPagamento(new PagamentoCartaoDeCredito());
		compra.processarPagamento(new PagamentoPIX());
		
	}

}
