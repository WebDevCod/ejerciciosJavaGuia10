package ejercicio1colecciones;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio1Colecciones {

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
        
    }
    
}
