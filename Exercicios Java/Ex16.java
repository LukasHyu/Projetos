public class Ex16 {
    public static void main(String[] args) {
        String[] arra = new String[5]; // Cria um array de strings com 5 posições

        arra[0] = " +\"\"\"\"\"+ "; // Insere a string +"""""+ na posição 0 do array
        arra[1] = "[| o o |]"; // Insere a string [| o o |] na posição 1 do array
        arra[2] = " |  ^  |"; // Insere a string |  ^  | na posição 2 do array
        arra[3] = " | '-' |";  // Insere a string | '-' | na posição 3 do array
        arra[4] = " +-----+"; // Insere a string +-----+ na posição 4 do array
      
        for (int i = 0; i < 5; i++) { //Cria um loop que percorre o array e exibe cada posição
         System.out.println(arra[i]); 
        }
    }
}
