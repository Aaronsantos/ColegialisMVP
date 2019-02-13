package br.edu.ifpb.pweb.colegialis.bean;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import br.edu.ifpb.pweb.colegialis.model.Processo;
import br.edu.ifpb.pweb.colegialis.model.Reuniao;
import br.edu.ifpb.pweb.colegialis.model.Status;

@ManagedBean(name = "julgamentobean")
@SessionScoped
public class JulgamentoBean {

	@ManagedProperty(value = "#{reunioesbean}")
	private ReunioesBean reunioes;
	private String id;
	private Reuniao reuniao;

	@PostConstruct
	public void init() {
		String id = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap().get("id");
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

	public Processo getProcesso(int id) {
		for (Processo p : this.reuniao.getPauta()) {
			if (p.getId() == id)
				return p;
		}
		return null;
	}

	public void votoFavor(int id) {
		Processo processo = this.getProcesso(id);
		processo.addVotoFavor();
	}

	public void votoContra(int id) {
		Processo processo = this.getProcesso(id);
		processo.addVotoContra();
	}
	
	public String concluir() {
		this.reuniao.setStatusReuniao(Status.ENCERRADA);
		return "reunioes?faces-redirect=true";
	}
}