import java.util.Scanner;

public class Ex37 {
    public static void main(String[] args) {            

      try (Scanner in = new Scanner(System.in)) {           //Criando o Scanner para receber os valores
        System.out.print("Digite uma frase: ");           //Imprime a mensagem para o usuario
          char[] letras = in.nextLine().toCharArray();      //Recebe da frase inserida pelo usuario e transforma em um array de caracteres
          System.out.print("A frase ao contrario é: ");   //Imprime a mensagem para o usuario
          for (int i = letras.length - 1; i >= 0; i--) {    //Percorre o array de caracteres de tras para frente
            System.out.print(letras[i]);                    //Imprime o caractere na posição i
          }
    }
      System.out.println("\n");                           //Imprime uma quebra de linha
    }
}
