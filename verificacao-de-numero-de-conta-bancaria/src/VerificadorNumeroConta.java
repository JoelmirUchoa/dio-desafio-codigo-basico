import java.util.Scanner;

public class VerificadorNumeroConta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Digite o número da conta bancária:");
            String numeroConta = scanner.nextLine();

            // Chamar o método que verifica se o número da conta é válido
            verificarNumeroConta(numeroConta);
            
            // Caso nenhuma exceção seja lançada, imprime a mensagem de sucesso.
            System.out.println("Número de conta válido.");
        } catch (IllegalArgumentException e) {
            // Informar que o número de conta é inválido e exibir a mensagem de erro
            System.out.println("Erro: " + e.getMessage());
        } finally {
            // Fechar o scanner para evitar vazamentos de recursos
            scanner.close();
        }
    }
    
    private static void verificarNumeroConta(String numeroConta) {
        if (numeroConta.length() != 8) {
            // Lançar uma IllegalArgumentException com a seguinte mensagem:
            // "Número de conta inválido. Digite exatamente 8 dígitos."
            throw new IllegalArgumentException("Número de conta inválido. Digite exatamente 8 dígitos.");
        }
    }
}
