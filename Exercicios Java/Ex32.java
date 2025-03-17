import java.util.Scanner;

public class Ex32 {
    public static void main(String[] args) {
        int num1, num2;                                                                                 // Declaração das variáveis num1 e num2

        try (Scanner in = new Scanner(System.in)) {                                                     // Abertura do Scanner para leitura dos números                 
            System.out.print("Digite o primeiro número: ");
            num1 = in.nextInt();                                                                        // Leitura do primeiro número                                  
            System.out.print("Digite o segundo número: ");                                            // Leitura do segundo número   
            num2 = in.nextInt();                                                                        // Leitura do segundo número         
            in.close();                                                                                 // Fechamento do Scanner        

            if (num1 == num2)                                                                           // Condição para verificar se os números são iguais
            System.out.println("O numero " + num1 + " é igual ao numero " + num2);                      
            if (num1 > num2)                                                                            // Condição para verificar se o primeiro número é maior que o segundo                    
            System.out.println("O numero " + num1 + " é maior que o numero " + num2);                   
            if (num1 < num2)                                                                            // Condição para verificar se o primeiro número é menor que o segundo
            System.out.println("O numero " + num1 + " é menor que o numero " + num2);
            if (num1 != num2)                                                                           // Condição para verificar se os números são diferentes
            System.out.println("O numero " + num1 + " é diferente do numero " + num2);
            if (num1 >= num2)                                                                           // Condição para verificar se o primeiro número é maior ou igual ao segundo
            System.out.println("O numero " + num1 + " é maior ou igual ao numero " + num2);
            if (num1 <= num2)                                                                           // Condição para verificar se o primeiro número é menor ou igual ao segundo             
            System.out.println("O numero " + num1 + " é menor ou igual ao numero " + num2);
            if (num1 % 2 == 0)                                                                          // Condição para verificar se o primeiro número é par
            System.out.println("O numero " + num1 + " é par");
            if (num1 % 2 != 0)                                                                          // Condição para verificar se o primeiro número é impar                    
            System.out.println("O numero " + num1 + " é impar");
            if (num2 % 2 == 0)                                                                          // Condição para verificar se o segundo número é par
            System.out.println("O numero " + num2 + " é par");
            if (num2 % 2 != 0)                                                                          // Condição para verificar se o segundo número é impar
            System.out.println("O numero " + num2 + " é impar");
            if (num1 % num2 == 0)                                                                       // Condição para verificar se o primeiro número é divisivel pelo segundo             
            System.out.println("O numero " + num1 + " é divisivel pelo numero " + num2);
            if (num1 % num2 != 0)                                                                       // Condição para verificar se o primeiro número não é divisivel pelo segundo
            System.out.println("O numero " + num1 + " não é divisivel pelo numero " + num2);
            if (num2 % num1 == 0)                                                                       // Condição para verificar se o segundo número é divisivel pelo primeiro       
            System.out.println("O numero " + num2 + " é divisivel pelo numero " + num1);
            if (num2 % num1 != 0)                                                                       // Condição para verificar se o segundo número não é divisivel pelo primeiro
            System.out.println("O numero " + num2 + " não é divisivel pelo numero " + num1);
            if (num1 > 0)                                                                               // Condição para verificar se o primeiro número é positivo
            System.out.println("O numero " + num1 + " é positivo");
            if (num1 < 0)                                                                               // Condição para verificar se o primeiro número é negativo
            System.out.println("O numero " + num1 + " é negativo");
            if (num1 == 0)                                                                              // Condição para verificar se o primeiro número é nulo
            System.out.println("O numero " + num1 + " é nulo");
            if (num2 > 0)                                                                               // Condição para verificar se o segundo número é positivo
            System.out.println("O numero " + num2 + " é positivo");
            if (num2 < 0)                                                                               // Condição para verificar se o segundo número é negativo
            System.out.println("O numero " + num2 + " é negativo");
            if (num2 == 0)                                                                              // Condição para verificar se o segundo número é nulo
            System.out.println("O numero " + num2 + " é nulo");
            if (num1 > 0 && num2 > 0)                                                                   // Condição para verificar se os números são positivos
            System.out.println("Os numeros " + num1 + " e " + num2 + " são positivos");
            if (num1 < 0 && num2 < 0)                                                                   // Condição para verificar se os números são negativos            
            System.out.println("Os numeros " + num1 + " e " + num2 + " são negativos");
            if (num1 == 0 && num2 == 0)                                                                 // Condição para verificar se os números são nulos
            System.out.println("Os numeros " + num1 + " e " + num2 + " são nulos");
            if (num1 > 0 && num2 < 0)                                                                   // Condição para verificar se o primeiro número é positivo e o segundo é negativo
            System.out.println("O numero " + num1 + " é positivo e o numero " + num2 + " é negativo");
            if (num1 < 0 && num2 > 0)                                                                   // Condição para verificar se o primeiro número é negativo e o segundo é positivo             
            System.out.println("O numero " + num1 + " é negativo e o numero " + num2 + " é positivo");
            if (num1 > 0 && num2 == 0)                                                                  // Condição para verificar se o primeiro número é positivo e o segundo é nulo                   
            System.out.println("O numero " + num1 + " é positivo e o numero " + num2 + " é nulo");
            if (num1 == 0 && num2 > 0)                                                                  // Condição para verificar se o primeiro número é nulo e o segundo é positivo
            System.out.println("O numero " + num1 + " é nulo e o numero " + num2 + " é positivo");
            if (num1 < 0 && num2 == 0)                                                                  // Condição para verificar se o primeiro número é negativo e o segundo é nulo
            System.out.println("O numero " + num1 + " é negativo e o numero " + num2 + " é nulo");
            if (num1 == 0 && num2 < 0)                                                                  // Condição para verificar se o primeiro número é nulo e o segundo é negativo
            System.out.println("O numero " + num1 + " é nulo e o numero " + num2 + " é negativo");
            if (num1 == 0 && num2 != 0)                                                                 // Condição para verificar se o primeiro número é nulo e o segundo não é nulo
            System.out.println("O numero " + num1 + " é nulo e o numero " + num2 + " não é nulo");
            if (num1 != 0 && num2 == 0)                                                                 // Condição para verificar se o primeiro número não é nulo e o segundo é nulo
            System.out.println("O numero " + num1 + " não é nulo e o numero " + num2 + " é nulo");
            if (num1 != 0 && num2 != 0)                                                                 // Condição para verificar se os números não são nulos
            System.out.println("O numero " + num1 + " não é nulo e o numero " + num2 + " não é nulo");
            if (num1 % 2 == 0 && num2 % 2 == 0)                                                         // Condição para verificar se os números são pares
            System.out.println("Os numeros " + num1 + " e " + num2 + " são pares");
            if (num1 % 2 != 0 && num2 % 2 != 0)                                                         // Condição para verificar se os números são impares
            System.out.println("Os numeros " + num1 + " e " + num2 + " são impares");
            if (num1 % 2 == 0 && num2 % 2 != 0)                                                         // Condição para verificar se o primeiro número é par e o segundo é impar
            System.out.println("O numero " + num1 + " é par e o numero " + num2 + " é impar");
            if (num1 % 2 != 0 && num2 % 2 == 0)                                                         // Condição para verificar se o primeiro número é impar e o segundo é par
            System.out.println("O numero " + num1 + " é impar e o numero " + num2 + " é par");
            if (num1 % 2 == 0 && num2 % 2 == 0)                                                         // Condição para verificar se os números são pares
            System.out.println("O numero " + num1 + " é par e o numero " + num2 + " é par");
            if (num1 % 2 != 0 && num2 % 2 != 0)                                                         // Condição para verificar se os números são impares
            System.out.println("O numero " + num1 + " é impar e o numero " + num2 + " é impar"); 
        }
    }
}