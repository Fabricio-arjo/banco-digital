
public class Main {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente(null, 0, null);
		Cliente cliente2 = new Cliente(null, 0, null);
		
			
		cliente1.setNome("Cliente 1");
		cliente1.setTelefone(999999999);
		cliente1.setEmail("cliente@cliente.com");
		
		
					
		ContaCorrente cc = new ContaCorrente(cliente1);
		cc.depositar(100.00);
		cc.imprimirExtrato();
		
		
		
		
				
		cliente2.setNome("Cliente 2");
		cliente2.setTelefone(888888888);
		cliente2.setEmail("cliente2@cliente.com");
		
				
		ContaPoupanca poupanca2 = new ContaPoupanca(cliente2);
				
		poupanca2.imprimirExtrato();
		
	}

}
