package Strategy;

import java.math.BigDecimal;

public class PagamentoPIX implements Pagamento {

	@Override
	public void pagar(BigDecimal valor) {
		System.out.println("Pagou com PIX: "+ valor);
	}

}
