import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
                int dec_num, quot, i = 1, j; // Declara as variáveis dec_num, quot, i e j do tipo int
        int bin_num[] = new int[100]; // Cria um array de inteiros com 100 posições

        try (Scanner in = new Scanner(System.in)) { // Cria um objeto Scanner
            System.out.println("Insira um número decimal: "); // Exibe a mensagem para o usuário
            dec_num = in.nextInt(); // Lê o número decimal digitado pelo usuário
        }

        quot = dec_num; // Atribui o valor de dec_num a variável quot

        while (quot != 0) { // Cria um loop que percorre o número decimal
            bin_num[i++] = quot % 2; // Atribui o valor do resto da divisão a variável bin_num
            quot = quot / 2;
        }
        System.out.print("O número binário é: "); // Exibe a mensagem para o usuário
        for (j = i -1; j > 0; j--){ // Cria um loop que percorre o array bin_num
            System.out.print(bin_num[j]); // Exibe o número binário
        }
//        System.out.println("\n"); // Pula uma linha
    }

}
