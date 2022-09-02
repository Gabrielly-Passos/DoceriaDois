package br.com.doceriadois.beans;

public class Doce {
  
	private String nome;
	private double acucar;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getAcucar() {
		return acucar;
	}
	public void setAcucar(double acucar) {
		this.acucar = acucar;
	}
	

	public String mostrarAtributos() {
		return " O nome do Brigadeiro é  " + getNome() + 
				"\n A quantidade de açucar é " + getAcucar();
	}
	
	
	public int mostrarObjeto() {
	return 56;
	}
}


