package Controller;

import Model.Mascota;

public class MascotaController {

    public static Object[] afegirObjecte(Object[] aux, Object[] array, Object element) {
        aux = new Object[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            aux[i] = array[i];
        }
        aux[array.length] = element;
        return aux;
    }

    public static Mascota[] afegirMascota(Mascota[] array, Mascota element) {
        Mascota[] aux = new Mascota[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            aux[i] = array[i];
        }
        aux[array.length] = element;
        return aux;
    }

    public static Object[] eliminarObjecte(Object[] array, Object element) {
        Object[] aux = new Object[array.length - 1];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (!array[i].equals(element)) {
                aux[j] = array[i];
                j++;
            }
        }
        return aux;
    }

    public static Mascota[] eliminarMascota(Mascota[] array, Mascota element) {
        Mascota[] aux = new Mascota[array.length - 1];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (!array[i].equals(element)) {
                aux[j] = array[i];
                j++;
            }
        }
        return aux;
    }

    public static void mostrarArray(Object[] array) {
        for (Object object : array) {
            System.out.println(object.toString());
        }
    }
}
