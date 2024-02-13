package model;


public class Capítol {
    private String index;

    private Seccio[] seccions = new Seccio[0];

    public Capítol() {
    }

    public Capítol(String index, Seccio[] seccions) {
        this.index = index;
        this.seccions = seccions;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public Seccio[] getSeccions() {
        return seccions;
    }

    public void setSeccions(Seccio[] seccions) {
        this.seccions = seccions;
    }

    

}
