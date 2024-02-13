package org.util;

import org.model.Mascota;
import org.model.Persona;

public class ArrayGeneric {

    public static Object[] afegirObjecteEnArray(Object[] aux, Object[] array, Object element){
        for (int i = 0; i < array.length; i++) {
            aux[i] = array[i];
        }
        aux[aux.length - 1] = element;

        return aux;
    }


    public static Mascota[] afegirObject(Mascota[] array, Mascota element){
        Mascota[] aux = new Mascota[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            aux[i] = array[i];
        }
        aux[aux.length - 1] = element;

        return aux;
    }

    public static Object[] afegirObjecte(Object[] array, Object element){
        Object[] aux = new Object[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            aux[i] = array[i];
        }
        aux[aux.length - 1] = element;

        return aux;
    }


    public static Persona[] afegirPersona(Persona[] persones, Persona persona){
        Persona[] aux = new Persona[persones.length + 1];
        for (int i = 0; i < persones.length; i++) {
            aux[i] = persones[i];
        }
        aux[aux.length - 1] = persona;

        return aux;
    }


    public static String[][] afegirElementEnArray(String[][] array, String[] element) {
        String[][] aux = new String[array.length + 1][array[0].length];
        for (int i = 0; i < array.length; i++) {
            aux[i] = array[i];
        }
        aux[aux.length - 1] = element;

        return aux;
    }

    public static String[][] eliminarElementeEnArray(String[][] array, int posicio) {
        // creem un nou array amb 1 posició menys
        String[][] aux = new String[array.length - 1][array[0].length];

        // copiem tots els elements
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i != posicio) {
                aux[j]= array[i];
                j++;
            }
        }

        return aux;
    }

    public static String getLastId(String[][] array){
        return String.valueOf(Integer.parseInt(array[array.length - 1][0]) + 1);
    }
}
