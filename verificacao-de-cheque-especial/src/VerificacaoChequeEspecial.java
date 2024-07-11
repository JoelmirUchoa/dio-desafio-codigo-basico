import java.util.Scanner;

public class VerificacaoChequeEspecial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que informe o saldo atual da conta bancária
        System.out.println("Informe o saldo atual da conta bancária:");
        double saldo = scanner.nextDouble();

        // Solicita ao usuário que informe o valor do saque
        System.out.println("Informe o valor do saque:");
        double saque = scanner.nextDouble();

        // Define um limite para o cheque especial
        double limiteChequeEspecial = 500;

        // Verifica se o saque ultrapassa o saldo disponível
        if (saque <= saldo) {
            // Saque dentro do saldo disponível
            System.out.println("Transação realizada com sucesso.");
        } else {
            // Verifica se o saque ultrapassa o limite do cheque especial
            double valorDisponivelComChequeEspecial = saldo + limiteChequeEspecial;
            if (saque <= valorDisponivelComChequeEspecial) {
                // Saque dentro do limite do cheque especial
                System.out.println("Transação realizada com sucesso utilizando o cheque especial.");
            } else {
                // Saque ultrapassa o limite do cheque especial
                System.out.println("Transação não realizada. Limite do cheque especial excedido.");
            }
        }

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
