package br.com.bytebank.banco.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteNumeroComparator {
	
	public static void main(String[] args) {
		
		//instanciando contas
		Conta cc1 = new ContaCorrente(22, 33);
		Conta cc2 = new ContaPoupanca(22, 44);
		Conta cc3 = new ContaCorrente(22, 11);
		Conta cc4 = new ContaPoupanca(22, 22);
		
		//depositando dinheiro nas contas
		cc1.deposita(333);
		cc2.deposita(444);
		cc3.deposita(111);
		cc4.deposita(222);
		
		//criando lista e adicionando as contas nela
		List<Conta> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);
		
		//lista não ordenada
		for (Conta conta : lista) {
			System.out.println(conta);
		}
		
		//instanciando o comparador e ordenando com o método sort()
		NumeroDaContaComparator comparator = new NumeroDaContaComparator();
		lista.sort(comparator);
		
		System.out.println("---------------------");
		
		//lista ordenada
		for (Conta conta : lista) {
			System.out.println(conta);
		}
		
	}
}



class NumeroDaContaComparator implements Comparator<Conta>{

	@Override
	public int compare(Conta c1, Conta c2) {
		
		return Integer.compare(c1.getNumero(), c2.getNumero());
	
	}
}