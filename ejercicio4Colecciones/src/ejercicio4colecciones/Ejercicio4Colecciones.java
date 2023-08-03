package ejercicio4colecciones;

import Servicio.PeliculaServicio;

public class Ejercicio4Colecciones {

    public static void main(String[] args) {
        PeliculaServicio ps = new PeliculaServicio();
        ps.crearPelicula();
        ps.mostrarPeliculas();
        ps.mostrarPeliculasMasDeUnaHora();
        ps.mostrarPeliculasDuracionDesc();
        ps.mostrarPeliculasDuracionAsc();
        ps.mostrarPeliculasPorTitulo();
        ps.mostrarPeliculasPorDirector();
    }

}
