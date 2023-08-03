package Servicio;

import Entidad.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

public class AlumnoServicio {

    Scanner leer = new Scanner(System.in);

    ArrayList<Alumno> alumnosList = new ArrayList();

    public void crearAlumno() {

        String response;

        do {
            Alumno alumno = new Alumno(); // primero creo el objeto Alumno

            ArrayList<Integer> notas = new ArrayList(); // creo la lista de notas que tendrá ese alumno como atributo

            System.out.print("Nombre de alumno: ");
            alumno.setNombre(leer.nextLine());

            System.out.println("Ingresa sus notas:");
            for (int i = 1; i < 4; i++) {
                System.out.println("Nota " + i + ")");
                notas.add(leer.nextInt());
            }

            alumno.setNotas(notas); // usando el método set le paso el ArrayList de notas

            alumnosList.add(alumno); // agrego el objeto creado con sus atributos al ArrayList alumnosList

            System.out.println("¿Quieres ingresar otro alumno? S/N");
            response = leer.next();
            leer.nextLine();

        } while (response.equalsIgnoreCase("S"));

    }

    public boolean buscarAlumno(String nombreAlumno) {
        boolean response = false;
        for (Alumno alumno : alumnosList) {
            if (alumno.getNombre().equalsIgnoreCase(nombreAlumno)) {
                response = true;
                return response;
            }
        }
        System.out.println("Alumno no encontrado");
        return response;
    }

    public double notaFinal(String nombreAlumno) {
        float cantidadDeNotas = 0;
        float sumaDeNotas = 0;

        for (Alumno alumno : alumnosList) {
            if (alumno.getNombre().equalsIgnoreCase(nombreAlumno)) {
                for (int i = 0; i < alumno.getNotas().size(); i++) {
                    sumaDeNotas += alumno.getNotas().get(i);
                    cantidadDeNotas++;
                }
            }
        }

        double notaFinal = (Math.floor((sumaDeNotas / cantidadDeNotas) * 10)) / 10;

        /* otra manera de mostrar la nota con x cantidad de decimales
        DecimalFormat formato = new DecimalFormat ("#.000");
    String resultado = formato.format(promedio);*/
        
        return notaFinal;
    }

}