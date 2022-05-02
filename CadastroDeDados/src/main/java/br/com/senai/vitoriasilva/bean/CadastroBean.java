package br.com.senai.vitoriasilva.bean;

import java.io.Serializable;

import br.com.senai.vitoriasilva.model.Endereco;
import br.com.senai.vitoriasilva.model.Estado;
import br.com.senai.vitoriasilva.model.Pessoa;
import br.com.senai.vitoriasilva.model.Telefone;

public class CadastroBean implements Serializable{

	private Pessoa pessoa;
	
	public Pessoa getPessoa() {
		if (pessoa == null) {
			pessoa = new Pessoa();
			pessoa.setEnderecoResidencial(new Endereco());
			pessoa.getEnderecoResidencial().setEstado(new Estado());
			pessoa.setEnderecoComercial(new Endereco());
			pessoa.getEnderecoComercial().setEstado(new Estado());
			pessoa.setTelefoneResidencial(new Telefone());
			pessoa.setTelefoneCelular(new Telefone());
			pessoa.setTelefoneComercial(new Telefone());
			
		}
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	 public List<Estado>{
		 
	 }
	
	
	
}
