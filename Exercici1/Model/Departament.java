package Exercici1.Model;

import Exercici1.Controller.EmpleatController;

public class Departament {
    private int codi;
    private String nom;
    private String localitat;
    private EmpleatController empleatController;

    public Departament() {
    }

    public Departament(int codi, String nom, String localitat) {
        this.codi = codi;
        this.nom = nom;
        this.localitat = localitat;
        this.empleatController = new EmpleatController();
    }

    public int getCodi() {
        return codi;
    }

    public String getNom() {
        return nom;
    }

    public String getLocalitat() {
        return localitat;
    }

    public void setCodi(int codi) {
        this.codi = codi;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setLocalitat(String localitat) {
        this.localitat = localitat;
    }

    public EmpleatController getEmpleatController() {
        return empleatController;
    }

    public void setEmpleatController(EmpleatController empleatController) {
        this.empleatController = empleatController;
    }

    public void empleatsPerDepartament() {
        System.out.println("Departament [id=" + codi + ", nom=" + nom + ", localitat=" + localitat + "]");
        empleatController.llistarEmpleatsPerDepartament();
    }

    @Override
    public String toString() {
        return "Departament [codi=" + codi + ", nom=" + nom + ", localitat=" + localitat + ", empleatController="
                + empleatController + "]";
    }

}
