package br.com.bytebank.banco.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {
	
	public static void main(String[] args) {
		
		Integer idadeRef = 29; //autoboxing, � criado um objeto do tipo Integer
		int primitivo = new Integer(21); //que loucura! unboxing
		
		List<Integer> lista = new ArrayList<>();
		lista.add(idadeRef); //ok
		lista.add(primitivo); //autoboxing
		
		int i1 = lista.get(0); //unboxing
		Integer i2 = lista.get(1); //ok
		
		System.out.println(i1); //29
		System.out.println(i2); //21
		
		
		//m�todos da classe Integer
		Integer valorRef = Integer.valueOf(33); //delegando a cria��o para m�todo ValueOf
		int valorPri = valorRef.intValue(); //desembrulhando, pegando o valor primitivo do objeto wrapper
		System.out.println(valorPri); //33
		
		
		//parsing - convers�o de String para um m�todo espec�fico
		Integer iParseado1 = Integer.valueOf("42"); //parseando e devolvendo refer�ncia
		int iParseado2 = Integer.parseInt("44"); //parseando e devolvendo primitivo
		
		System.out.println(iParseado1); //42
		System.out.println(iParseado2); //44
 		
		
		//constantes da classe Integer
		System.out.println(Integer.MAX_VALUE); //2^16
		System.out.println(Integer.MIN_VALUE); //-2^16
		System.out.println(Integer.SIZE); //4 bits
		System.out.println(Integer.BYTES); //4 bytes
		
		
	}

}
