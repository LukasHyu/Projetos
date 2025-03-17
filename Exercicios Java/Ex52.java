import java.util.Scanner;

public class Ex52 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {                             //Criando um objeto Scanner para receber os valores digitados pelo usuário
            System.out.println("Digite o primeiro numero: ");                 //Solicitando ao usuário que digite o primeiro número
            int num1 = in.nextInt();                                            //Lendo o primeiro número digitado pelo usuário
            System.out.println("Digite o segundo numero: ");                  //Solicitando ao usuário que digite o segundo número
            int num2 = in.nextInt();                                            //Lendo o segundo número digitado pelo usuário
            System.out.println("Digite o terceiro numero: ");                 //Solicitando ao usuário que digite o terceiro número
            int num3 = in.nextInt();                                            //Lendo o terceiro número digitado pelo usuário
            System.out.println("O resultado da soma é: " + soma2(num1, num2, num3));        //Chamando o método soma2 e exibindo o resultado na tela
        }
    }
    public static boolean soma2(int num1, int num2, int num3) {        //Método que recebe três números como parâmetros e retorna true se a soma de dois deles é igual ao terceiro número
        return ((num1 + num2) == num3 || (num2 + num3) == num1 || (num3 + num1) == num2);   //Retorna true se a soma de dois números é igual ao terceiro número
    }
}
