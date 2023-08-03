package Servicio;

import Entidad.Pelicula;
import Utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PeliculaServicio {

    Scanner leer = new Scanner(System.in);

    ArrayList<Pelicula> peliculasList = new ArrayList();

    public void crearPelicula() {

        String response;

        do {
            Pelicula pelicula = new Pelicula();
            System.out.println("***Ingreso de películas***");
            System.out.print("Título: ");
            pelicula.setTitulo(leer.nextLine());
            System.out.print("Director: ");
            pelicula.setDirector(leer.nextLine());
            System.out.print("Duración(hs): ");
            pelicula.setDuracion(leer.nextInt());
            leer.nextLine();
            peliculasList.add(pelicula);
            System.out.println("¿Quieres ingresar otra película? (S/N)");
            response = leer.next();
            leer.nextLine();
        } while (response.equalsIgnoreCase("S"));

    }

    public void mostrarPeliculas() {
        System.out.println("-------------------------------");
        System.out.println("***Listado de películas***");
        peliculasList.forEach((e) -> System.out.println(e));
        System.out.println("-------------------------------");
    }

    public void mostrarPeliculasMasDeUnaHora() {
        System.out.println("***Peliculas con duración mayor a 1 hora***");
        for (Pelicula pelicula : peliculasList) {
            if (pelicula.getDuracion() > 1) {
                System.out.println(pelicula);
            }
        }
        System.out.println("-------------------------------");
    }

    public void mostrarPeliculasDuracionDesc() {
        Collections.sort(peliculasList, Comparadores.ordenarDuracionDescendente);
        System.out.println("***Listado de películas por duración descendente***");
        peliculasList.forEach((e) -> System.out.println(e));
        System.out.println("-------------------------------");

    }

    public void mostrarPeliculasDuracionAsc() {
        Collections.sort(peliculasList, Comparadores.ordenarDuracionAscendente);
        System.out.println("***Listado de películas por duración ascendente***");
        peliculasList.forEach((e) -> System.out.println(e));
        System.out.println("-------------------------------");

    }

    public void mostrarPeliculasPorTitulo() {
        Collections.sort(peliculasList, Comparadores.ordenarPorTitulo);
        System.out.println("***Listado de películas ordenadas por título***");
        peliculasList.forEach((e) -> System.out.println(e));
        System.out.println("-------------------------------");

    }

    public void mostrarPeliculasPorDirector() {
        Collections.sort(peliculasList, Comparadores.ordenarPorDirector);
        System.out.println("***Listado de películas ordenadas por director***");
        peliculasList.forEach((e) -> System.out.println(e));
        System.out.println("-------------------------------");

    }

}
