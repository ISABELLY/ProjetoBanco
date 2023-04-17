import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		//Cliente cliente1 = new Cliente();
		CartaoDeCredito cartaoCredito1 = new CartaoDeCredito();
		Scanner in = new Scanner(System.in);
		
		//cliente1.codigo = 100;
		//cliente1.nome = "Joao";
		
		Cliente cliente1 = new Cliente();
		System.out.println("Digite o nome do Cliente: ");
		cliente1.setNome(in.nextLine());
		System.out.println("Digite a idade do cliente: ");
		cliente1.setIdade(in.nextInt());
		
		System.out.println("Nome: " + cliente1.getNome());
		System.out.println("Idade: " + cliente1.getIdade());
		
		
	}

}
