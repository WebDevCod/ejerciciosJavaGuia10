package ejercicio3colecciones;

import Servicio.AlumnoServicio;
import java.util.Scanner;

public class Ejercicio3Colecciones {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        AlumnoServicio as = new AlumnoServicio();
        
        as.crearAlumno();
        
        System.out.println("---------------------------------------------------");
        System.out.println("Ingresa nombre de alumno para calcular nota final:");
        String nombreAlumno = leer.nextLine();
        
        boolean response = as.buscarAlumno(nombreAlumno);
        
        double notaPromedio = 0;
        if (response) {
            notaPromedio = as.notaFinal(nombreAlumno);
        }
        System.out.println("La nota promedio de " + nombreAlumno + " es: " + notaPromedio);
    }

}
