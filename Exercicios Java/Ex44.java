import java.util.Scanner;

public class Ex44 {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        n = in.nextInt();
        System.out.printf("%d + %d%d + %d%d%d\n", n, n, n, n, n, n);
        in.close();
    }
}
