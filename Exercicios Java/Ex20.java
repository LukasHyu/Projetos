import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        int dec_num, rem; // Declara as variáveis dec_num e rem do tipo int
        String hexdec_num = ""; // Declara a variável hexdec_num do tipo String

        char hex[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' }; // Cria um array de caracteres

        try (Scanner in = new Scanner(System.in)) { // Cria um objeto Scanner
            System.out.print("Insira um número decimal: "); // Exibe a mensagem para o usuário 
            dec_num = in.nextInt(); // Lê o número decimal digitado pelo usuário
        } 
        while (dec_num > 0) { // Cria um loop que percorre o número decimal
            rem = dec_num % 16; // Atribui o valor do resto da divisão de dec_num por 16 a variável rem
            hexdec_num = hex[rem] + hexdec_num; // Atribui o valor do array hex a variável hexdec_num
            dec_num = dec_num / 16;     // Divide o número decimal por 16
        }
        System.out.print("O número hexadecimal é: " + hexdec_num + "\n"); // Exibe o número hexadecimal
    }
}
