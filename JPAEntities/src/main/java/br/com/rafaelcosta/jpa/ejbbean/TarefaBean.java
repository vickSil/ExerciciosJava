package br.com.rafaelcosta.jpa.ejbbean;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.rafaelcosta.jpa.model.Tarefa;

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
	
	public void atualizar(Tarefa tarefa) {
		em.merge(tarefa);
	}
	
	public void excluir(Tarefa tarefa) {
		tarefa = carregar(tarefa.getId());
		em.remove(tarefa);
	}
	
	
	//quando for mexer com o banco, tem que carregar a lista, tabela, etc
	public Tarefa carregar(int id) {
		return em.find(Tarefa.class, id);
	}
}
