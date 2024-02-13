package Exercici1;

import Exercici1.Dades.Dades;
import Exercici1.Vista.MenuPrincipal;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.iniciar();
    }
    public static void iniciar(){
        Dades.carregarDades();
        MenuPrincipal principal = new MenuPrincipal();
        principal.menuPrincipal();
    }
}
