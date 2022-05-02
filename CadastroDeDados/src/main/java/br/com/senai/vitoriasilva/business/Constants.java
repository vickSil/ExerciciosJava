package br.com.senai.vitoriasilva.business;

import java.util.ArrayList;
import java.util.List;

import br.com.senai.vitoriasilva.model.Estado;
import br.com.senai.vitoriasilva.model.Interesse;

public class Constants {

	public static final List<Estado> ESTADOS;
	public static final List<Interesse> INTERESSES;	
	
	
	//static, roda uma vez preenchendo os campos 
	static {
		ESTADOS = new ArrayList<>();
		ESTADOS.add(new Estado("Acre","AC"));
		ESTADOS.add(new Estado("Alagoas","AL"));
		ESTADOS.add(new Estado("Amazonas","AL"));
		ESTADOS.add(new Estado("Bahia","BA"));
		ESTADOS.add(new Estado("Cear�","CE"));
		ESTADOS.add(new Estado("Esp�rito Santo","ES"));
		ESTADOS.add(new Estado("Minas Gerais","MG"));
		ESTADOS.add(new Estado("Paran�","PR"));
		ESTADOS.add(new Estado("Rio de Janeiro","RJ"));
		ESTADOS.add(new Estado("Santa Catarina","SC"));
		ESTADOS.add(new Estado("S�o Paulo","SP"));
		
		INTERESSES = new ArrayList<>();
		INTERESSES.add(new Interesse("Esportes"));
		INTERESSES.add(new Interesse("M�sica"));
		INTERESSES.add(new Interesse("Artes Marciais"));
		INTERESSES.add(new Interesse("Viagens"));
		INTERESSES.add(new Interesse("Cinema"));
		INTERESSES.add(new Interesse("Dan�a"));
		
		
	}
	
}
