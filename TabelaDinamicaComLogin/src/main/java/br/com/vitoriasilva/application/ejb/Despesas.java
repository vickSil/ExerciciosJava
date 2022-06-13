package br.com.vitoriasilva.application.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

//cada dado é tratado com base nas niformações disponiveis no momento da interação
//não mantém relação com as interações anteriores
@Stateless
public class Despesas {


	//responsavel pela conexao com banco de dados
	@PersistenceContext
	private EntityManager em;
	
	//persist faz parte da jpa
	//insere
	public void inserir(Despesas tarefa) {
		
		em.persist(tarefa);
		
	}
	
	//edtar com método direto
	public void atualizar(Despesas tarefa) {
		em.merge(tarefa);
	}
	//excluir com métodos diretos
	public void excluir(Despesas tarefa) {
		tarefa = carregar(tarefa.getId());
		em.remove(tarefa);
	}
	
	
	//quando for mexer com o banco, tem que carregar a lista, tabela, etc
	//esse comando carrega ela
	public Despesas carregar(int id) {
		return em.find(Depesas.class, id);
	}
}
