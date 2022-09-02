package br.com.doceriadois.teste;

import java.util.ArrayList;
import java.util.List;

import br.com.doceriadois.beans.Brigadeiro;


public class ProgramaDois {

	public static void main(String[] args) {
		
		Brigadeiro brigadeiro = new Brigadeiro();
		
		brigadeiro.setNome("Maça Verde");
		brigadeiro.setAcucar(5);
		brigadeiro.setQuantLeite(25);
		
		  List<Brigadeiro>  brigadeiroSabores = new ArrayList<Brigadeiro>(); 
		  
		  brigadeiroSabores.add(brigadeiro);
		  
		 System.out.println(brigadeiro.mostrarAtributos());
	        
	        
		
	}

}
