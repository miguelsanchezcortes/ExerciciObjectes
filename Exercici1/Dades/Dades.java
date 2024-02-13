package Exercici1.Dades;

import Exercici1.Model.Departament;
import Exercici1.Model.Empleat;

public class Dades {

    private static Empleat[] empleats = {
            new Empleat(1, "Pere", "Enginyer", 3000),
            new Empleat(2, "Anna", "Secretari", 3000),
            new Empleat(3, "Pau", "Enginyer", 3000),
            new Empleat(4, "Laura", "Enginyer", 3000),
            new Empleat(5, "Pep", "Enginyer", 3000),
            new Empleat(6, "Marta", "Enginyer", 3000),
            new Empleat(7, "Pol", "Enginyer", 3000),
            new Empleat(8, "Mireia", "Enginyer", 3000),
            new Empleat(9, "Miguel", "Enginyer", 3000),
            new Empleat(10, "Maria", "Enginyer", 3000)
    };

    private static Departament[] departaments = {
            new Departament(1, "Informàtica", "Barcelona"),
            new Departament(2, "Comptabilitat", "Barcelona"),
            new Departament(3, "Enginyeria", "Barcelona"),
            new Departament(4, "Recursos Humans", "Barcelona"),
            new Departament(5, "Logística", "Barcelona"),
            new Departament(6, "Màrqueting", "Barcelona"),
            new Departament(7, "Vendes", "Barcelona"),
            new Departament(8, "Direcció", "Barcelona"),
            new Departament(9, "Finances", "Barcelona"),
            new Departament(10, "Producció", "Barcelona")
    };

    public static Empleat[] getEmpleats() {
        return empleats;
    }

    public static Departament[] getDepartaments() {
        return departaments;
    }

    

    public static void setEmpleats(Empleat[] empleats) {
        Dades.empleats = empleats;
    }

    public static void setDepartaments(Departament[] departaments) {
        Dades.departaments = departaments;
    }

    public static void carregarDades(){
        empleats[0].setDepartament(departaments[0]);
        departaments[0].getEmpleatController().addEmpleat(empleats[0]);
        empleats[1].setDepartament(departaments[1]);
        departaments[1].getEmpleatController().addEmpleat(empleats[1]);
        empleats[2].setDepartament(departaments[2]);
        departaments[2].getEmpleatController().addEmpleat(empleats[2]);
        empleats[3].setDepartament(departaments[3]);
        departaments[3].getEmpleatController().addEmpleat(empleats[3]);
        empleats[4].setDepartament(departaments[4]);
        departaments[4].getEmpleatController().addEmpleat(empleats[4]);
        empleats[5].setDepartament(departaments[5]);
        departaments[5].getEmpleatController().addEmpleat(empleats[5]);
        empleats[6].setDepartament(departaments[6]);
        departaments[6].getEmpleatController().addEmpleat(empleats[6]);
        empleats[7].setDepartament(departaments[7]);
        departaments[7].getEmpleatController().addEmpleat(empleats[7]);
        empleats[8].setDepartament(departaments[8]);
        departaments[8].getEmpleatController().addEmpleat(empleats[8]);
        empleats[9].setDepartament(departaments[9]);
        departaments[9].getEmpleatController().addEmpleat(empleats[9]);
    }
}
