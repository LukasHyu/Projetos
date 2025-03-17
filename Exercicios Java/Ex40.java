import java.nio.charset.Charset;

public class Ex40 {
    public static void main(String[] args) {
        System.out.println("Lista de caracters disponíveis:");      //Imprime a lista de caracteres disponíveis
        for (String str : Charset.availableCharsets().keySet()) {     //For que percorre a lista de caracteres disponíveis
            System.out.println(str);                                  //Imprime o nome do caractere

        }
    }
}
