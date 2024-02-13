package org.menu;

import org.controller.MascotaController;
import org.util.Lector;

public class MenuMascotes {

    public MenuMascotes() {
    }

    public void inicia(){
        int opcio = 0;
        do {
            mostrar();
            opcio = Lector.llegirEnterPerTeclat();
            avaluarOpcioMascotes(opcio);
        } while (opcio != 0);
    }

    private void mostrar() {
        System.out.println("Selecciona una opció");
        System.out.println("1. Crear");
        System.out.println("2. Eliminar");
        System.out.println("3. Editar");
        System.out.println("4. Llistar");
        System.out.println("0. Tornar enrere");

    }

    private void avaluarOpcioMascotes(int opcio) {
        MascotaController mc = new MascotaController();
        switch (opcio) {
            case 1:
                mc.afegirMascota();
                break;
            case 2:
                mc.eliminarMascota();
                break;
            case 3:
                mc.editarMascota();
                break;
            case 4:
                mc.llistarMascota();
                break;
            case 0:
                System.out.println("Tornant enrere...");
                break;
            default:
                System.out.println("Opció incorrecta");
                break;
        }
    }
}
