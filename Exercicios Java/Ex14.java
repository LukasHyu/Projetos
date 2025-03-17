public class Ex14 {
    public static void main(String[] args) {
        String p1 = "* * * * * * ==================================\n * * * * *  =================================="; // Define a string p1
        String p2 = "=============================================="; // Define a string p2
        
        for (int i = 0; i < 4; i++) { //Mostra na tela 4 vezes a string p1
            System.out.println(p1); 
        }
        System.out.println("* * * * * * =================================="); // Mostra na tela a string p1
        for (int i = 0; i < 6; i++) { // Mostra na tela 6 vezes a string p2
            System.out.println(p2);
        }
    }
}
