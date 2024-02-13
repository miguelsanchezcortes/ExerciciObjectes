package org.menu;

import org.util.Lector;

public class MenuPrincipal {

    public MenuPrincipal(){
        // int opcio;
        // do{
        //     mostrarPrincipal();
        //     opcio = Lector.llegirEnterPerTeclat();
        //     avaluarOpcio(opcio);
        // }while(opcio!=0);
    }

    public void inicia() {
       int opcio;
        do{
            mostrarPrincipal();
            opcio = Lector.llegirEnterPerTeclat();
            avaluarOpcio(opcio);
        }while(opcio!=0);
    }

    private void mostrarPrincipal() {
        System.out.println("Selecciona una opció");
        System.out.println("1. Gestionar Persones");
        System.out.println("2. Gestionar Mascotes");
        System.out.println("0. Sortir");
    }

    private void avaluarOpcio(int opcio) {
        switch (opcio) {
            case 1:
                MenuPersones mp = new MenuPersones();
                mp.inicia();
                break;
            case 2:
                MenuMascotes mc = new MenuMascotes();               
                break;
            case 0:
                System.out.println("Adéu");
                break;
            default:
                System.out.println("Opció incorrecta");
                break;
        }
    }

}
