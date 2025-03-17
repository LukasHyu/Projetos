import java.util.Scanner;

public class Ex36 {
    public static void main(String[] args) {
       
        try (Scanner in = new Scanner(System.in)) {                                 //Criando o Scanner para receber os valores
            System.out.print("Digite a latitude da primeira coordenada:");        //Imprime a mensagem para o usuario
               double lat1 = in.nextDouble();                                       //Recebe o valor da primeira coordenada
                System.out.print("Digite a longitude da primeira coordenada:");   //Imprime a mensagem para o usuario
                double lon1 = in.nextDouble();                                      //Recebe o valor da segunda coordenada

                System.out.print("Digite a latitude da segunda coodenada:");      //Imprime a mensagem para o usuario
                double lat2 = in.nextDouble();                                      //Recebe o valor da primeira coordenada
                System.out.print("Digite a longitude da segunda coordenada:");    //Imprime a mensagem para o usuario
                double lon2 = in.nextDouble();                                      //Recebe o valor da segunda coordenada
                System.out.printf("A distancia entre o ponto X:%.0f Y:%.0f e o ponto X:%.0f Y:%.0f é de: %.0f ", lat1, lon1, lat2, lon2, (distancia_entre(lat1, lat2, lon1, lon2))); 
                //Imprime a distancia entre os pontos
        }
    }
    public static double distancia_entre(double lat1, double lat2, double lon1, double lon2) {  //Metodo para calcular a distancia entre dois pontos
        lat1 = Math.toRadians(lat1);    //Converte o valor de lat1 para radianos
        lon1 = Math.toRadians(lon1);    //Converte o valor de lon1 para radianos
        lat2 = Math.toRadians(lat2);    //Converte o valor de lat2 para radianos
        lon2 = Math.toRadians(lon2);    //Converte o valor de lon2 para radianos

        double radioTerra = 6371.01;    //Raio da terra em quilometros
        
        return radioTerra * Math.acos(Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon1 - lon2)); //Retorna o valor da distancia
    }
}
