package ejercicio2colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Ejercicio2Colecciones {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        List<String> razas = new ArrayList();

        String response;
        do {
            System.out.println("Ingresa una raza de perro:");
            razas.add(leer.nextLine());
            System.out.println("¿Quieres ingresar otra raza? S/N");
            response = leer.nextLine();
        } while (response.equalsIgnoreCase("S"));

        System.out.println("Lista de razas ingresadas:");
        razas.forEach((e) -> System.out.println(e));

        System.out.println("--------------------------------");

        System.out.println("Ingresar una raza para buscar en la lista y eliminarlo:");
        String raza = leer.nextLine();

        Iterator<String> it = razas.iterator();

        boolean bandera = false;

        while (it.hasNext()) {
            if (it.next().equalsIgnoreCase(raza)) {
                it.remove();
                bandera = true;
            }
        }

        String mensaje = bandera ? "La raza estaba en la lista y fue eliminada" : "La raza no se encontraba en la lista";

        System.out.println(mensaje);

        Collections.sort(razas);
        razas.forEach((e) -> System.out.println(e));
    }

}
