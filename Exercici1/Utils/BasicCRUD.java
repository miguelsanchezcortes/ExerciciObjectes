package Exercici1.Utils;

public class BasicCRUD {
    public static Object[] afegirObjecteEnArray(Object[] aux, Object[] array, Object element){
        for (int i = 0; i < array.length; i++) {
            aux[i] = array[i];
        }
        aux[aux.length - 1] = element;

        return aux;
    }

    public static void mostrarArray(Object[] array) {
        for (Object object : array) {
            System.out.println(object.toString());
        }
    }
}
