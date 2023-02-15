package javabean;

public class Runbank {
	public static void main(String[] args) {
		
		
		
		Conta Guilherme = new Conta();
			Guilherme.depositar(5000);
			Guilherme.definirTaxaSelic(2);
			Guilherme.investir(400);
			System.out.println(Guilherme.getSaldo());
			Guilherme.titular = new Cliente();
			
		Conta DyovanaLinda = new Conta();
			DyovanaLinda.depositar(9000);
	
		Guilherme.transferir(3000, DyovanaLinda);
		System.out.println(DyovanaLinda.getSaldo());
		System.out.println(Guilherme.getSaldo());
		
		
		
		
		Conta Gabriel = new Conta();
		Gabriel.depositar(2000);
		
	}

}
