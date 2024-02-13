package org.model;

import org.enums.EnumTipusAnimal;

public class Mascota {
    private int id;
    private String nom;
    private EnumTipusAnimal tipus;
    private int edat;
    private String colorPel;

    public Mascota() {
    }

    public Mascota(int id, String nom, EnumTipusAnimal tipus, int edat, String colorPel) {
        this.id = id;
        this.nom = nom;
        this.tipus = tipus;
        this.edat = edat;
        this.colorPel = colorPel;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public EnumTipusAnimal getTipus() {
        return tipus;
    }

    public int getEdat() {
        return edat;
    }

    public String getColorPel() {
        return colorPel;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public void setColorPel(String colorPel) {
        this.colorPel = colorPel;
    }

    @Override
    public String toString() {
        return "id=" + id + ", nom=" + nom + ", tipus=" + tipus + ", edat=" + edat + ", colorPel=" + colorPel;
    }

}
