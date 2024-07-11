import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que informe o limite diário de saque
        System.out.println("Informe o limite diário de saque:");
        double limiteDiario = scanner.nextDouble();

        // Loop for para iterar sobre os saques
        for (int i = 1; ; i++) {
            // Solicitar ao usuário que informe o valor do saque
            System.out.println("Informe o valor do saque " + i + ":");
            double valorSaque = scanner.nextDouble();

            // Verificar se o valor do saque é zero para encerrar as transações
            if (valorSaque == 0) {
                System.out.println("Transações encerradas.");
                break; // Encerra o loop
            }

            // Verificar se o valor do saque ultrapassa o limite diário
            if (valorSaque > limiteDiario) {
                System.out.println("Limite diário de saque atingido. Transações encerradas.");
                break; // Encerra o loop
            }

            // Realizar o saque e atualizar o limite diário
            limiteDiario -= valorSaque;
            System.out.println("Saque de " + valorSaque + " realizado com sucesso. Limite restante: " + limiteDiario);
        }

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}