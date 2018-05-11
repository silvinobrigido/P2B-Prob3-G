package br.furb.programacaoii.problema3.model;

import java.util.ArrayList;
import java.util.Date;

public class Pedido {

	private int numero;
	private String nomeCliente;
	private Date data;
	private String endereco;
	private double valorEntrega;
	private ModalidadeFrete modalidadeFrete;
	private ArrayList<ItemPedido> itens;

	public Pedido() {
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public void incluirItem(Produto p, int qtd) {
		this.itens.add(new ItemPedido(p, qtd));
	}

	public double getValorPedido() {
		double valorTotal = 0;
		for (ItemPedido ip : this.itens) {
			valorTotal += (ip.getValorItem());
		}
		return valorTotal;
	}

	public double getValorEntrega() {
		return valorEntrega;
	}

	public void setValorEntrega(double valorEntrega) {
		this.valorEntrega = valorEntrega;
	}

	public double getValorTotal() {
		return getValorPedido() + getValorEntrega();
	}

	public ModalidadeFrete getModalidadeFrete() {
		return modalidadeFrete;
	}

	public void setModalidadeFrete(ModalidadeFrete modalidadeFrete) {
		this.modalidadeFrete = modalidadeFrete;
	}

	public ArrayList<ItemPedido> getItens() {
		return itens;
	}

}
