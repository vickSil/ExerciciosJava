package br.com.senai.vitoriasilva.business;

import java.util.ArrayList;
import java.util.List;

import br.com.senai.vitoriasilva.model.Estado;
import br.com.senai.vitoriasilva.model.Interesse;

public class Constants {

	public static final List<Estado> ESTADOS;
	public static final List<Interesse> INTERESSE;	
	
	
	//static, roda uma vez preenchendo os campos 
	static {
		ESTADOS = new ArrayList<>();
		ESTADOS.add(new Estado("Acre","AC"));
		ESTADOS.add(new Estado("Alagoas","AL"));
		
	}
	
}
