package Servicio;

import Entidad.Pais;
import Utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class PaisServicio {

    Scanner leer = new Scanner(System.in);

    HashSet<Pais> paises = new HashSet();

    public void crearPais() {

        String response;

        do {
            Pais pais = new Pais();
            System.out.println("Ingresa el nombre de un país");
            pais.setNombre(leer.nextLine());
            paises.add(pais);
            System.out.println("¿Quieres ingresar otro país? (S/N)");
            response = leer.nextLine();
        } while (response.equalsIgnoreCase("S"));

    }

    public void mostrarPaises() {
        System.out.println("---------------------");
        paises.forEach((e) -> System.out.println(e));
        System.out.println("---------------------");
    }

    public void mostrarOrdenadoAlfabeticamente() {
        ArrayList<Pais> paisesList = new ArrayList(paises);
        Collections.sort(paisesList, Comparadores.ordenarAlfabeticamente);
        paisesList.forEach((e) -> System.out.println(e));
        System.out.println("---------------------");

    }

    public void eliminarPais() {

        System.out.println("Ingresa un país para eliminar");
        String nombrePais = leer.nextLine();
        Iterator<Pais> it = paises.iterator();
        while (it.hasNext()) {
            if (it.next().getNombre().equalsIgnoreCase(nombrePais)) {
                it.remove();
                mostrarPaises();
                return;
            }
        }
        System.out.println("El país no se encuentra en la lista");

    }
}
