import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce 3 enteros:");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        int minor = a;

        if(b<a||c<a){
            if(c<b){
                minor = c;
            }else{
                minor = b;
            }
        }
        System.out.println("El menor es " + minor);
    }
}
