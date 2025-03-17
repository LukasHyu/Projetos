import java.util.Scanner;

public class Ex27 {
    public static void main(String[] args) {
     String num_octal, num_hex; // variáveis para armazenar o número octal e hexadecimal
     int numdec; // variável para armazenar o número decimal
     
     try (Scanner in = new Scanner(System.in)) { // Cria um objeto Scanner
        System.out.print("Digite um número octal: "); // Solicita a entrada de um número octal
            num_octal = in.nextLine(); // Lê o número inserido e guarda na variavel octal
    }

     numdec = Integer.parseInt(num_octal, 8); // Converte o número octal para decimal
        num_hex = Integer.toHexString(numdec); // Converte o número decimal para hexadecimal

        System.out.print("O número " + num_octal + " em hexadecimal é: " + num_hex + "\n"); // Exibe o número hexadecimal
    }
}
