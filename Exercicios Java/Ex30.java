import java.util.Scanner;

public class Ex30 {
    
    public static int hex_to_oct(String s) {            //Criando o método hex_to_oct
        String digitos = "0123456789ABCDEF";            //Criando a string digitos com os valores de 0 a 9 e de A a F
        s = s.toUpperCase();                            //Convertendo a string s para maiúsculo
        int val = 0;                                    //Criando a variável val e atribuindo o valor 0

        for (int i = 0; i < s.length(); i++) {          //Criando um loop que percorre a string s
            char c = s.charAt(i);                       //Criando a variável c e atribuindo o valor do caractere na posição i da string s
            int d = digitos.indexOf(c);                 //Criando a variável d e atribuindo o valor da posição do caractere c na string digitos
            val = 16 * val +d;                          //Atribuindo a val o valor de 16 vezes val mais d
        }
        return val;                                     //Retornando o valor de val
    }
    public static void main(String[] args) {            //Criando o método main
        String hexdec_num;                              //Criando a variável hexdec_num
        int num_dec, i = 1, j;                          //Criando as variáveis num_dec, i e j
        int num_octal[] = new int[100];                 //Criando um array de inteiros num_octal com 100 posições

        try (Scanner in = new Scanner(System.in)) {     //Criando um bloco try-catch para receber a entrada do usuário            
            System.out.print("Insira um numero hexadecimal: "); //Mostrando a mensagem "Insira um numero hexadecimal: " na tela
            hexdec_num = in.nextLine();                 //Atribuindo o valor digitado pelo usuário à variável hexdec_num
        in.close();                                     //Fechando o objeto Scanner
        }
            num_dec = hex_to_oct(hexdec_num);               //Atribuindo o valor retornado pelo método hex_to_oct à variável num_dec

        while (num_dec != 0) {                          //Criando um loop que executa enquanto num_dec for diferente de 0
            num_octal[i++] = num_dec % 8;               //Atribuindo o resto da divisão de num_dec por 8 à posição i do array num_octal e incrementando i
            num_dec = num_dec / 8;                      //Atribuindo o resultado da divisão de num_dec por 8 à variável num_dec
        }
        System.out.print("O numero hexadecimal: " + hexdec_num + " em octal é: ");      //Mostrando a mensagem "O numero hexadecimal: " + hexdec_num + " em octal é: " na tela
        for (j = i - 1; j > 0; j--) {                   //Criando um loop que percorre o array num_octal de i-1 até 1
            System.out.print(num_octal[j]);             //Mostrando o valor na posição j do array num_octal na tela
        }                                           
        System.out.print("\n");                       //Mostrando uma quebra de linha na tela  
    }
}
