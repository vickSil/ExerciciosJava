package br.com.senai.vitoriasilva.model;

public class Interesse {

	Integer id;
	String area;
	
//Construtor recebe o valor na variavel
	
	public Interesse(Integer id, String area) {
		this.id = id;
		this.area = area;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	
}
