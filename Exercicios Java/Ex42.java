import java.io.Console;

public class Ex42 {
    public static void main(String[] args) {
        Console cons;
        if ((cons = System.console()) != null) {
            char[] senha = null;

            try {
                senha = cons.readPassword("Digite a senha: ");
                System.out.println("Senha: " + new String(senha));
            } finally {
                if (senha != null) {
                    java.util.Arrays.fill(senha, ' ');
                }
            }
        } else {
            System.out.println("Console não disponível");
        }
    }
}
