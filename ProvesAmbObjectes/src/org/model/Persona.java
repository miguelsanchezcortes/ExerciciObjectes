package org.model;

import org.enums.EnumSexe;

public class Persona {
    private int id;
    private String nom;
    private String cognom1;
    private String cognom2;
    private int edat;
    private String email;
    private int telefon;
    private EnumSexe sexe;

    static int contador = 0;

    public Persona() {
    }

    public Persona(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public Persona(int id, String nom, String cognom1,
            String cognom2, int edat, String email, int telefon, EnumSexe sexe) {
        this.id = id;
        this.nom = nom;
        this.cognom1 = cognom1;
        this.cognom2 = cognom2;
        this.edat = edat;
        this.email = email;
        this.telefon = telefon;
        this.sexe = sexe;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setCognom1(String cognom1) {
        this.cognom1 = cognom1;
    }

    public void setCognom2(String cognom2) {
        this.cognom2 = cognom2;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return this.nom;
    }

    public String getCognom1() {
        return cognom1;
    }

    public String getCognom2() {
        return cognom2;
    }

    public int getEdat() {
        return edat;
    }

    public String getEmail() {
        return email;
    }

    public int getTelefon() {
        return telefon;
    }

    public EnumSexe getSexe() {
        return sexe;
    }

    public void jugar() {
        System.out.println("Estic jugant");
    }

    @Override
    public String toString() {
        return "id=" + id + ", nom=" + nom + ", cognom1=" + cognom1 + ", cognom2=" + cognom2 + ", edat=" + edat
                + ", email=" + email + ", telefon=" + telefon + ", sexe=" + sexe;
    }

    public String imprimir() {
        return "id=" + id + ", nom=" + nom + ", cognom1=" + cognom1 + ", cognom2=" + cognom2 + ", edat=" + edat
                + ", email=" + email + ", telefon=" + telefon + ", sexe=" + sexe;
    }

    public static void imprimir2() {
        System.out.println("Saludar");
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contadorIn) {
        contador = contadorIn;
    }

    public void caminar() {
        System.out.println("Estic caminant");
    }

    public void menjar() {
        System.out.println("Estic menjant");
    }

}
