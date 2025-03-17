import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {

        long binaryNumber, decimalNumber = 0, j = 1, remainder; // Determina o numero binario, decimal, j e resto

        try (Scanner in = new Scanner(System.in)) { // Inicia o scanner
            System.out.print("Digite um numero binario: ");  // Imprime o texto "Digite um numero binario: " na tela
            binaryNumber = in.nextLong(); // Recebe o valor do usuario
        }
            while (binaryNumber != 0) { // Enquanto o numero binario for diferente de 0
                remainder = binaryNumber % 10; // O resto recebe o numero binario dividido por 10
                decimalNumber = decimalNumber + remainder * j; // O numero decimal recebe o numero decimal + o resto * j
                j = j * 2; // j recebe j * 2
                binaryNumber = binaryNumber / 10; // O numero binario recebe o numero binario dividido por 10
            }
            
            System.out.print("O numero decimal é: " + decimalNumber); // Imprime na tela o texto "O numero decimal é: " + o numero decimal
        } 
        
        
    }
