public class Ex50 {
    public static void main(String[] args) {
        System.out.println("\nDivido por 3:");          //Mostra os numeros divisíveis por 3
        for (int i = 1; i < 100; i++) {                   //Cria um laço de repetição que vai de 1 a 100
            if (i % 3 == 0) {                             //Verifica se o resto da divisão de i por 3 é igual a 0
            System.out.print(i + " ");                    //Se for verdadeiro, imprime o valor de i
            }
            
            }
        System.out.println("\nDivido por 5:");          //Mostra os numeros divisíveis por 5
        for (int i = 1; i < 100; i++) {                   //Cria um laço de repetição que vai de 1 a 100
            if (i % 5 == 0) {                             //Verifica se o resto da divisão de i por 5 é igual a 0
            System.out.print(i + " ");                    //Se for verdadeiro, imprime o valor de i
                }
            }
        System.out.println("\nDivido por 3 e 5:");      //Mostra os numeros divisíveis por 3 e 5
        for (int i = 1; i < 100; i++) {                   //Cria um laço de repetição que vai de 1 a 100
        if (i % 3 == 0 && i % 5 == 0) {                   //Verifica se o resto da divisão de i por 3 é igual a 0 e se o resto da divisão de i por 5 é igual a 0
            System.out.print(i + " ");                    //Se for verdadeiro, imprime o valor de i
                }
            }
    }
}
