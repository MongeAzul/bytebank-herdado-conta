package br.com.bytebank.banco.util;

import java.util.ArrayList;
import java.util.List;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {
    public static void main(String[] args) {

        //Generics no ArrayList
    	List<Conta> lista = new ArrayList<Conta>();

        
        Conta cc = new ContaCorrente(22, 11);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(22, 22);
        lista.add(cc2);

        System.out.println("Tamanho: " + lista.size());

        Conta ref = (Conta) lista.get(0);
        System.out.println(ref.getNumero());

        lista.remove(0);
        System.out.println("Tamanho: " + lista.size());

        Conta cc3 = new ContaCorrente(33, 311);
        lista.add(cc3);

        Conta cc4 = new ContaCorrente(33, 322);
        lista.add(cc4);

        //método de software legado
        for(int i = 0; i < lista.size(); i++) {
            Object oRef = lista.get(i);
            System.out.println(oRef);
        }

        System.out.println("----------");

        //método usado por todos
        for(Object oRef : lista) {
            System.out.println(oRef);
        }
        
        
        
        
        ArrayList fila = new ArrayList(26); //capacidade inicial
        fila.add("SP");
        fila.add("CE");
        ArrayList nova = new ArrayList(fila); //criando baseado na primeira lista
     
    }
}
