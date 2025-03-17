import java.util.Scanner;

public class Ex51 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {                         //Criando o objeto Scanner
            System.out.println("Escreva um numero:");                     //Imprimindo a mensagem
            String str1 = in.nextLine();                                    //Lendo o numero digitado
            int resultado = Integer.parseInt(str1);                         //Convertendo a string para inteiro
            System.out.println("O numero digitado foi: " + resultado);      //Mostra o resultado na tela     
        }
            
    }
}
