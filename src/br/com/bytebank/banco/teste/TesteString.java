package br.com.bytebank.banco.teste;

public class TesteString {
	
	public static void main(String[] args) {
		
		String nome = "Alura"; //objeto literal
		String nome2 = new String("Alura"); //Má prática!!
		
		String vazio = "            ";
		System.out.println(vazio.isEmpty());
		String outroVazio = vazio.trim();
		System.out.println(outroVazio.isEmpty());
		

		
		String outra = nome.replace("A", "a");
		
		String maisUm = nome.toLowerCase();
		
		String maisOutro = nome.toUpperCase();
		
		System.out.println(nome);
		System.out.println(outra);
		System.out.println(maisUm);
		System.out.println(maisOutro);
		
		char c = nome.charAt(2);
		System.out.println(c);
		
		System.out.println(nome.length());
		
		for(int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
		System.out.println(nome.contains("Alu"));
		
		
		String name = "Mario";
		name = name.replace("o", "a");
		System.out.println(name);
		
		
	}

}
