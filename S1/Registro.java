import java.util.Scanner;

public class Registro {
    public static void main(String[] args) {
        Scanner registros = new Scanner(System.in);
        String nombre;
        String cedula;
        String telefono;
        String email;

        System.out.print("Ingrese el nombre: ");
        nombre = registros.nextLine().trim();
        if (nombre.isEmpty()) {
            System.out.println("El nombre no puede estar vacío");
            return;
        }

        System.out.print("Ingrese la cédula: ");
        cedula = registros.nextLine().trim();
        if (cedula.isEmpty()) {
            System.out.println("La cédula no puede estar vacía");
            return;
        }

        System.out.print("Ingrese el teléfono: ");
        telefono = registros.nextLine().trim();
        if (telefono.isEmpty()) {
            System.out.println("El teléfono no puede estar vacío");
            return;
        }

        System.out.print("Ingrese el email: ");
        email = registros.nextLine().trim();
        if (email.isEmpty()) {
            System.out.println("El email no puede estar vacío");
            return;
        }

        System.out.println(" Ficha del Cliente: ");
        System.out.println("Nombre: " + nombre);
        System.out.println("Cédula: " + cedula);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Email: " + email);
    }
}
