package br.furb.programacaoii.problema3.main;

import java.util.Date;

import br.furb.programacaoii.problema3.controller.PedidoController;
import br.furb.programacaoii.problema3.exception.TipoEntregaInvalido;
import br.furb.programacaoii.problema3.factory.ControllerFactory;
import br.furb.programacaoii.problema3.model.ModalidadeFrete;
import br.furb.programacaoii.problema3.model.Pedido;
import br.furb.programacaoii.problema3.model.Produto;

public class Main {

	public static void main(String[] args) {

		Pedido pedido = new Pedido();
		pedido.setData(new Date());
		pedido.setEndereco("Rua da furb");
		pedido.setNomeCliente("Nome do cliente");
		pedido.setNumero(1);
		pedido.setModalidadeFrete(ModalidadeFrete.PAC);
                Produto p = new Produto("teste", 10, 50);
                pedido.incluirItem(p, 1000);
                
                try {
			ControllerFactory.getController(PedidoController.class).definirValorEntrega(pedido);
                        
		} catch (TipoEntregaInvalido e) {
			e.printStackTrace();
		}
	}

}
