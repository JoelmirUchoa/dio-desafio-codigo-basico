import java.util.Scanner;

public class VerificadorElegibilidadeConta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que digite sua idade
        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();

        // Verificar se a idade do cliente é maior ou igual a 18
        if (idade >= 18) {
            // Se >= 18, imprimir "Você está elegível para criar uma conta bancária."
            System.out.println("Você está elegível para criar uma conta bancária.");
        } else {
            // Caso contrário, imprimir "Você não está elegível para criar uma conta bancária."
            System.out.println("Você não está elegível para criar uma conta bancária.");
        }

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}