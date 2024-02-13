package Exercici1.Controller;

import org.model.Mascota;
import org.util.Lector;

import Exercici1.Dades.Dades;
import Exercici1.Model.Empleat;
import Exercici1.Utils.BasicCRUD;
import Exercici1.Utils.Utils;

public class EmpleatController {
    private Empleat[] empleats;

    public EmpleatController() {
        empleats = new Empleat[0];
    }

    public void addEmpleat(Empleat e) {
        empleats = (Empleat[]) BasicCRUD.afegirObjecteEnArray(new Empleat[empleats.length + 1], empleats, e);
    }

    public void afegirEmpleat() {
        empleats = Dades.getEmpleats();
        Empleat e = demanarDadesEmpleat();
        empleats = afegirEmpleatEnArray(empleats, e);
        //empleats = (Empleat[]) ArrayGeneric.afegirObjecteEnArray(new Empleat[empleats.length + 1], empleats, e);
        Dades.setEmpleats(empleats);
    }

    private Empleat demanarDadesEmpleat() {
        System.out.println("Introdueix el codi de l'empleat");
        int codi = Utils.llegirEnterPerTeclat();
        System.out.println("Introdueix el nom de l'empleat");
        String nom = Utils.llegirStringPerTeclat();
        System.out.println("Introdueix l'ofici de l'empleat");
        String ofici = Utils.llegirStringPerTeclat();
        System.out.println("Introdueix el salari de l'empleat");
        int salari = Utils.llegirEnterPerTeclat();
        Empleat element = new Empleat(codi, nom, ofici, salari);

        return element;

    }

    public void eliminarEmpleat() {
        empleats = Dades.getEmpleats();
        llistarEmpleat();
        System.out.println("Selecciona la mascosta que vols eliminar");
        int idEmpleat = Lector.llegirEnterPerTeclat();
        Empleat e = getMascotaById(empleats, idEmpleat);
        if (!e.equals(null)) {
            empleats = eliminarMascotaEnArray(empleats, e);
            Dades.setEmpleats(empleats);
            System.out.println("Mascota amb id: " + idEmpleat + " eliminada");
        } else {
            System.out.println("No existeix una mascota amb id: " + idMascota);
        }

    }

    public void llistarEmpleatsPerDepartament() {
        if (empleats.length == 0) {
            System.out.println("No hi ha empleats");
        } else {
            for (Empleat empleat : empleats) {
                System.out.println(empleat.toString());
            }
        }
    }

    private Empleat[] afegirEmpleatEnArray(Empleat[] array, Empleat element) {
        Empleat[] aux = new Empleat[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            aux[i] = array[i];
        }
        aux[aux.length - 1] = element;

        return aux;
    }

    public void llistarEmpleat() {
        empleats = Dades.getEmpleats();
        for (Empleat empleat : empleats) {
            System.out.println(empleat.toString());
        }

    }

}
