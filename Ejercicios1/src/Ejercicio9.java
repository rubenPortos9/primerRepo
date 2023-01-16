import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Vaya introduciendo números enteros (-25 para terminar la ejecución):");
        int n;
        int zeros = 0;
        int neg = 0;

        while(true){
            n = s.nextInt();
            if(n==-25){
                break;
            }
            if(n==0){
                zeros += 1;
            }
            if(n<0){
                neg += 1;
            }
        }

        System.out.println("Ceros: " + zeros);
        System.out.println("Negativos: " + neg);
    }
}
