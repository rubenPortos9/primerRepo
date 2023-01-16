import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce una letra: ");
        char c = s.next().charAt(0);

        switch (c){
            case 'a':
                System.out.println("El número es 7.");
                break;
            case 'b':
                System.out.println("El número es 9.");
                break;
            case 'c':
                System.out.println("El número es 101.");
                break;
            default:
                System.out.println("Se ha equivocado de letra.");
                break;
        }
    }
}
