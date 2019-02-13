package br.edu.ifpb.pweb.colegialis.model;

public enum Status {
	ENCERRADA("Encerrada"),
	PLANEJADA("Planejada");
	
	private String texto;
	
	private Status(String texto) {
		this.texto = texto;
	}

	public String getTexto() {
		return texto;
	}
	
	public void setTexto(String texto) {
		this.texto = texto;
	}

}
