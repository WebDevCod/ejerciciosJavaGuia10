package ejercicio5colecciones;

import Servicio.PaisServicio;

public class Ejercicio5Colecciones {

    public static void main(String[] args) {
       PaisServicio ps = new PaisServicio();
       ps.crearPais();
       ps.mostrarPaises();
       ps.mostrarOrdenadoAlfabeticamente();
       ps.eliminarPais();
    }
    
}
