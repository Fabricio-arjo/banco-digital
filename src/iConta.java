
public interface iConta {
	
	// Todo método de uma interface já é público.
	
     void sacar(double valor);
	
	 void depositar(double valor);
	
	 void transferir(double valor, Conta contaDestino);
     
	 void imprimirExtrato();
}
