package br.edu.ifpb.pweb.colegialis.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="julgamentobean")
@SessionScoped
public class JulgamentoBean {

	
	@ManagedProperty(value="#{reunioesbean}")
	private ReunioesBean reunioes; 
	private int reuniaoAberta; 

	
}
