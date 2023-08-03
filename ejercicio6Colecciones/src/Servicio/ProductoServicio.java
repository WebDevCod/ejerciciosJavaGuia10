package Servicio;

import Entidad.Producto;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductoServicio {

    Scanner leer = new Scanner(System.in);
    HashMap<String, Double> productos = new HashMap();

    public void crearProducto() {

        String response;
        System.out.println("---------------------");
        System.out.println("Ingresar productos");
        System.out.println("---------------------");
        do {
            Producto producto = new Producto();
            System.out.print("Nombre del producto: ");
            producto.setNombre(leer.nextLine());
            System.out.print("Precio: $");
            producto.setPrecio(leer.nextDouble());
            productos.put(producto.getNombre(), producto.getPrecio());
            System.out.println("¿Quieres ingresar otro producto? (S/N)");
            response = leer.next();
            leer.nextLine();
        } while (response.equalsIgnoreCase("S"));
        System.out.println("---------------------");
    }

    public void modificarPrecio() {
        System.out.println("---------------------");
        System.out.println("Modificar precio");
        System.out.println("---------------------");
        System.out.println("Ingresa nombre del producto para modificar su precio:");
        String nombreProducto = leer.nextLine();

        if (productos.containsKey(nombreProducto)) {
            System.out.println("Ingresa el nuevo precio:");
            Double nuevoPrecio = leer.nextDouble();
            productos.put(nombreProducto, nuevoPrecio);
            System.out.println("Precio modificado con éxito.");
        } else {
            System.out.println("El producto no existe.");
        }
        System.out.println("---------------------");
    }

    public void eliminarProducto() {
        System.out.println("---------------------");
        System.out.println("Eliminar producto");
        System.out.println("---------------------");
        System.out.println("Ingresa nombre del producto que quieres eliminar:");
        String nombreProducto = leer.nextLine();
        if (productos.containsKey(nombreProducto)) {
            productos.remove(nombreProducto);
            System.out.println("Producto eliminado con éxito.");
        } else {
            System.out.println("El producto no pudo ser eliminado o no existe.");
        }
        System.out.println("---------------------");
    }

    public void mostrarProductos() {
        System.out.println("---------------------");
        System.out.println("Mostrar productos");
        System.out.println("---------------------");
        if (!productos.isEmpty()) {
            for (Map.Entry<String, Double> entry : productos.entrySet()) {
                String key = entry.getKey();
                Double value = entry.getValue();
                System.out.println("Producto: " + key + " - " + "Precio: $" + value);

            }
        } else {
            System.out.println("No hay productos para mostrar.");
        }
        System.out.println("---------------------");
    }

}
