import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        long binary1, binary2, multiply = 0; // Declara as variáveis binary1, binary2 e multiply do tipo long
        int digit, factor = 1; // Declara as variáveis digit e factor do tipo int

            try (Scanner in = new Scanner(System.in)) { // Cria um objeto Scanner
                System.out.print("Insira o primeiro número binário: "); // Exibe a mensagem para o usuário
                binary1 = in.nextLong(); // Lê o primeiro número binário digitado pelo usuário
                System.out.print("Insira o segundo número binário: "); // Exibe a mensagem para o usuário
                binary2 = in.nextLong(); // Lê o segundo número binário digitado pelo usuário
            }
            while (binary2 != 0) { // Cria um loop que percorre os números binários
                digit = (int)(binary2 % 10); // Atribui o valor do resto da divisão de binary2 por 10 a variável digit
                if (digit == 1) {  // Verifica se o valor de digit é igual a 1
                    binary1 = binary1 * factor; // Atribui o valor da multiplicação de binary1 e factor a variável binary1
                    multiply = binaryproduct((int) binary1, (int) multiply); // Atribui o valor da multiplicação de binary1 e multiply a variável multiply
                } else { // Se a condição acima não for atendida
                    binary1 = binary1 * factor; // Atribui o valor da multiplicação de binary1 e factor a variável binary1
                }
                binary2 = binary2 / 10; // Divide o segundo número binário por 10
                factor = 10; // Atribui o valor 10 a variável factor
            }
            System.out.print("O produto dos dois números binários é: " + multiply + "\n"); // Exibe o produto dos números binários
    } 
        static int binaryproduct(int binary1, int binary2){ // Cria um método que recebe dois números binários
            int i = 0, remainder = 0; // Declara as variáveis i e remainder do tipo int
            int[] sum = new int[20]; // Cria um array de inteiros com 20 posições
            int binary_prod_result = 0; // Declara a variável binary_prod_result do tipo int
            
            while (binary1 != 0 || binary2 != 0){ // Cria um loop que percorre os números binários
                sum[i++] = ((binary1 % 10 + binary2 % 10 + remainder) % 2); // Atribui o valor da soma dos números binários a variável sum
                remainder = ((binary1 % 10 + binary2 % 10 + remainder) / 2); // Atribui o valor do resto da divisão da soma dos números binários a variável remainder
                binary1 = binary1 / 10; // Divide o primeiro número binário por 10
                binary2 = binary2 / 10; // Divide o segundo número binário por 10
            }
            if (remainder != 0) { // Verifica se o resto da divisão é diferente de 0
                sum[i++] = remainder; // Atribui o valor do resto da divisão a variável sum
            }
            --i; // Decrementa o valor de i

            while (i >= 0){ // Cria um loop que percorre o array sum
                binary_prod_result = binary_prod_result * 10 + sum[i--]; // Atribui o valor da multiplicação dos números binários a variável binary_prod_result
            }
            return binary_prod_result; // Retorna o valor da multiplicação dos números binários
        }
    }
