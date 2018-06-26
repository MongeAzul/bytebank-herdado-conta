package br.com.bytebank.banco.util;

import java.util.ArrayList;
import java.util.List;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {
    
	public static void main(String[] args) {

		List<Conta> lista = new ArrayList<Conta>();
		
		Conta cc1 = new ContaCorrente(22, 21);
		Conta cc2 = new ContaCorrente(1, 1);
		
		lista.add(cc1);
		
		boolean existe = lista.contains(cc2); //novo
		
		//criação das contas omitidas
		boolean igual = cc1.equals(cc2);
		System.out.println(igual); //deve imprimir true
		
		System.out.println("Já existe? " + existe);
		
		for(Conta conta : lista) {
			System.out.println(conta);
		}
		
     
    }
}
