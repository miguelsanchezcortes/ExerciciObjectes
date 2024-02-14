package org.cotxe.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cotxe {
    private String matricula;

    private int id;

    private int seients;

    private Combustible combustible;

    private List<Finestra> finestra = new ArrayList<Finestra> ();

    private Volant volant;

    private Pedal[] pedals;

    private Roda[] rodes;

    

    public Cotxe() {
    }

    public Cotxe(String matricula, int id, int seients, Combustible combustible, List<Finestra> finestra, Volant volant,
            Pedal[] pedals, Roda[] rodes) {
        this.matricula = matricula;
        this.id = id;
        this.seients = seients;
        this.combustible = combustible;
        this.finestra = finestra;
        this.volant = volant;
        this.pedals = pedals;
        this.rodes = rodes;
    }

    

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSeients() {
        return seients;
    }

    public void setSeients(int seients) {
        this.seients = seients;
    }

    public Combustible getCombustible() {
        return combustible;
    }

    public void setCombustible(Combustible combustible) {
        this.combustible = combustible;
    }

    public List<Finestra> getFinestra() {
        return finestra;
    }

    public void setFinestra(List<Finestra> finestra) {
        this.finestra = finestra;
    }

    public Volant getVolant() {
        return volant;
    }

    public void setVolant(Volant volant) {
        this.volant = volant;
    }

    public Pedal[] getPedal() {
        return pedals;
    }

    public void setPedal(Pedal[] pedals) {
        this.pedals = pedals;
    }

    public Roda[] getRodes() {
        return rodes;
    }

    public void setRoda(Roda[] rodes) {
        this.rodes = rodes;
    }

    public void calcularITV() {
    }

    public void canviarOli() {
    }

    @Override
    public String toString() {
        return "Cotxe [matricula=" + matricula + ", id=" + id + ", seients=" + seients + ", combustible=" + combustible
                + ", finestra=" + finestra + ", volant=" + volant + ", pedal=" + pedals + ", rodes="
                + Arrays.toString(rodes) + "]";
    }

    

}
