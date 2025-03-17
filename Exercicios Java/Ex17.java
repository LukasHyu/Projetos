import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        long binary1, binary2; // Declara as variáveis binary1 e binary2 do tipo long
        int i = 0, remainder = 0; // Declara as variáveis i e remainder do tipo int

        int[] sum = new int[20]; // Cria um array de inteiros com 20 posições

        try (Scanner in = new Scanner(System.in)) { // Cria um objeto Scanner
            System.out.println("Insira o primeiro número binário: "); // Exibe a mensagem para o usuário
            binary1 = in.nextLong(); // Lê o primeiro número binário digitado pelo usuário
            System.out.println("Insira o segundo número binário: "); // Exibe a mensagem para o usuário
            binary2 = in.nextLong(); // Lê o segundo número binário digitado pelo usuário
        }

        while (binary1 != 0 || binary2 != 0) { // Cria um loop que percorre os números binários
            sum[i++] = (int)((binary1 % 10 + binary2 % 10 + remainder) % 2); // Atribui o valor da soma dos números binários a variável sum
            remainder = (int)((binary1 % 10 + binary2 % 10 + remainder) / 2); // Atribui o valor do resto da divisão da soma dos números binários a variável remainder
            binary1 = binary1 / 10; // Divide o primeiro número binário por 10
            binary2 = binary2 / 10; // Divide o segundo número binário por 10
        }
            if (remainder != 0) { // Verifica se o resto da divisão é diferente de 0
                sum[i++] = remainder; // Atribui o valor do resto da divisão a variável sum
            }
            --i; // Decrementa o valor de i

            System.out.println("A soma dos dois números binários é: "); // Exibe a mensagem para o usuário
            while (i >= 0){ // Cria um loop que percorre o array sum
                System.out.print(sum[i--]); // Exibe a soma dos números binários
            }
        }
    }
