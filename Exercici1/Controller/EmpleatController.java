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
        
        int codi = getNextId();
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
        Empleat e = getEmpleatById(empleats, idEmpleat);
        if (!e.equals(null)) {
            empleats = eliminarEmpleatEnArray(empleats, e);
            Dades.setEmpleats(empleats);
            System.out.println("Mascota amb id: " + idEmpleat + " eliminada");
        } else {
            System.out.println("No existeix una mascota amb id: " + idEmpleat);
        }

    }

    public void editarEmpleat() {
        empleats = Dades.getEmpleats();
        llistarEmpleat();
        System.out.println("Selecciona el empleat que vols editar");
        int idEmpleat = Lector.llegirEnterPerTeclat();
        Empleat e = getEmpleatById(empleats, idEmpleat);
        if (!e.equals(null)) {
            // nom,edat,color pèl
            System.out.println("Nom actual: " + e.getNom());
            System.out.println("Introdueix el nou nom...");
            e.setNom(Lector.llegirStringPerTeclat());

            System.out.println("Ofici actual: " + e.getOfici());
            System.out.println("Introdueix el nou ofici...");
            e.setOfici(Lector.llegirStringPerTeclat());

            System.out.println("Salari actual: " + e.getSalari());
            System.out.println("Introdueix el nou salari...");
            e.setSalari(Lector.llegirEnterPerTeclat());;

            Dades.setEmpleats(empleats);;
        } else {
            System.out.println("No existeix un empleat amb id: " + idEmpleat);
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

    private Empleat getEmpleatById(Empleat[] empleats, int idEmpleat) {
        for (Empleat empleat : empleats) {
            if (empleat.getCodi() == idEmpleat) {
                return empleat;
            }
        }
        return null;
    }

    private Empleat[] eliminarEmpleatEnArray(Empleat[] empleats, Empleat e) {
        Empleat[] aux = new Empleat[empleats.length - 1];
        for (int i = 0, j = 0; i < empleats.length; i++) {
            if (!empleats[i].equals(e)) {
                aux[j] = empleats[i];
                j++;
            }
        }
        return aux;
    }

    private int getNextId() {
        return (empleats[empleats.length - 1].getCodi() + 1);
    }

}
