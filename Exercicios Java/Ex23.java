import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        int[] hex = new int [1000]; // Cria um array de inteiros chamado hex com 1000 posições
        int i = 1, j = 0, rem, dec = 0, bin; // Cria as variaveis i, j, rem, dec e bin

        try (Scanner in = new Scanner(System.in)) { // Inicia o scanner
            System.out.print("Digite um numero binario: "); // Imprime o texto "Digite um numero binario: " na tela
            bin = in.nextInt(); // Recebe o valor do usuario
        }
        while (bin > 0 ) { // Enquanto o numero binario for maior que 0
            rem = bin % 2; // O resto recebe o numero binario dividido por 2
            dec = dec + rem * i; // O numero decimal recebe o numero decimal + o resto * i
            i = i * 2; // i recebe i * 2
            bin = bin / 10; // O numero binario recebe o numero binario dividido por 10
        }
        i = 0; // i recebe 0

        while (dec != 0) { // Enquanto o numero decimal for diferente de 0
            hex[i] = dec % 16; // hex[i] recebe o numero decimal dividido por 16
            dec = dec /16; // O numero decimal recebe o numero decimal dividido por 16
            i++; // i recebe i + 1
        }
        System.out.print("O numero hexadecimal é: "); // Imprime na tela o texto "O numero hexadecimal é: "
        for (j = i - 1; j >= 0; j--) { // Para j = i - 1, enquanto j for maior ou igual a 0, j recebe j - 1
            if (hex[j] > 9) { // Se hex[j] for maior que 9
                System.out.print((char)(hex[j] + 55)); // Imprime o valor de hex[j] + 55
            } else {
                System.out.print(hex[j]); // Imprime o valor de hex[j]
            }
            }
            System.out.print("\n");
        } 
}
