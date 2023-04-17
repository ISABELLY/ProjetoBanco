
class Cliente {
	
	private int codigo;
	private String nome;
	private Conta conta;
	private int idade;
	
	public Cliente(){
		this.conta = new Conta();
	}
	
	public Cliente(int codigo, String nome, Conta conta){
		this.codigo = codigo;
		this.nome = nome;
		this.conta = conta;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public int getIdade(){
		return  idade;
	}
	
	public void setIdade(int idade){
		if(idade >= 18){
			this.idade = idade;
		}else{
			System.out.println("A idade nao pode ser cadastrada!");
		}
	}

}
