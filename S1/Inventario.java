import java.util.Scanner;

public class Inventario {
    public static void main(String[] args) {
        String nombre;
        int stock;
        double valor;
        double total;

        Scanner ingreso = new Scanner(System.in);

        System.out.print("Ingrese el nombre del producto plástico: ");
        nombre = ingreso.nextLine();
        System.out.print("Ingrese el stock del producto: ");
        stock = ingreso.nextInt();
        System.out.print("Ingrese el valor unitario del producto: ");
        valor = ingreso.nextDouble();

        total = stock * valor;

        System.out.println("Producto: " + nombre);
        System.out.println("Cantidad en stock: " + stock);
        System.out.println("Valor unitario: " + valor);
        System.out.println(">> Valor total del stock: " + total);
        // COMENTARIO

    }
}
