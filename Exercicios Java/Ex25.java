import java.util.Scanner;

public class Ex25 {
    public static void main(String[] args) {
        long octal_num, decimal_num = 0; // declaração de variáveis
        int i = 0; // declaração de variável

        try (Scanner in = new Scanner(System.in)) { // criação de um objeto Scanner
            System.out.print("Insira um numero octal: "); // imprime o texto "Insira um numero octal: "
            octal_num = in.nextLong(); // lê o valor digitado pelo usuário e armazena na variável octal_num
        }
        while (octal_num != 0) { // enquanto octal_num for diferente de 0
            decimal_num = (long)(decimal_num + (octal_num % 10) * Math.pow(8, i++)); // decimal_num recebe o valor de decimal_num + (octal_num % 10) * 8^i
            octal_num = octal_num / 10; // octal_num recebe o valor de octal_num dividido por 10
        } 
        System.out.print("O numero em decimal é: " + decimal_num + "\n");  // imprime o texto "O numero em decimal é: " + decimal_num + "\n"
    }
}
