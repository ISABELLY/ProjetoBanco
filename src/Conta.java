
class Conta {
	
	int numero_conta;
	Cliente cliente;
	float saldo;
	float limite;
	
	public Conta(){
		
	}
	
	public Conta(int numero, float saldo, float limite){
		this.numero = numero;
		this.saldo = saldo;
		this.limite = limite;
	}
	
	void sacar(float valorSaque){
		if(valorSaque <= saldo){
			this.saldo -= valorSaque;
		}else{
			System.out.println("Nao e possivel realziar o saque!");
		}
	}
	
	void depositar(float valorDeposito){
		this.saldo += valorDeposito;
	}
	
	void transferir(Conta contaDestino, float valor){
		if(valor <= saldo){
			this.saldo -= valor;
			contaDestino.saldo += valor;
		}else{
			System.out.println("Nao e possivel realizar a transferiencia");
		}
	}

}
