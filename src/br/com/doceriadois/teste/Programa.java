package br.com.doceriadois.teste;

import java.util.ArrayList;
import java.util.List;

import br.com.doceriadois.beans.Brigadeiro;

public class Programa {

	public static void main(String[] args) {
	   
		Brigadeiro brigadeiroMaracuja = new Brigadeiro();
		
		brigadeiroMaracuja.setNome("Brigadeiro Maracujá");
		brigadeiroMaracuja.setAcucar(5);
		brigadeiroMaracuja.setQuantLeite(20);
		
		
       Brigadeiro brigadeiroCoco = new Brigadeiro();
		
       brigadeiroCoco.setNome("Brigadeiro Maracujá");
       brigadeiroCoco.setAcucar(10);
       brigadeiroCoco.setQuantLeite(6);
       
       Brigadeiro brigadeiroLimao = new Brigadeiro();
		
       brigadeiroLimao.setNome("Brigadeiro Maracujá");
       brigadeiroLimao.setAcucar(8);
       brigadeiroLimao.setQuantLeite(52);
		
		
		
		
		List<Brigadeiro> brigadeiroSabores = new ArrayList<Brigadeiro>();
		
		brigadeiroSabores.add(brigadeiroMaracuja);
		brigadeiroSabores.add(brigadeiroCoco);
		brigadeiroSabores.add(brigadeiroLimao);
		
		for(Brigadeiro b : brigadeiroSabores)
		{System.out.println("O nome do brigadeiro é  " + b.getNome() 
		+ ", quantidade de açucar é " + b.getAcucar() 
		+ ", a quantidade de leite é " + b.getQuantLeite() + " Litros. "
		                                                            );
			
		}
		
		

	}

}
