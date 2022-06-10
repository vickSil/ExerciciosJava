package br.com.senai.vitoriasilva.model;

public class Linguagem {

	private Integer id;
	private String nome;
	/* constante linguagem */
	public static final Linguagem[] LINGUAGENS;
	
	static {
		/* reservando espaço para inserir as linguagens */
		LINGUAGENS = new Linguagem[5];
		/* inserindo linguagens que mais tarde serão listadas */
		LINGUAGENS[0] = new Linguagem(1, "Java");
		LINGUAGENS[1] = new Linguagem(2, "IOS");
		LINGUAGENS[2] = new Linguagem(3, "C++");
		LINGUAGENS[3] = new Linguagem(4, "C#");
		LINGUAGENS[4] = new Linguagem(5, "PHP");
	}
	/* atribuiçõ de valores e id ao campo linguagem */
	public Linguagem(Integer id, String nome) {
		this.setId(id);
		this.setNome(nome);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
