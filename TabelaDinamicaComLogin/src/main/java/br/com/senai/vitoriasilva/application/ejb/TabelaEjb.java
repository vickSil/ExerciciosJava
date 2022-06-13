package br.com.senai.vitoriasilva.application.bean;      
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.context.RequestScoped;
import javax.faces.model.ListDataModel;
import javax.inject.Named;

import br.com.senai.vitoriasilva.application.model.Despesa;
package br.com.rafaelcosta.jpa.ejbbean;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.rafaelcosta.jpa.model.Tarefa;

//cada dado é tratado com base nas niformações disponiveis no momento da interação
//não mantém relação com as interações anteriores
@Stateless
public class TabelaBean {


	//responsavel pela conexao com banco de dados
	@PersistenceContext
	private EntityManager em;
	
	//persist faz parte da jpa
	//insere
	public void inserir(Despesa despesa) {
		
		em.persist(despesa);
		
	}
	
	//edtar com método direto
	public void atualizar(Despesa despesa) {
		em.merge(despesa);
	}
	//excluir com métodos diretos
	public void excluir(Despesa despesa) {
		despesa = carregar(despesa.getId());
		em.remove(despesa);
	}
	
	
	//quando for mexer com o banco, tem que carregar a lista, tabela, etc
	//esse comando carrega ela
	public despesa carregar(int id) {
		return em.find(despesa.class, id);
	}
}
