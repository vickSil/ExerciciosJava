package br.com.rafaelcosta.jpa.jsfbean;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.event.AjaxBehaviorEvent;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.rafaelcosta.jpa.ejbbean.TarefaBean;
import br.com.rafaelcosta.jpa.model.Tarefa;

@Named("form")  //nome da pag
@RequestScoped  //tempo de vida da pag, ela funciona somente quando é requisitada com o REquestScoped
public class FormBean implements Serializable {
	
	@EJB  //faz a lógica de negócios
	private TarefaBean tarefaBean;

	@Inject   //pega as informações da tela e traz p/ bean
	private FacesContext context;
	//age na interface do jsf
	private UIComponent searchInputText;
	
	private Integer tarefaId;
	
	private Tarefa tarefa;
	//gravando tarefa
	//se já tiver uma tarefa igual salva,ele vai apenas editar aqulea salva
	//se não, vai salvar uma nova
	public void gravar(AjaxBehaviorEvent event) {
		if(tarefa.getId()==null) {
			tarefaBean.inserir(tarefa);
		}else {
			tarefaBean.atualizar(tarefa);
		}		
	}
	
	//pesquisa de tarefa
	public void pesquisar(AjaxBehaviorEvent event) {
		tarefa = tarefaBean.carregar(tarefaId);
		//se a tarefa for vaiza, a mensagem aparece
		//se não, ele modtrs essa tarefa
		if(tarefa == null) {
			context.addMessage(searchInputText.getClientId(context),
					new FacesMessage("Tarefa n�o encontrada"));
		}
		tarefaId = null;		
	}
	
	public void excluir(AjaxBehaviorEvent event) {
		tarefaBean.excluir(tarefa);
		tarefa = null;
	}
	public Tarefa getTarefa() {
		if(tarefa==null) {
			tarefa = new Tarefa();
		}
		return tarefa;
	}


	
	public UIComponent getSearchInputText() {
		return searchInputText;
	}

	public void setSearchInputText(UIComponent searchInputText) {
		this.searchInputText = searchInputText;
	}

	
	public Integer getTarefaId() {
		return tarefaId;
	}

	public void setTarefaId(Integer tarefaId) {
		this.tarefaId = tarefaId;
	}
	
	
	
}
