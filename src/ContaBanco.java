import java.util.Scanner;

public class ContaBanco {
	/*TODO:
	 * Conhecer/importar classe Scanner OK
	 * Exibir as mensagens propostas para o usuário OK
	 * Obter os valores digitados no terminal OK
	 * Exibir a mensagem conta criada OK
	 * */
	
	public static void main (String [] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numeroConta;
		String agencia;
		String nomeCliente;
		double saldoConta;
		
		System.out.println("Olá, futuro cliente! Digite o número da sua conta: ");
		numeroConta = scanner.nextInt();
		System.out.println("Agora, digite sua agência (o formato deve ser xxx-x): ");
		agencia = scanner.next();
		System.out.println("Insira seu nome, por favor: ");
		nomeCliente = scanner.next();
		System.out.println("E, por úlitmo, digite o saldo que deseja transferir para sua conta: ");
		saldoConta = scanner.nextDouble();
		
		System.out.println("Olá, "+nomeCliente+
				", obrigado por abrir uma conta em nosso banco! Sua agência é "+agencia+
				"; o número de sua conta é "+numeroConta+
				"; e seu saldo de "+saldoConta+
				" já está disponível para resgate!");
		scanner.close();
	}
	
}
