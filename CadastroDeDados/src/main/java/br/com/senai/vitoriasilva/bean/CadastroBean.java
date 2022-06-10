package br.com.senai.vitoriasilva.bean;

import java.io.Serializable;

import br.com.senai.vitoriasilva.model.Endereco;
import br.com.senai.vitoriasilva.model.Estado;
import br.com.senai.vitoriasilva.model.Pessoa;
import br.com.senai.vitoriasilva.model.Telefone;

public class CadastroBean implements Serializable{

	
	private Pessoa pessoa;
	/* puxando os dados da classe pessoa */
	public Pessoa getPessoa() {
		/* validando, se pessoa não tiver dado, vai mandar inserir os dados em pessoa */
		if (pessoa == null) {
			/* criando construtor */
			pessoa = new Pessoa();
			pessoa.setEnderecoResidencial(new Endereco());
			pessoa.getEnderecoResidencial().setEstado(new Estado());
			pessoa.setEnderecoComercial(new Endereco());
			pessoa.getEnderecoComercial().setEstado(new Estado());
			pessoa.setTelefoneResidencial(new Telefone());
			pessoa.setTelefoneCelular(new Telefone());
			pessoa.setTelefoneComercial(new Telefone());
			
		}
		/* retornando os dados de pessoa */
		return pessoa;
	}
	/* puxando os dados de pessoa */
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	 public List<Estado>{
		 
	 }
	
	
	
}
