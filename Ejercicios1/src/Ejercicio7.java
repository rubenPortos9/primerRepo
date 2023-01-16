import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int H, M, S;
        System.out.println("Inserte la hora, los minutos y los segundos uno por linea");
        H = s.nextInt();
        M = s.nextInt();
        S = s.nextInt();

        if(H<0||H>24){
            throw new RuntimeException("Valor de las horas invalido");
        }
        if(M<0||M>59){
            throw new RuntimeException("Valor de los minutos invalido");
        }
        if(S<0||S>59){
            throw new RuntimeException("Valor de los segundos invalido");
        }

        System.out.println("El formato de la fecha es correcto");
    }
}
