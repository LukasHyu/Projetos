import java.util.Scanner;

public class Ex55 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {                         //Iniciaa o Scanner
            System.out.println("Digite a quantidade de segundos: ");      //Pede a quantidade de segundos
            int segundos = in.nextInt();                                    //Armazena a quantidade de segundos

            int seg = segundos % 60;                                        //Calcula os segundos
            int horas = segundos / 60;                                      //Converte os segundos em minutos
            int minutos = horas % 60;                                       //Calcula os minutos
            horas = horas / 60;                                             //Converte os minutos em horas
            System.out.println(horas + ":" + minutos + ":" + seg);          //Imprime o resultado
        }
    }
}
