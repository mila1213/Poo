import java.util.Scanner;

public class ejercicioqual {

        public static void main(String[] args) {
            Scanner ingreso = new Scanner(System.in);
            String a;
            String b;
            System.out.println("Ingrese el primer nombre: ");
            a = ingreso.nextLine();
            System.out.println("Ingrese el segundo nombre: ");
            b = ingreso.nextLine();
            System.out.println("El primer nombre es: " + a);
            System.out.println("El segundo nombre es: " + b);
            System.out.println(a.equals(b));
        }
    }

