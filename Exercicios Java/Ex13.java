public class Ex13 {
    public static void main(String[] args) {
        final double num1 = 5.6; // Insere o valor 5.6 na variável num1
        final double num2 = 8.5; // Insere o valor 8.5 na variável num2

        double perimetro = 2 * (num1 + num2); // Calcula o perimetro do retangulo
        double area = num1 * num2;  // Calcula a area do retangulo

        System.out.printf("A area do retangulo é: %.1f * %.1f = %.2f\n", num1, num2, area); // Exibe a area do retangulo
        System.out.printf("O perimetro do retangulo é: 2 * (%.1f + %.1f) = %.2f\n", num1, num2, perimetro); // Exibe o perimetro do retangulo
        

    }
}
