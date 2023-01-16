import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca un entero:");
        String n = s.next();
        int len = n.length();
        String rev = "";

        for (int i = 0; i<len; i++){
            rev += n.charAt(len-1-i);
        }

        System.out.println(rev);
    }
}
