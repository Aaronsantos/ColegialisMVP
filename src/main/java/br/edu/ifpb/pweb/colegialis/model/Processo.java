package br.edu.ifpb.pweb.colegialis.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

public class Processo {
	
	
	private String descricao;
	
	private Professor relator;
	private Boolean decisaoRelator;
	private Boolean resultado;
	private int votosFavor;
	private int votosContra;
	
	public Processo( String descricao, Professor relator, Boolean decisaoRelator, Boolean resultado,
			int votosFavor, int votosContra) {
		super();
		this.descricao = descricao;
		this.relator = relator;
		this.decisaoRelator = decisaoRelator;
		this.resultado = resultado;
		this.votosFavor = votosFavor;
		this.votosContra = votosContra;
	}

	public void addVotoFavor() {
		
		this.votosFavor++; 
	}
	
	public void addVotoContra() {
		
		this.votosContra++; 
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Professor getRelator() {
		return relator;
	}
	public void setRelator(Professor relator) {
		this.relator = relator;
	}
	public Boolean getDecisaoRelator() {
		return decisaoRelator;
	}
	public void setDecisaoRelator(Boolean decisaoRelator) {
		this.decisaoRelator = decisaoRelator;
	}
	public Boolean getResultado() {
		return resultado;
	}
	public void setResultado(Boolean resultado) {
		this.resultado = resultado;
	}
	public int getVotosFavor() {
		return votosFavor;
	}
	public void setVotosFavor(int votosFavor) {
		this.votosFavor = votosFavor;
	}
	public int getVotosContra() {
		return votosContra;
	}
	public void setVotosContra(int votosContra) {
		this.votosContra = votosContra;
	} 
	
	
	

}
