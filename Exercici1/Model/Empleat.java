package Exercici1.Model;

public class Empleat {
    private int codi;
    private String nom;
    private String ofici;
    private int salari;
    private Departament departament;
    
    
    public Empleat() {
    }


    public Empleat(int codi, String nom, String ofici, int salari) {
        this.codi = codi;
        this.nom = nom;
        this.ofici = ofici;
        this.salari = salari;
        this.departament = new Departament();
    }


    public int getCodi() {
        return codi;
    }


    public String getNom() {
        return nom;
    }


    public String getOfici() {
        return ofici;
    }


    public int getSalari() {
        return salari;
    }


    public void setCodi(int codi) {
        this.codi = codi;
    }


    public void setNom(String nom) {
        this.nom = nom;
    }


    public void setOfici(String ofici) {
        this.ofici = ofici;
    }


    public void setSalari(int salari) {
        this.salari = salari;
    }


    public Departament getDepartament() {
        return departament;
    }


    public void setDepartament(Departament departament) {
        this.departament = departament;
    }


    @Override
    public String toString() {
        return "Empleat [codi=" + codi + ", nom=" + nom + ", ofici=" + ofici + ", salari=" + salari + ", departament="
                + departament + "]";
    };

    

    
}
