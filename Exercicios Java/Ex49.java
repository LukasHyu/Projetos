import java.util.Scanner;

public class Ex49 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {                         //Criando o objeto Scanner
            System.out.println("Digite um número: ");                     //Solicitando o número ao usuário
            int n = in.nextInt();                                           //Lendo o número
            in.close();                                                     //Fechando o objeto Scanner
            if (n % 2 == 0) {                                               //Verificando se o número é par ou ímpar
                System.out.println("O número é par.");                    //Imprimindo a mensagem
            } else {                                                        //Se não for par, é ímpar
                System.out.println("O número é ímpar.");                  //Mostra a mensagem          
            }
        }
    }
}
