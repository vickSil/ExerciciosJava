package br.com.rafaelcosta.application.ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.rafaelcosta.application.model.Produto;

@Stateless
public class ProdutoBean {

	@PersistenceContext
	//esse "em" vai ser a entidade que gerencia os dados do mysql
	private EntityManager em;
	//nesse método, o valor da lista é atribuido ao em com uma query
	public List<Produto> listar() {
		return em.createQuery("SELECT p FROM Produto p", Produto.class).getResultList();
	}
}
