package br.com.senai.vitoriasilva.model;

public class Estado {

	String nome;
	String sigla;
	
	
	public Estado() {
		
	}
	public Estado(String nome, String sigla) {
		this.nome = nome;
		this.sigla = sigla;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
