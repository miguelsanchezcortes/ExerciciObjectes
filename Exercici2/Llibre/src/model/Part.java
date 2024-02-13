package model;


public class Part {
    private String nom;

    private Capítol[] capítols = new Capítol[0];

    public Part() {
    }

    public Part(String nom, Capítol[] capítols) {
        this.nom = nom;
        this.capítols = capítols;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Capítol[] getCapítols() {
        return capítols;
    }

    public void setCapítols(Capítol[] capítols) {
        this.capítols = capítols;
    }

    

}
