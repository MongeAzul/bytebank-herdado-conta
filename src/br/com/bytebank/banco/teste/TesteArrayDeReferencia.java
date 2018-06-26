package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayDeReferencia {
	
	public static void main(String[] args) {
		
		Conta[] contas = new Conta[5];
		
		ContaCorrente cc1 = new ContaCorrente(123, 456);
		ContaPoupanca cc2 = new ContaPoupanca(234, 567);
		
		contas[0] = cc1;
		contas[1] = cc2;
		
		System.out.println(contas[0].getNumero());
		
		//alterou o tipo realizando cast
		ContaCorrente ref = (ContaCorrente) contas[0];
		
		System.out.println(cc2.getNumero());
		System.out.println(ref.getNumero());
		
	}

}
