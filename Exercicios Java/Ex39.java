public class Ex39 {
    public static void main(String[] args) {
        int numero = 0;                                                                 //Variável que conta a quantidade de números gerados
        for (int i = 1; i <= 5; i++) {                                                  //For que gera os números para o primeiro dígito
            for (int j = 1; j <= 5; j++) {                                              //For que gera os números para o segundo dígito
                for (int k = 1; k <= 5; k++) {                                          //For que gera os números para o terceiro digito               
                    for (int l = 1; l <= 5; l++) {                                      //For que gera os números para o quarto dígito
                    if (k != i && k != j && i != j && l != i && l != j && l != k) {     //Condição que verifica se os números são diferentes
                        numero++;                                                       //Incrementa a variável numero
                        System.out.println(i + "" + j + "" + k + "" + l);               //Imprime os números gerados
                        }
                    }
                }
            }
        }
        System.out.println("Total de números gerados: " + numero);                      //Imprime a quantidade de números gerados
    }
}
