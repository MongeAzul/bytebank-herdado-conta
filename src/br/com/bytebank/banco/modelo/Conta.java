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
	 * Construtor para inicializar o objeto Conta a partir da agencia e do n�mero
	 * 
	 * @param agencia
	 * @param numero
	 */
	
	//construtor
	public Conta(int agencia, int numero) {
		
		//N�o pode ter ag�ncia com n�mero negativo
		if (agencia < 1) {
			throw new IllegalArgumentException("Ag�ncia inv�lida");
		}
		
		//N�o pode ter n�mero da conta negativo
		if (numero < 1) {
			throw new IllegalArgumentException("N�mero da conta inv�lido");
		}
		
		Conta.total++;
		this.agencia = agencia;
		this.numero = numero;
	}

	
	// fun��es
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
	
	//normalmente m�todos que alteram atributo s�o void
	public void setNumero(int novoNumero) {
		if(numero <= 0) {
			System.out.println("Aten��o! Erro! N�o pode valor menor ou igual a zero");
			return;
		}
		this.numero = novoNumero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("N�o pode valor menor ou igual a zero!");
			return; //como � void, isso para a execu��o
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
		return "N�mero: " + this.numero + ",  Ag�ncia: " + this.agencia;
	}
	
	@Override
	public int compareTo(Conta outra) {
		return Double.compare(this.saldo, outra.saldo);
	}

}
