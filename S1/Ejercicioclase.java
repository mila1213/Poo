import java.util.Scanner;

import java.util.Scanner;
public class Ejercicioclase {
        public static void main(String[] args) {
            Scanner ingreso = new Scanner(System.in);
            String usuario ;
            String usuario1 = "Cami" ;
            String clave1 = "Cami123" ;
            System.out.print("Usuario: ");
            usuario = ingreso.nextLine();
            switch (usuario) {
                case "Cami":
                    int intentos = 0;
                    while (intentos < 3) {
                        System.out.print("Clave: ");
                        String clave = ingreso.nextLine();
                        if (clave.equals(clave1)) {
                            System.out.println("Bienvenido.");
                            break;
                        } else {
                            System.out.println("Clave incorrecta.");
                            intentos++;
                        }
                    }
                    if (intentos == 3) {
                        System.out.println("Acceso denegado.");
                    }
                    break;
                default:
                    System.out.println("Usuario incorrecto.");
                    break;
            }
        }
    }


