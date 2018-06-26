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
		//o la�o for tornou-se uma simples chamada de um m�todo
		System.out.println("Usando lambda para chamar um m�todo\n----------------------------");
		nomes.forEach((nome) -> System.out.println(nome));
		
		System.out.println("\n\n\n\n");
		
		
		//Iterador � um objeto que possui no m�nimo dois m�todos: hasNext() e next()
		System.out.println("Usando Iterator\n--------------------------");
		Iterator<String> it = nomes.iterator();

		while(it.hasNext()) {
		  System.out.println(it.next());
		}
		
	}

}
