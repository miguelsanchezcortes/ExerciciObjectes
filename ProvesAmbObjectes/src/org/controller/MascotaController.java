package org.controller;

import org.dades.Dades;
import org.enums.EnumTipusAnimal;
import org.model.Mascota;
import org.util.ArrayGeneric;
import org.util.Lector;

public class MascotaController {

    private Mascota[] mascotes;

    public void afegirMascota() {
        mascotes = Dades.getMascotes();
        Mascota m = demanarDadesMascota();
        mascotes = afegirMascotaEnArray(mascotes, m);
        mascotes = (Mascota[]) ArrayGeneric.afegirObjecteEnArray(new Mascota[mascotes.length + 1], mascotes, m);
        Dades.setMascotes(mascotes);
    }

    private Mascota demanarDadesMascota() {
        int id = getNextId();

        System.out.println("Donam el nom de la mascota");
        String nom = Lector.llegirStringPerTeclat();

        System.out.println("Donam el tipus d'animal");
        EnumTipusAnimal.mostrar();
        int idTipusAnimal = Lector.llegirEnterPerTeclat();
        EnumTipusAnimal tipus = EnumTipusAnimal.values()[idTipusAnimal];

        System.out.println("Donam l'edat de l'animal");
        int edat = Lector.llegirEnterPerTeclat();

        System.out.println("Donam el color del pèl");
        String color = Lector.llegirStringPerTeclat();

        Mascota m = new Mascota(id, nom, tipus, edat, color);

        return m;

    }

    public void eliminarMascota() {
        mascotes = Dades.getMascotes();
        llistarMascota();
        System.out.println("Selecciona la mascosta que vols eliminar");
        int idMascota = Lector.llegirEnterPerTeclat();
        Mascota m = getMascotaById(mascotes, idMascota);
        if (!m.equals(null)) {
            mascotes = eliminarMascotaEnArray(mascotes, m);
            Dades.setMascotes(mascotes);
            System.out.println("Mascota amb id: " + idMascota + " eliminada");
        } else {
            System.out.println("No existeix una mascota amb id: " + idMascota);
        }

    }

    private Mascota getMascotaById(Mascota[] mascotes, int idMascota) {
        for (Mascota mascota : mascotes) {
            if (mascota.getId() == idMascota) {
                return mascota;
            }
        }
        return null;
    }

    private Mascota[] eliminarMascotaEnArray(Mascota[] mascotes, Mascota m) {
        Mascota[] aux = new Mascota[mascotes.length - 1];
        for (int i = 0, j = 0; i < mascotes.length; i++) {
            if (!mascotes[i].equals(m)) {
                aux[j] = mascotes[i];
                j++;
            }
        }
        return aux;
    }

    public void editarMascota() {
        mascotes = Dades.getMascotes();
        llistarMascota();
        System.out.println("Selecciona la mascosta que vols editar");
        int idMascota = Lector.llegirEnterPerTeclat();
        Mascota m = getMascotaById(mascotes, idMascota);
        if (!m.equals(null)) {
            // nom,edat,color pèl
            System.out.println("Nom actual: " + m.getNom());
            System.out.println("Introdueix el nou nom...");
            m.setNom(Lector.llegirStringPerTeclat());

            System.out.println("Edat actual: " + m.getEdat());
            System.out.println("Introdueix la nova edat...");
            m.setEdat(Lector.llegirEnterPerTeclat());

            System.out.println("Color pèl actual: " + m.getColorPel());
            System.out.println("Introdueix el nou color del pèl...");
            m.setColorPel(Lector.llegirStringPerTeclat());

            Dades.setMascotes(mascotes);
        } else {
            System.out.println("No existeix una mascota amb id: " + idMascota);
        }
    }

    public void llistarMascota() {
        mascotes = Dades.getMascotes();
        for (Mascota mascota : mascotes) {
            System.out.println(mascota.toString());
        }

    }

    private int getNextId() {
        return (mascotes[mascotes.length - 1].getId() + 1);
    }

    private Mascota[] afegirMascotaEnArray(Mascota[] array, Mascota element) {
        Mascota[] aux = new Mascota[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            aux[i] = array[i];
        }
        aux[aux.length - 1] = element;

        return aux;
    }

}
