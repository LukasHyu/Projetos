import java.util.Scanner;

public class Ex54 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);                            //Criando o objeto in do tipo Scanner
        System.out.println("Digite o primeiro numero: ");             //Pedindo para o usuario digitar o primeiro numero
        int num1 = in.nextInt();                                        //Armazenando o valor digitado na variavel num1
        System.out.println("Digite o segundo numero: ");              //Pedindo para o usuario digitar o segundo numero
        int num2 = in.nextInt();                                        //Armazenando o valor digitado na variavel num2
        System.out.println("Digite o terceiro numero: ");             //Pedindo para o usuario digitar o terceiro numero
        int num3 = in.nextInt();                                        //Armazenando o valor digitado na variavel num3
        System.out.println("Digite o valor True ou False: ");         //Pedindo para o usuario digitar o valor True ou False
        boolean valor = in.nextBoolean();                               //Armazenando o valor digitado na variavel valor

        System.out.println("O resultado é: " + ultimoDigito(num1, num2, num3, valor));  //Imprimindo o resultado
        System.out.println("\n");                                     //Imprimindo uma linha em branco
        in.close();                                                     //Fechando o objeto in
    }

    public static boolean ultimoDigito(int num1, int num2, int num3, boolean valor) {               //Criando o metodo ultimoDigito
        return (num1 % 10 == num2 % 10) || (num1 % 10 == num3 % 10) || (num2 % 10 == num3 % 10);    //Retornando o resultado
    }
}
