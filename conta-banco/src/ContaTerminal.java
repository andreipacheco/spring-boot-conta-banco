import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando e recebendo os dados da conta bancária
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o seu Nome:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o seu Saldo:");
        double saldo = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Por favor, digite o tipo de conta (1 para PJ, 2 para PF):");
        int tipoConta = scanner.nextInt();

        // Determinando o tipo de conta
        String tipoContaStr;
        if (tipoConta == 1) {
            tipoContaStr = "PJ";
        } else if (tipoConta == 2) {
            tipoContaStr = "PF";
        } else {
            tipoContaStr = "Desconhecido";
        }

        // Exibindo a mensagem final
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta " + tipoContaStr + " em nosso banco. Sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        // Fechando o scanner
        scanner.close();
    }
}