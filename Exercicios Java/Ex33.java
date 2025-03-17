import java.util.Scanner;

public class Ex33 {
    public static void main(String[] args) {
        Long num;                                                                 // Variavel que armazena o numero digitado pelo usuario        

        try (Scanner in = new Scanner(System.in)) {                               // Abertura do Scanner para leitura dos números            
            System.out.print("Digite um numero: ");                             // Solicita ao usuário que digite um número
            num = in.nextLong();                                                  // Armazena o número digitado na variável num
            
            System.out.println("A soma dos digitos do numero " + num + " é: " + somaDigitos(num)); // Exibe a soma dos digitos do número digitado
            in.close();                                                           // Fecha o Scanner                                 
        }

    }
    public static int somaDigitos (Long num) {                                  // Função que calcula a soma dos digitos de um número
        int soma = 0;                                                           // Variavel que armazena a soma dos digitos do número

        while (num != 0) {                                                      // Enquanto o número for diferente de 0
            soma += num % 10;                                                   // Adiciona o último digito do número à variável soma
            num /= 10;                                                          // Remove o último digito do número     
        }
        
        return soma;                                                            // Retorna a soma dos digitos do número                 
    }
}
