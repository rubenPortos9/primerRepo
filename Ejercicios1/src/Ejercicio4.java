import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args){
        String user = "qaracter";
        String pass = "password";

        Scanner s = new Scanner(System.in);
        int intentos = 2;

        while (true){
            System.out.print("Usuario: ");
            String usuario = s.next();
            System.out.print("Contraseña: ");
            String contr = s.next();

            if((!user.equals(usuario))||(!pass.equals(contr))){
                if (intentos==0){
                    throw new RuntimeException("Demasiados intentos incorrectos");
                }
                intentos -= 1;
                System.out.println("Usuario o contraseña incorrectos");
            }else{
                break;
            }
        }
        System.out.println("Bienvenido " + user);
    }
}
