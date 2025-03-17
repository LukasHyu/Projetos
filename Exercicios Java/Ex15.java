public class Ex15 {
    public static void main(String[] args) {
        int num1 = 5; // Insere o valor 5 na variável num1
        int num2 = 8; // Insere o valor 8 na variável num2
        int swap = 0; // Cria a variável swap e insere o valor 0
    
        System.out.println("Antes da troca: Primeiro número = " + num1 + " e o Segundo número = " + num2); // Exibe os valores de num1 e num2 antes da troca
        swap = num1; // Atribui o valor de num1 a variável swap 
        num1 = num2; // Atribui o valor de num2 a variável num1
        num2 = swap; // Atribui o valor de swap a variável num2
        System.out.println("Depois da troca: Primeiro número = " + num1 + " e o Segundo número = " + num2); // Exibe os valores de num1 e num2 depois da troca
    }
}
