import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Insira o primeiro numero: "); // Exibe a mensagem para o usuário
            int num1 = scanner.nextInt(); // Lê o primeiro número digitado pelo usuário
            System.out.println("Insira o segundo numero: "); // Exibe a mensagem para o usuário
            int num2 = scanner.nextInt(); // Lê o segundo número digitado pelo usuário
            System.out.println("Insira o terceiro numero: "); // Exibe a mensagem para o usuário
            int num3 = scanner.nextInt(); // Lê o terceiro número digitado pelo usuário

            System.out.println("A média entre: " + num1 + ", " + num2 + " e " + num3 + " é: " + (num1 + num2 + num3) / 3); // Exibe a média dos números digitados
        }


        
    }
}
