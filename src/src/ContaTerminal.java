import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // TODO: conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in);
        // TODO: exibir as mensagens para o usuário
        // TODO: Obter pela classe Scanner, os valores digitados no terminal
        System.out.println("Digite a agência (XXX-X):");
        String agencia = scanner.next();
        System.out.println("Digite o número da conta:");
        int numeroConta = scanner.nextInt();
        System.out.println("Digite o primeiro nome do titular:");
        String nomeTitular = scanner.next();
        System.out.println("Digite o saldo inicial:");
        double saldo = scanner.nextDouble();
        // TODO: exibir a mensagem final, com a conta criada
        String mensagem = "Olá, " + nomeTitular + ", obrigado por criar uma conta em nosso banco!\n" +
                "Segue abaixo os dados da sua conta:\n" +
                "Agência: " + agencia + "\n" +
                "Número da conta: " + numeroConta + "\n" +
                "Saldo disponível para saque: " + saldo + "\n";
        System.out.println(mensagem);
    }
}