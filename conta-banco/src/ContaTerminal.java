import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        String nomeCliente;
        int conta;
        String agencia;
        double saldo;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Por favor, informe o nome do cliente:");
            nomeCliente = scanner.nextLine();
            System.out.println("Por favor, informe o número da conta sem dígito: ");
            conta = scanner.nextInt();
            System.out.println("Por favor, informe o número da agência e dígito: ");
            agencia = scanner.next();
            System.out.println("Por favor, informe o saldo:");
            saldo = scanner.nextDouble();
        }

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$%.2f já está disponível para saque.%n", nomeCliente, agencia, conta, saldo);
    }
}
