package org.cotxe;

import org.cotxe.model.Combustible;
import org.cotxe.model.Cotxe;
import org.cotxe.model.Fre;
import org.cotxe.model.Pedal;

public class App {
    public static void main(String[] args) {
        Cotxe cotxe = new Cotxe();
        cotxe.getMatricula();
        cotxe.getId();
        cotxe.getSeients();
        cotxe.getCombustible();
        cotxe.getFinestra();
        cotxe.getVolant();
        cotxe.getPedals();
        cotxe.getRodes();

        Pedal p = cotxe.getPedals();
        Fre f = (Fre) p;
        f.trepitxar();
        System.out.println(cotxe);
    }
}
