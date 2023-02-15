package javabean;

public class Conta {
	
	double saldo;
	int agencia;
	int numero;
	String titular;
	int taxaselic;
	
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public void retirar(double valor) {
		this.saldo -= valor;
	}
	
	public void definirTaxaSelic(int taxa) {
		this.taxaselic = taxa;
	}
	
	public void investir(double valor) {
		this.saldo = (this.saldo*this.taxaselic) + valor;
	}
	
	public void transferir(double valor, Conta Destino) {
		this.saldo -= valor;
		Destino.saldo += valor;
	}

}
