import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args){
        String meses[] = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto",
        "septiembre","octubre","noviembre","diciembre"};

        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca el número de un mes");
        int m = s.nextInt();

        if(m<1||m>12){
            throw new RuntimeException("Número de mes invalido");
        }

        switch (meses[m-1]){
            case "enero":
                System.out.println("Enero, 31 días.");
                break;
            case "febrero":
                System.out.println("Febrero, 28 días.");
                break;
            case "marzo":
                System.out.println("Marzo, 31 días.");
                break;
            case "abril":
                System.out.println("Abril, 30 días.");
                break;
            case "mayo":
                System.out.println("Mayo, 31 días.");
                break;
            case "junio":
                System.out.println("Junio, 30 días.");
                break;
            case "julio":
                System.out.println("Julio, 31 días.");
                break;
            case "agosto":
                System.out.println("Agosto, 31 días.");
                break;
            case "septiembre":
                System.out.println("Septiembre, 30 días.");
                break;
            case "octubre":
                System.out.println("Octubre, 31 días.");
                break;
            case "noviembre":
                System.out.println("Noviembre, 30 días.");
                break;
            case "diciembre":
                System.out.println("Diciembre, 31 días.");
                break;
            default:
                throw new RuntimeException("Número de mes inválido");
        }
    }
}
