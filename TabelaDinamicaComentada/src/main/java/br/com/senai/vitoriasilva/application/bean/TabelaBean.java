package br.com.senai.vitoriasilva.application.bean;      //bean para interface

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.faces.model.ListDataModel;
import javax.inject.Named;

import br.com.senai.vitoriasilva.application.model.Despesa;

//retirando avisos do eclipse
@SuppressWarnings("serial")
//tempo de vida,essa parte só vai ativar(viver) quando for requisitada
@RequestScoped
//nome para chamar essa parte
@Named("tabela")

//persistecia de estado do TabelaBean pela api do java
public class TabelaBean implements Serializable{ 
	
	//gravar tabela e receber lista
	private List<Despesa> despesaList = new ArrayList<>();   
	//construindo lista com jsf
	private ListDataModel<Despesa> despesa = new ListDataModel<>(despesaList); 
	
	//método inserir para adicionar um novo objeto na lista
	public String inserir() {    
		//variavel "d" será o construtor para guardar os valores                         
		Despesa d = new Despesa();
		d.setEdit(true);
		//adicionando item na lista
		despesaList.add(d);		
		return null;
	}

	//método de remoção de um objeto da lista
	public String excluir(Despesa despesa) {         
		despesaList.remove(despesa);
		return null;
	}
	
	//manipulando o objeto
	public String editar(Despesa despesa) {   
		despesa.setEdit(true);            o
		return null;
	}
	
	public String gravar(Despesa despesa) {  
		despesa.setEdit(false);
		return null;
	}
	
	//gget = capturando infrmaç~es para mandar para o jdf
	public ListDataModel<Despesa> getDespesa(){        
		return despesa;                               
}

