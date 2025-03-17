import java.util.Scanner;

public class Ex28 {

    public static int hex_to_decimal(String s) {
        String digitos = "0123456789ABCDEF";
        s = s.toUpperCase();
        int val = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int d = digitos.indexOf(c);
            val = 16 * val + d;
        }
        return val;
    }

    public static void main(String args[]) {
        String hexdec_num;
        int dec_num;

        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Insira um numero hexadecimal: ");
            hexdec_num = in.nextLine();
        }
        dec_num = hex_to_decimal(hexdec_num);

        System.out.print("O numero hexadecimal: " + hexdec_num + " em decimal é: " + dec_num + "\n");

    }

}
