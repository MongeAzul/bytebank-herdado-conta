package br.com.bytebank.banco.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TesteLambdaSimples {
	
	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<>();
		nomes.add("Mario");
		nomes.add("Yoshi");
		nomes.add("Luigi");
		nomes.add("Donkey Kong");
		
		
		//   -> Lambda
		//o laço for tornou-se uma simples chamada de um método
		System.out.println("Usando lambda para chamar um método\n----------------------------");
		nomes.forEach((nome) -> System.out.println(nome));
		
		System.out.println("\n\n\n\n");
		
		
		//Iterador é um objeto que possui no mínimo dois métodos: hasNext() e next()
		System.out.println("Usando Iterator\n--------------------------");
		Iterator<String> it = nomes.iterator();

		while(it.hasNext()) {
		  System.out.println(it.next());
		}
		
	}

}
