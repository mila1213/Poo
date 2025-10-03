import java.util.Scanner;

public class Tabla {
    public static void main(String[] args) {
        int numero ;
        Scanner ingreso = new Scanner(System.in);
        System.out.println("Ingrese el numero: ");
        numero = ingreso.nextInt();
        for (int i = 0; i < 13; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}