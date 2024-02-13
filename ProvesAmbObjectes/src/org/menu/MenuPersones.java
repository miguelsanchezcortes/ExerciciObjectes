package org.menu;

import org.controller.PersonaController;
import org.util.Lector;

public class MenuPersones {

    public MenuPersones() {
        
    }
    public void inicia(){
        int opcio = 0;
        do {
            mostrar();
            opcio = Lector.llegirEnterPerTeclat();
            avaluarOpcioPersones(opcio);
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

    private void avaluarOpcioPersones(int opcio) {
        PersonaController pc = new PersonaController();
        switch (opcio) {
            case 1:
                pc.afegirPersona();
                break;
            case 2:
                pc.eliminarPersona();
                break;
            case 3:
                pc.editarPersona();
                break;
            case 4:
                pc.llistarPersona();
                break;
            default:
                System.out.println("Tornant enrere...");
                break;
        }
    }
}
