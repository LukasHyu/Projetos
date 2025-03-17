import java.util.Scanner;

public class Ex34 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);                                       // Abertura do Scanner para leitura dos números
        System.out.println("Digite o tamanho do lado do Hexagono: ");              // Solicita ao usuário que digite o tamanho do lado do Hexagono
        double lado = in.nextDouble();                                             // Armazena o tamanho do lado do Hexagono na variável lado
        in.close();                                                                // Fecha o Scanner
        
        System.out.printf("A área do Hexagono é: %.2f  ", areaHexagono(lado));         // Exibe a área do Hexagono
    }

    public static double areaHexagono(double lado) {                              // Função que calcula a área de um Hexagono
        return (6 * (lado * lado)) / (4 * Math.tan(Math.PI / 6));                 // Retorna a área do Hexagono
    }
}
