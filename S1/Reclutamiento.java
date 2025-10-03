import java.util.Scanner;

public class Reclutamiento {
    public static void main(String[] args) {
        int edad;
        double altura;
        double alturadef = 1.60;
        Scanner ingreso = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        edad = ingreso.nextInt();

        System.out.print("Ingrese su altura en metros: ");
        altura = ingreso.nextDouble();

        if (edad >= 18 && altura >= alturadef ) {
            System.out.println("Cumple ");

        } else {
            System.out.println("No cumple ");
        }
    }
}
