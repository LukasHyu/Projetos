import java.util.Scanner;

public class Ex35 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {                                 //Inicia o Scanner
            System.out.println("Digite o numero de lados do poligono:");          //Mostra a mensagem "Digite o numero de lados do poligono"
            int nl = in.nextInt();                                                  //Salva o input do usuario dentro da variavel nl

            System.out.println("Digite o tamanho de um dos lados do poligono:");  //Mostra na tela a mensagem "Digite o tamanho de um dos lados do poligono"  
            double tl = in.nextDouble();                                            //Salva o input do usuario dentro da variavel tl

            System.out.printf("A area de um poligono de " + (nl) + " lados com o tamanho de cada lado sendo: %.0f" + " é de: %.2f", (tl), (areapol(nl, tl)));
        }
    }
    public static double areapol(int nl, double tl) {                               //Cria a função areapol
        return (nl * (tl * tl)) / (4.0 * Math.tan((Math.PI / nl)));                 //Calcula a area do poligono
    }
}
