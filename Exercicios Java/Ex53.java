import java.util.Scanner;

public class Ex53 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);                        //Criando o objeto in do tipo Scanner
        System.out.println("Digite o primeiro número: ");         //Lê a entrada do usuario
        int num1 = in.nextInt();                                    //Armazena o primeiro número
        System.out.println("Digite o segundo numero: ");          //Lê a entrada do usuario   
        int num2 = in.nextInt();                                    //Armazena o segundo número
        System.out.println("Digite o terceiro numero: ");         //Lê a entrada do usuario
        int num3 = in.nextInt();                                    //Armazena o terceiro número
        System.out.println("Digite True ou False: ");             //Lê a entrada do usuario
        boolean verdadeiro = in.nextBoolean();                      //Armazena o valor booleano
        System.out.println("O resultado é: " + teste(num1, num2, num3, verdadeiro));        //Chama o método teste e imprime o resultado
        in.close();                                                 //Fecha o Scanner                    
        }
        public static boolean teste(int num1, int num2, int num3, boolean verdadeiro){ //Método que recebe os parâmetros    
          if (verdadeiro)                                                               //Verifica se verdadeiro é true
          return (num3 > num2);                                                         //Retorna verdadeiro se num3 > num2
          return (num2 > num1 && num3 > num2);                                          //Retorna verdadeiro se num2 > num1 e num3 > num2
        }
}
