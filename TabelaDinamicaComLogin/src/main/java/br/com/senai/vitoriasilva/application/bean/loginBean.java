package br.com.senai.vitoriasilva.application.bean;


import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;


@SuppressWarnings("serial")
@Named
@RequestScoped 

public class loginBean implements Serializable{

	private String nome;
	private String senha;
	
	@PostConstruct
	public void onCreate() {
		System.out.println("Bean Criado!");
	}
	
	@PreDestroy
	public void onDestroy(){
		System.out.println("Bean será Destruído!");
	}
	
	public String doLogin(){
		if("abc".equals(nome) && "123".equals(senha) ){
			return "despesas";
		}
		return null;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
