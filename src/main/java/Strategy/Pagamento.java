package Strategy;

import java.math.BigDecimal;

public interface Pagamento {//Estrategia - Interface
	
	void pagar(BigDecimal valor);

}
