package br.edu.ifpb.pweb.colegialis.bean;

import java.util.ArrayList;
import java.util.Date;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import br.edu.ifpb.pweb.colegialis.model.Processo;
import br.edu.ifpb.pweb.colegialis.model.Professor;
import br.edu.ifpb.pweb.colegialis.model.Reuniao;
import br.edu.ifpb.pweb.colegialis.model.Status;

@ManagedBean(name = "reunioesbean")
@ApplicationScoped
public class ReunioesBean {

	private ArrayList<Reuniao> reunioes;

	@PostConstruct
	public void init() {

		this.reunioes = new ArrayList<Reuniao>();

		Professor p1, p2, p3, p4, p5, p6;

		p1 = new Professor("Fred", "TSI", false);
		p2 = new Professor("Luiz Carlos", "TSI", false);
		p3 = new Professor("Valéria Cavalcanti", "TSI", false);
		p4 = new Professor("Candido", "TSI", true);
		p5 = new Professor("Fausto", "TSI", false);
		p6 = new Professor("Damires", "TSI", false);

		Processo pf1, pf2, pf3;

		pf1 = new Processo(1, "Solicitação de trancamento de matricula por aluno Aaron Santos", p2, true, true, 0, 0);
		pf2 = new Processo(2, "Solicitação de reaproveitamento de disciplina por aluno Gesoaldo", p5, true, true, 0, 0);
		pf3 = new Processo(3, "Solicitação de trancamento de matricula por aluna Larissa Moreira", p6, true, true, 0, 0);

		ArrayList<Professor> colegiado = new ArrayList<Professor>();
		colegiado.add(p1);
		colegiado.add(p2);
		colegiado.add(p3);
		colegiado.add(p5);
		colegiado.add(p6);

		ArrayList<Processo> r1Pauta = new ArrayList<Processo>();
		r1Pauta.add(pf1);
		r1Pauta.add(pf2);
		r1Pauta.add(pf3);

		Reuniao r1 = new Reuniao("20191", new Date(), p4, colegiado, r1Pauta, "Reunião do colegiado de TSI em 2019",
				Status.PLANEJADA);

		this.reunioes.add(r1);
	}

	public ArrayList<Reuniao> getReunioes() {
		return this.reunioes;
	}

	public void setReunioes(ArrayList<Reuniao> reunioes) {
		this.reunioes = reunioes;
	}

	public String abrirReuniao(String id) {
		return "/reuniao.xhtml?faces-redirect=true&id=" + id;
	}

	public Reuniao reuniaoById(String id) {
		for (Reuniao reuniao : this.reunioes) {
			if (reuniao.getId().equals(id))
				return reuniao;
		}
		return null;
	}

}
