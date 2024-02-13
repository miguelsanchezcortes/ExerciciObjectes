package org.dades;

import org.model.Mascota;
import org.model.Persona;
import org.enums.*;

public class Dades {
    private static Mascota[] mascotes = {
            new Mascota(1, "johnny", EnumTipusAnimal.GAT, 1, "gris"),
            new Mascota(2, "pepito", EnumTipusAnimal.GOS, 2, "negre"),
            new Mascota(4, "mishi", EnumTipusAnimal.GAT, 3, "blanc"),
            new Mascota(6, "michi", EnumTipusAnimal.GOS, 1, "gris"),
            new Mascota(9, "furulai", EnumTipusAnimal.PERIQUITO, 2, "vermell"),
            new Mascota(15, "sappy", EnumTipusAnimal.PERIQUITO, 1, "gris")
    };

    private static Persona[] persones = {
            new Persona(1, "juanito"),
            new Persona(),
            new Persona(12, "Pepito", "cognom", "Lalasl", 15, "pepito@.com", 87867, EnumSexe.HOME),
            new Persona(5, "amparito")
    };

    public static Mascota[] getMascotes() {
        return mascotes;
    }

    public static Persona[] getPersones() {
        return persones;
    }

    public static void setMascotes(Mascota[] mascotesIn) {
        mascotes = mascotesIn;
    }

    public static void setPersones(Persona[] personesIn) {
        persones = personesIn;
    }
}
