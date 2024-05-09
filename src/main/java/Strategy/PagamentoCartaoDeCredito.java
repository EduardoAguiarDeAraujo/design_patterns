package Strategy;

import java.math.BigDecimal;

//Estrategia - Concreta
public class PagamentoCartaoDeCredito implements Pagamento {

	@Override
	public void pagar(BigDecimal valor) {
		// TODO Auto-generated method stub
		System.out.println("Pagou com cartao de credito: "+ valor);
	}

}
