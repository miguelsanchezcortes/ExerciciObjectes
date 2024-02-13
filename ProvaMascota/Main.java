import Controller.MascotaController;
import Enumerats.EnumMascota;
import Model.Mascota;

public class Main {
    public static void main(String[] args) {
        Mascota m1 = new Mascota(1, "Tobi", EnumMascota.GOS, "Pastor Alemany", 5);
        System.out.println(m1.toString());
        m1.setNom("Paco");
        System.out.println(m1.toString());
        Mascota m2 = new Mascota(2, "Mimi", EnumMascota.GAT, "Persa", 3);
        System.out.println(m2.toString());
        Mascota[] mascotes = new Mascota[0];
        // instanciar un array de mascotes i afegir-hi les mascotes m1 i m2
        mascotes = (Mascota[]) MascotaController.afegirMascota(mascotes, m1);
        mascotes = (Mascota[]) MascotaController.afegirMascota(mascotes, m2);
        // eliminar la mascota m1
        System.out.println("Array de mascotes:");
        mascotes = (Mascota[]) MascotaController.eliminarMascota(mascotes, m1);
        MascotaController.mostrarArray(mascotes);
    }    
}
