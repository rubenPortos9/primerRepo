import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Que operacion desea?\n" +
                "\t1) Suma\n" +
                "\t2) Resta");
        int opt = s.nextInt();
        System.out.println("Introduce los numeros con los que operar:");
        int a = s.nextInt();
        int b = s.nextInt();
        int res;

        switch (opt){
            case 1:
                res = a+b;
                break;
            case 2:
                res = a-b;
                break;
            default:
                throw new RuntimeException("Operación inválida");
        }

        System.out.println("El resultado es: " + res);
    }
}
