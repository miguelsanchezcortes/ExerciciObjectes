package Model;
import Enumerats.EnumMascota;

public class Mascota {
    private int id;
    private String nom;
    private EnumMascota tipus;
    private String raça;
    private int edat;

    
    public Mascota() {
    }

    
    public Mascota(int id, String nom, EnumMascota tipus, String raça, int edat) {
        this.id = id;
        this.nom = nom;
        this.tipus = tipus;
        this.raça = raça;
        this.edat = edat;
    }


    public int getId() {
        return id;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public EnumMascota getTipus() {
        return tipus;
    }
    public void setTipus(EnumMascota tipus) {
        this.tipus = tipus;
    }
    public String getRaça() {
        return raça;
    }
    public void setRaça(String raça) {
        this.raça = raça;
    }
    public int getEdat() {
        return edat;
    }
    public void setEdat(int edat) {
        this.edat = edat;
    }


    @Override
    public String toString() {
        return "Mascota [id=" + id + ", nom=" + nom + ", tipus=" + tipus + ", raça=" + raça + ", edat=" + edat + "]";
    }

    

    
}
