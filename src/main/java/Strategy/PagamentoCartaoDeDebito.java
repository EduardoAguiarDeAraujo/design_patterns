package Strategy;

import java.math.BigDecimal;

//Estrategia - Concreta
public class PagamentoCartaoDeDebito implements Pagamento {

	@Override
	public void pagar(BigDecimal valor) {
		System.out.println("Pagou com cartao de debito: "+ valor);
	}

}
