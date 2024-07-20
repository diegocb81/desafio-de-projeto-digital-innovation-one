package desafioDioBanco;

public class Main {

	public static void main(String[] args) {
		Cliente diego = new Cliente();
		diego.setNome("Diego");
		
		Conta cc = new ContaCorrente(diego);
		Conta poupanca = new ContaPoupanca(diego);
		
		cc.depositar(100);
		cc.transferir(100.00, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
