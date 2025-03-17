import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) { //Cria um objeto Scanner chamado in
            System.out.print("Insira um numero para a tabuada:"); //Mostra a mensagem "Insira um numero para a tabuada:" no console
            int num = in.nextInt(); //Le o numero inserido pelo usuario e armazena na variavel num

            for (int i = 0; i < 10; i++) { //Cria um loop que vai de 0 a 9
                    System.out.println(num + " x " + (i+1) + " = " + num * (i+1)); //Calcula o valor de num * (i+1) e mostra no console
                }
        }
        }    

    }
