import java.util.Scanner;

public class aprobadoReprobado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa tu nota (0-100): ");
        int nota = sc.nextInt();

        if (nota >= 60) {
            System.out.println("Aprobado.");
        } 
    }
}

    

