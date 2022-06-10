package br.com.senai.vitoriasilva.application.model;

import java.util.Date;

public class Despesa {
	
	private String data;
	private String descricao;
	private Double valor;
	private boolean edit;
	
	//método get = vai puxar o valor atribuido a variavel
	public String getData() {
		return data;
	}
	//método set = vai atribuir valor a variavel
	public void setData(String data) {
		this.data = data;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public boolean getEdit() {
		return edit;
	}
	public void setEdit(boolean edit) {
		this.edit = edit;
	}
	
	

}
