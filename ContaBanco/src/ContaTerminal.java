import java.util.Scanner;
/**
 * <h1>ContaBanco</h1>
 * A aplicação recebe os dados via terminal de uma conta em um banco.
 * <p>
 * <b>Note:</b> Leia atentamente a documentação desta classes
 * para desfrutar dos recursos oferecidos pelo autor
 *
 * @author Thalita Meira
 * @version 1.0
 * @since 18/09/2023
 */
public class ContaTerminal {
    /** Este método recebe todas as informações necessárias através do método Scanner, 
     * fazendo a leitura das informações que são inputadas pelo cliente no terminal.
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        // Cria um objeto Scanner para ler dados do terminal
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira o número da Agência
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        // Solicita ao usuário que insira o número da Conta
        System.out.print("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha deixada pelo nextInt()

        // Solicita ao usuário que insira o nome do cliente
        System.out.print("Por favor, digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        // Solicita ao usuário que insira o saldo
        System.out.print("Por favor, digite o saldo: ");
        double saldo = scanner.nextDouble();

        // Fecha o scanner
        scanner.close();

        // Exibe a mensagem com os dados fornecidos pelo usuário
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco,");
        System.out.println("sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

    }

}
