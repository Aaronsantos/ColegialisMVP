package br.edu.ifpb.pweb.colegialis.bean;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import br.edu.ifpb.pweb.colegialis.model.Reuniao;

@ManagedBean(name="julgamentobean")
@SessionScoped
public class JulgamentoBean {

	
	@ManagedProperty(value="#{reunioesbean}")
	private ReunioesBean reunioes; 
	private String id;
	private Reuniao reuniao;
	
	@PostConstruct
	public void init() {
		
		String id = FacesContext.getCurrentInstance().
        getExternalContext().getRequestParameterMap().get("id");
		
		this.loadReuniao(id);
		
	}
	
	public ReunioesBean getReunioes() {
		return reunioes;
	}
	public void setReunioes(ReunioesBean reunioes) {
		this.reunioes = reunioes;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public void loadReuniao(String id) {
		
		this.reuniao = this.reunioes.reuniaoById(id);
	}
	public Reuniao getReuniao() {
		return reuniao;
	}
	public void setReuniao(Reuniao reuniao) {
		this.reuniao = reuniao;
	}

	
}
