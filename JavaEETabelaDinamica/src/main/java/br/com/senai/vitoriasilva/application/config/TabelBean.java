package br.com.senai.vitoriasilva.application.config;



import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.faces.model.ListDataModel;
import javax.inject.Named;

import br.com.senai.vitoriasilva.application.model.Despesas;

@SuppressWarnings("serial")
@Named("tabela")
@SessionScoped

public class TabelBean implements Serializable{

	private List<Despesas> despesasList = new ArrayList<>();
	private ListDataModel<Despesas> despesas = new ListDataModel<>(despesasList);
	
	public String inserir() {
		Despesas d = new Despesas();
		despesasList.add(d);
		return null;
	}
	
	public String excluir(Despesas despesa) {
		despesasList.remove(despesa);
		return null;
	}
	
	public String editar(Despesas despesas) {
		despesas.setEdit(true);
		return null;
	}
	
	public String gravar(Despesas despesas) {
		despesas.setEdit(false);
		return null;
	}
	
	public ListDataModel<Despesas> getDespesas(){
		return despesas;
	}
	
}
