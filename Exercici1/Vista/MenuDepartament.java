package Exercici1.Vista;

import Exercici1.Controller.DepartamentController;
import Exercici1.Controller.EmpleatController;
import Exercici1.Dades.Dades;
import Exercici1.Utils.BasicCRUD;
import Exercici1.Utils.Utils;

public class MenuDepartament {
    
    public static void menuDepartament(){
        System.out.println("Que vols fer?");
        System.out.println("1. Alta Departament");
        System.out.println("2. Modificar Departament");
        System.out.println("3. Eliminar Departament");
        System.out.println("4. Llistar Departament");
        System.out.println("5. Llistar Empleats per Departament");
        System.out.println("0. Tornar enrere");
        opcionsMenuDepartament();
    }

    public static void opcionsMenuDepartament(){
        int opcio;

        do{
            opcio = Utils.llegirEnterPerTeclat();
            DepartamentController dc = new DepartamentController();
            Dades departaments = new Dades();

            switch(opcio){
                case 1: // Afegir Departament
                dc.afegirDepartament();
                break;
                case 2: // Modificar Departament
                dc.modificarDepartament(departaments, null)
                break;
                case 3: // Eliminar Departament
                break;
                case 4: // Llistar Departament
                BasicCRUD.mostrarArray(departaments.getDepartaments());
                break;
                case 5: // Llistar Empleats per Departament
                dc.llistarEmpleatsPerDepartament();
                case 0:
                break;
            }

        }while(opcio !=0);
    }
}
