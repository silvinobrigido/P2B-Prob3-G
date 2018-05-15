package br.furb.programacaoii.problema3.strategy.calculo;

import br.furb.programacaoii.problema3.controller.PedidoController;
import br.furb.programacaoii.problema3.exception.TipoEntregaInvalido;
import br.furb.programacaoii.problema3.factory.ControllerFactory;
import br.furb.programacaoii.problema3.model.Pedido;

/**
 * @author silvinos
 */
public class CalculoSedex implements CalculoEntregaStrategy {

	private static CalculoSedex instance;
        private static final int P_500_G = 500;
	private static final int P_750_KG = 750;
	private static final int UM_KG_E_200 = 1200;
	private static final int DOIS_KG = 2000;

	private static final Double DOZE_REAIS = 12.50;
	private static final Double VINTE_REAIS = 20D;
	private static final Double TRINTA_REAIS = 30D;
        private static final Double QUARENTA_CINCO_REAIS = 45D; 
	private CalculoSedex() {
	}

	public static CalculoEntregaStrategy getInstance() {
		if (null == instance) {
			instance = new CalculoSedex();
		}
		return instance;
	}

	@Override
	public double calcularValorEntrega(Pedido pedido) throws TipoEntregaInvalido {
                int pesoPedido = ControllerFactory.getController(PedidoController.class).getPesoPedido(pedido);
                if(pesoPedido <= P_500_G){
                    return DOZE_REAIS;
                } else if (pesoPedido > P_500_G &&  pesoPedido <=P_750_KG){
                    return VINTE_REAIS;
                } else if(pesoPedido > P_750_KG && pesoPedido <=UM_KG_E_200){
                    return TRINTA_REAIS;
                } else if(pesoPedido >= UM_KG_E_200 && pesoPedido <=DOIS_KG){
                    return QUARENTA_CINCO_REAIS;
                } else if(pesoPedido > DOIS_KG){
                    return QUARENTA_CINCO_REAIS; //TO-DO VALOR EXCEDIDO
                }
                
		throw new TipoEntregaInvalido();
	}

}
