package Exercici1.Vista;

import Exercici1.Utils.Utils;

public class MenuPrincipal {
    
    public static void menuPrincipal(){
        System.out.println("Que vols fer?");
        System.out.println("1. Gestionar Empleats");
        System.out.println("2. Gestionar Departaments");
        System.out.println("0. Sortir");
        opcionsMenuPrincipal();
    }

    public static void opcionsMenuPrincipal(){
        int opcio;

        do{
            opcio = Utils.llegirEnterPerTeclat();
            switch(opcio){
                case 1: // Gestionar Empleats
                MenuEmpleat mEmpleat = new MenuEmpleat();
                mEmpleat.menuEmpleat();
                break;
                case 2:
                MenuDepartament mDepartament = new MenuDepartament();
                mDepartament.menuDepartament();
                break;
                case 0:
                break;
            }

        }while(opcio !=0);
    }
}
