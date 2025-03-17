import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
        int binnum, binnum1, rem, decnum = 0, quot, i = 1, j; // declaração de variáveis
        int octnum [] = new int[100]; // declaração de array

        try (Scanner in = new Scanner(System.in)) { // criação de um objeto Scanner
            System.out.print("Insira um numero binario: "); //Imprime o texto "Insira um numero binario: " na tela
            binnum = in.nextInt(); // Lê o valor digitado pelo usuário e armazena na variável binnum
        }

        binnum1 = binnum; // binnum1 recebe o valor de binnum

        while (binnum > 0) { // enquanto binnum for maior que 0
            rem = binnum % 10; // rem recebe o resto da divisão de binnum por 10
            decnum = decnum + rem * i; // decnum recebe o valor de decnum + rem * i
            i = i * 2; // i recebe o valor de i * 2
            binnum = binnum / 10; // binnum recebe o valor de binnum dividido por 10
        }

        i = 1; // i recebe 1
        quot = decnum; // quot recebe o valor de decnum

        while (quot > 0) { // enquanto quot for maior que 0
            octnum[i++] = quot % 8; // octnum na posição i recebe o resto da divisão de quot por 8
            quot = quot / 8; // quot recebe o valor de quot dividido por 8
        }
        System.out.print("O numero binario " + binnum1 + " em octal é: "); // imprime o texto "O numero binario " + binnum1 + " em octal é: "
        for (j = i - 1; j > 0; j--) { // para j = i - 1; j maior que 0; j--
            System.out.print(octnum[j]); // imprime octnum na posição j
        }
        System.out.print("\n"); // imprime uma quebra de linha
    }
}

