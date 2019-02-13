package br.edu.ifpb.pweb.colegialis.model;

public class Professor {
	
	private String nome; 
	private String curso;
	private Boolean coordenador;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public Boolean getCoordenador() {
		return coordenador;
	}
	public void setCoordenador(Boolean coordenador) {
		this.coordenador = coordenador;
	}
	
	
}
