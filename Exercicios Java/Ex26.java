import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {
        int[] num_octalvalor = {0, 1, 10, 11, 100, 101, 110, 111}; // declaração de array
        long octal_num, tempoctnum, binary_num, place; // declaração de variáveis
        int rem; // declaração de variável

        try (Scanner in = new Scanner(System.in)) { // criação de um objeto Scanner
            System.out.print("Digite um número octal: "); // imprime o texto "Digite um número octal: "
            octal_num = in.nextLong(); // lê o valor digitado pelo usuário e armazena na variável octal_num
        }
        tempoctnum = octal_num; // tempoctnum recebe o valor de octal_num
        binary_num = 0; // binary_num recebe 0
        place = 1; // place recebe 1

        while (tempoctnum != 0) { // enquanto tempoctnum for diferente de 0
            rem = (int)(tempoctnum % 10); // rem recebe o resto da divisão de tempoctnum por 10
            binary_num = num_octalvalor[rem] * place + binary_num; // binary_num recebe num_octalvalor[rem] * place + binary_num
            tempoctnum /= 10; // tempoctnum recebe o valor de tempoctnum dividido por 10
            place *= 1000; // place recebe o valor de place * 1000
        }
        System.out.print("O número binário é: " + binary_num + "\n"); // imprime o texto "O número binário é: " + binary_num + "\n"
    }
}
