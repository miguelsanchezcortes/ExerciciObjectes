package Exercici1.Vista;

import Exercici1.Controller.EmpleatController;
import Exercici1.Dades.Dades;
import Exercici1.Utils.BasicCRUD;
import Exercici1.Utils.Utils;

public class MenuEmpleat {
    
    public static void menuEmpleat(){
        System.out.println("Que vols fer?");
        System.out.println("1. Alta Empleat");
        System.out.println("2. Modificar Empleat");
        System.out.println("3. Eliminar Empleat");
        System.out.println("4. Llistar Empleats");
        System.out.println("0. Tornar enrere");
        opcionsMenuEmpleat();
    }

    public static void opcionsMenuEmpleat(){
        int opcio;

        do{
            opcio = Utils.llegirEnterPerTeclat();
            EmpleatController ec = new EmpleatController();
            Dades empleats = new Dades();

            switch(opcio){
                case 1: // Afegir Empleat
                ec.afegirEmpleat();
                System.out.println("Empleat creat");
                break;
                case 2: // Modificar Empleat
                break;
                case 3: // Eliminar Empleat
                break;
                case 4: // Llistar Empleats
                BasicCRUD.mostrarArray(empleats.getEmpleats());
                break;
                case 0:
                System.out.println("Tornant enrere");
                break;
            }

        }while(opcio !=0);
    }
}
