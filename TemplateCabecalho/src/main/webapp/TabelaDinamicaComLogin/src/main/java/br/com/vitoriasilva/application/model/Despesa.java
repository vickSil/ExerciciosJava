package br.com.vitoriasilva.application.model;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.rafaelcosta.jpa.model.Tarefa;

//cada dado é tratado com base nas niformações disponiveis no momento da interação
//não mantém relação com as interações anteriores
@Stateless
public class TarefaBean {


	//responsavel pela conexao com banco de dados
	@PersistenceContext
	private EntityManager em;
	
	//persist faz parte da jpa
	//insere
	public void inserir(Tarefa tarefa) {
		
		em.persist(tarefa);
		
	}
	
	//edtar com método direto
	public void atualizar(Tarefa tarefa) {
		em.merge(tarefa);
	}
	//excluir com métodos diretos
	public void excluir(Tarefa tarefa) {
		tarefa = carregar(tarefa.getId());
		em.remove(tarefa);
	}
	
	
	//quando for mexer com o banco, tem que carregar a lista, tabela, etc
	//esse comando carrega ela
	public Tarefa carregar(int id) {
		return em.find(Tarefa.class, id);
	}
}
