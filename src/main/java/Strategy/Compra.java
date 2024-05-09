package Strategy;

import java.math.BigDecimal;

//Contexto
public class Compra {
	
	private BigDecimal valor;
	
	public Compra (BigDecimal valor) {
		this.valor = valor;
	}
	
	public void processarPagamento(Pagamento pagamento) {
		pagamento.pagar(valor);
	}

}
