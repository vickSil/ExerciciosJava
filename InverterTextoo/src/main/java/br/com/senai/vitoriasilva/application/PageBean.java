 package br.com.senai.vitoriasilva.application;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class PageBean implements Serializable {
	
	 String texto;
	 String invertido;

		public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

		public String getInvertido() {
			return invertido;
		}

		public void setInvertido(String invertido) {
			this.invertido = invertido;
		}
		
	public String inverter() {
		invertido = new StringBuilder(texto).reverse().toString();		 
		return null;
				 
	}

}