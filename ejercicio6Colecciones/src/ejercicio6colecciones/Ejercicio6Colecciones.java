package ejercicio6colecciones;

import Servicio.ProductoServicio;
import java.util.Scanner;

public class Ejercicio6Colecciones {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        ProductoServicio ps = new ProductoServicio();

        int response;
        do {
            System.out.println("1) Ingresar producto");
            System.out.println("2) Modificar precio");
            System.out.println("3) Eliminar producto");
            System.out.println("4) Mostrar productos");
            System.out.println("5) Salir");
            response = leer.nextInt();

            switch (response) {
                case 1:
                    ps.crearProducto();
                    break;
                case 2:
                    ps.modificarPrecio();
                    break;
                case 3:
                    ps.eliminarProducto();
                    break;
                case 4:
                    ps.mostrarProductos();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("No existe esa opción, intenta nuevamente.");
            }
        } while (response != 5);

    }

}
