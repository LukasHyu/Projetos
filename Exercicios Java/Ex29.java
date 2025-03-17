import java.util.Scanner;

public class Ex29 {
    public static int hex_to_binary(String s) { // Cria o método hex_to_binary
        String digitos = "0123456789ABCDEF";    // Cria a string digitos com os valores de 0 a 9 e de A a F
        s = s.toUpperCase();                    // Converte a string s para maiúsculo
        int val = 0;                            // Cria a variável val e atribui o valor 0

        for (int i = 0; i < s.length(); i++) {  // Cria um loop que percorre a string s
            char c = s.charAt(i);               // Cria a variável c e atribui o valor do caractere na posição i da string s
            int d = digitos.indexOf(c);         // Cria a variável d e atribui o valor da posição do caractere c na string digitos    
            val = 16 * val +d;                  // Atribui a val o valor de 16 vezes val mais d
        }
        return val;                             // Retorna o valor de val
    }

    public static void main(String[] args) {    // Cria o método main
        String hexdec_num;                      // Cria a variável hexdec_num
        int num_dec, i = 1, j;                  // Cria as variáveis num_dec, i e j
        int num_bin[] = new int[100];           // Cria um array de inteiros num_bin com 100 posições
        
        try (Scanner in = new Scanner(System.in)) {   // Cria um bloco try-catch para receber a entrada do usuário
            System.out.print("Insira um numero hexadecimal: ");         // Mostra a mensagem "Insira um numero hexadecimal: " na tela
            hexdec_num = in.nextLine();             // Atribui o valor digitado pelo usuário à variável hexdec_num
        }
        num_dec = hex_to_binary(hexdec_num);    // Atribui o valor retornado pelo método hex_to_binary à variável num_dec

        while (num_dec != 0) {                  // Cria um loop que executa enquanto num_dec for diferente de 0
            num_bin[i++] = num_dec % 2;         // Atribui o resto da divisão de num_dec por 2 à posição i do array num_bin e incrementa i
            num_dec = num_dec / 2;              // Atribui o resultado da divisão de num_dec por 2 à variável num_dec
        }
        System.out.print("O numero hexadecimal: " + hexdec_num + " em binario é: ");        // Mostra a mensagem "O numero hexadecimal: " + hexdec_num + " em binario é: " na tela
        for (j = i - 1; j > 0; j--) {           // Cria um loop que percorre o array num_bin de i-1 até 1
            System.out.print(num_bin[j]);       // Mostra o valor na posição j do array num_bin na tela
        }                                       // Fim do loop
        System.out.print("\n");               // Mostra uma quebra de linha na tela
    }
}
