package Exercici1.Controller;

import Exercici1.Dades.Dades;
import Exercici1.Model.Departament;
import Exercici1.Utils.Utils;

public class DepartamentController {
    private Departament[] departaments;

    public void afegirDepartament() {
        departaments = Dades.getDepartaments();
        Departament d = demanarDadesDepartament();
        departaments = afegirDepartamentEnArray(departaments, d);
        //departaments = (Departament[]) ArrayGeneric.afegirObjecteEnArray(new Departament[departaments.length + 1], departaments, d);
        Dades.setDepartaments(departaments);
    }

    private Departament demanarDadesDepartament() {
        System.out.println("Introdueix el codi de departament");
        int codi = Utils.llegirEnterPerTeclat();
        System.out.println("Introdueix el nom del de departament");
        String nom = Utils.llegirStringPerTeclat();
        System.out.println("Introdueix la localitat del departament");
        String localitat = Utils.llegirStringPerTeclat();
        Departament element = new Departament(codi, nom, localitat);

        return element;

    }

    public static Departament[] eliminarDepartament(Departament[] array, Departament element) {
        Departament[] aux = new Departament[array.length - 1];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (!array[i].equals(element)) {
                aux[j] = array[i];
                j++;
            }
        }
        return aux;
    }

    public static Departament[] modificarDepartament(Departament[] array, Departament element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(element)) {
                System.out.println("Introdueix el nou codi del departament");
                int codi = Utils.llegirEnterPerTeclat();
                System.out.println("Introdueix el nou nom del departament");
                String nom = Utils.llegirStringPerTeclat();
                System.out.println("Introdueix la nova localitat del departament");
                String localitat = Utils.llegirStringPerTeclat();
                array[i].setCodi(codi);
                array[i].setNom(nom);
                array[i].setLocalitat(localitat);
            }
        }
        return array;
    }

    public void llistarEmpleatsPerDepartament() {
        departaments = Dades.getDepartaments();
        for (Departament departament : departaments) {
            departament.empleatsPerDepartament();
            System.out.println();
        }
    }

    private Departament[] afegirDepartamentEnArray(Departament[] array, Departament element) {
        Departament[] aux = new Departament[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            aux[i] = array[i];
        }
        aux[aux.length - 1] = element;

        return aux;
    }
}
