import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce una frase:");
        String fr = s.nextLine();
        System.out.print("Introduce una letra: ");
        char c = s.next().charAt(0);

        int count = 0;
        for (int i = 0; i<fr.length(); i++){
            if(c==fr.charAt(i)){
                count += 1;
            }
        }

        System.out.println("El recuento de " + c + " es: " + count);
    }
}
