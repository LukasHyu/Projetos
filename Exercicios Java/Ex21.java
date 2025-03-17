import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) { 
        int dec_num, quot, i = 1, j; // Determina o numero decimal, quot, i e j
        int oct_num[] = new int[100]; // Determina o numero octal

        try (Scanner in = new Scanner(System.in)) { // Inicia o scanner
            System.out.print("Insira um numero decimal: "); // Imprime na tela
            dec_num = in.nextInt(); // Recebe o valor
        }

        quot = dec_num; // quot recebe o numero decimal

        while (quot != 0) { // Enquanto o quociente for diferente de 0
            oct_num[i++] = quot % 8; // oct_num recebe o resto da divisão
            quot = quot / 8; // quot recebe a divisão
        }
        System.out.print("O numero octal é: "); // Imprime na tela
        for (j = i -1; j > 0; j--) { // Para j = i - 1, enquanto j for maior que 0, j--
            System.out.print(oct_num[j]); // Imprime na tela
        }
        System.out.print("\n"); // Imprime na tela
    }
}
