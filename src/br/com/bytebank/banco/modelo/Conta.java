package br.com.bytebank.banco.modelo;

import java.io.Serializable;

/**
 * Classe representa a moldura de uma conta.
 * 
 * @author Anderson
 * @version 0.1
 */

//Full Qualified Name -> br.com.bytebank.banco.modelo.Conta
public abstract class Conta implements Comparable<Conta>, Serializable {
	
	private static final long serialVersionUID = 1L;
	// atributos
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	/**
	 * Construtor para inicializar o objeto Conta a partir da agencia e do número
	 * 
	 * @param agencia
	 * @param numero
	 */
	
	//construtor
	public Conta(int agencia, int numero) {
		
		//Não pode ter agência com número negativo
		if (agencia < 1) {
			throw new IllegalArgumentException("Agência inválida");
		}
		
		//Não pode ter número da conta negativo
		if (numero < 1) {
			throw new IllegalArgumentException("Número da conta inválido");
		}
		
		Conta.total++;
		this.agencia = agencia;
		this.numero = numero;
	}

	
	// funções
	public abstract void deposita(double valor);

	/**
	 * Valor precisa ser maior do que o saldo.
	 * 
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */
	
	public void saca(double valor) throws SaldoInsuficienteException {
		if(this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ",  Valor: " + valor);
		} else {
			this.saldo -= valor;
		}
		
	}
	
	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
		this.saca(valor);
		destino.deposita(valor);
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	//normalmente métodos que alteram atributo são void
	public void setNumero(int novoNumero) {
		if(numero <= 0) {
			System.out.println("Atenção! Erro! Não pode valor menor ou igual a zero");
			return;
		}
		this.numero = novoNumero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("Não pode valor menor ou igual a zero!");
			return; //como é void, isso para a execução
		}
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
	
	@Override
	public boolean equals(Object ref) {
		
		Conta outra = (Conta) ref; //Cast
		
		if(this.agencia != outra.agencia) {
			return false;
		}
		
		if(this.numero != outra.numero) {
			return false;
		}
		
		return true;
	}
	
	
	@Override
	public String toString() {
		return "Número: " + this.numero + ",  Agência: " + this.agencia;
	}
	
	@Override
	public int compareTo(Conta outra) {
		return Double.compare(this.saldo, outra.saldo);
	}

}
