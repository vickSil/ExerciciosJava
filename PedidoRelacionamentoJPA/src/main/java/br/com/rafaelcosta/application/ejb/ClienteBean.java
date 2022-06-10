package br.com.rafaelcosta.application.ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.rafaelcosta.application.model.Cliente;


@Stateless
public class ClienteBean {
	//guarda as entidades que estão sendo usadas com o entity manager
	@PersistenceContext
	//provê um meio de criar consultar,criar e buscar objetos do banco de dados
	private EntityManager em;
	//quando conectado com o banco dedaos, damos comandos mysql para executar no código 
	public List<Cliente> listar() {
		return em.createQuery("SELECT c FROM Cliente c", Cliente.class).getResultList();
	}
}




