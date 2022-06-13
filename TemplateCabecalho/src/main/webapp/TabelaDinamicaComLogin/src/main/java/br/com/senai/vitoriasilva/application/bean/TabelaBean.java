package br.com.senai.vitoriasilva.application.bean;      
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.context.RequestScoped;
import javax.faces.model.ListDataModel;
import javax.inject.Named;

import br.com.senai.vitoriasilva.application.model.Despesa;

@SuppressWarnings("serial")
@RequestScoped
@Named("tabela")

@Stateless
public class TabelaBean implements Serializable{ 
	
	private List<Despesa> despesaList = new ArrayList<>();   
	private ListDataModel<Despesa> despesa = new ListDataModel<>(despesaList); 
	
	public String inserir() {                         
		Despesa d = new Despesa();
		d.setEdit(true);
		despesaList.add(d);		
		return null;
	}

	public String excluir(Despesa despesa) {        
		despesaList.remove(despesa);
		return null;
	}
	
	public String editar(Despesa despesa) {   
		despesa.setEdit(true);                
		return null;
	}
	
	public String gravar(Despesa despesa) {  
		despesa.setEdit(false);
		return null;
	}
	
	public ListDataModel<Despesa> getDespesa(){        
		return despesa;                                
	}
}

