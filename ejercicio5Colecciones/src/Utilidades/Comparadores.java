package Utilidades;

import Entidad.Pais;
import java.util.Comparator;

public class Comparadores {
    
    public static Comparator<Pais> ordenarAlfabeticamente = new Comparator<Pais>() {
        @Override
        public int compare(Pais t, Pais t1) {
            return t.getNombre().compareTo(t1.getNombre());
        }
    };
}
