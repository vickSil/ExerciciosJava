package br.com.senai.vitoriasilva.application;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.com.senai.vitoriasilva.model.Linguagem;

@SuppressWarnings("serial")
@RequestScoped
@Named("cadastro")

public class CadastroBean implements Serializable {

	private String nome;
	private String email;
	private String senha1;
	private String senha2;
	private String sexo;
	private Boolean receberEmails;
	private String observacoes;
	private Integer[] linguagens;
	
		/* puxando lista de linguagens cadastradas */
	public Linguagem[] getListaLinguagens() {
		return Linguagem.LINGUAGENS;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha1() {
		return senha1;
	}
	public void setSenha1(String senha1) {
		this.senha1 = senha1;
	}
	public String getSenha2() {
		return senha2;
	}
	public void setSenha2(String senha2) {
		this.senha2 = senha2;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public Boolean getReceberEmails() {
		return receberEmails;
	}
	public void setReceberEmails(Boolean receberEmails) {
		this.receberEmails = receberEmails;
	}
	public String getObservacoes() {
		return observacoes;
	}
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	public Integer[] getLinguagens() {
		return linguagens;
	}
	public void setLinguagens(Integer[] linguagens) {
		this.linguagens = linguagens;
	}
	/* trazer uma representação trextual daquilo que estiver salvo na instância de um objeto */
	public String getLinguagensAsString() {
		/* usando variavel str para guardar os valores da lista de linguagens e mostra-las na tela */
		String str = "";
		boolean first = true;
		
		/* laço for para ler a lista de linguagens(constante) */
		for(Integer linguagem : linguagens) {
			if(!first) {
				str += ",";
			}
			/* puxando o nome da linguagem para mostrar */
			str += Linguagem.LINGUAGENS[linguagem].getNome();
			first = false;
		}	
		/* retornando os valores atribuidos a variavel str */
		return str;
	}
	
	
}
