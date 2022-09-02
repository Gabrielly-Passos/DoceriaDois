package br.com.doceriadois.beans;

public class Brigadeiro extends Doce {
	
	private double quantLeite;

	public double getQuantLeite() {
		return quantLeite;
	}

	public void setQuantLeite(double quantLeite) {
		this.quantLeite = quantLeite;
	}
	
	@Override /*Uma anotação de Código para efetuar a amarração todas a annotations começa co*/
	public String mostrarAtributos() {
		return " O nome do Brigadeiro é " + getNome() + 
				"\n A quantidade de açucar é " + getAcucar() +
				"\n A quantidade de Leite é " + getQuantLeite()  ;
	}
	
	@Override
	public int mostrarObjeto() {
		return 56;
		}
	
	
}
