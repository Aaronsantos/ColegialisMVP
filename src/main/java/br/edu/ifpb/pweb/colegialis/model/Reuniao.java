package br.edu.ifpb.pweb.colegialis.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class Reuniao {
	
	private String id;
	private Date data;
	private Professor coordenador; 
	private List<Professor> colegiado;
	private String descricao;
	private List<Processo> pauta;
	@Override
	public String toString() {
		return "Reuniao [id=" + id + ", data=" + data + ", coordenador=" + coordenador + ", colegiado=" + colegiado
				+ ", pauta=" + pauta + ", descricao=" + descricao + "]";
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Professor getCoordenador() {
		return coordenador;
	}

	public void setCoordenador(Professor coordenador) {
		this.coordenador = coordenador;
	}

	public List<Professor> getColegiado() {
		return colegiado;
	}

	public void setColegiado(List<Professor> colegiado) {
		this.colegiado = colegiado;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Processo> getPauta() {
		return pauta;
	}

	public void setPauta(List<Processo> pauta) {
		this.pauta = pauta;
	}

	public Reuniao(String id, Date data, Professor coordenador, List<Professor> colegiado, List<Processo> pauta,
			String descricao) {
		super();
		this.id = id;
		this.data = data;
		this.coordenador = coordenador;
		this.colegiado = colegiado;
		this.pauta = pauta;
		this.descricao = descricao;
	}

	
}
