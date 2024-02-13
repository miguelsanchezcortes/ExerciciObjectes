package Exercici2.Llibre.src;

import model.Capítol;
import model.Llibre;
import model.Part;
import model.Seccio;

public class App {
    public static void main(String[] args) {
        Llibre llibre[] = new Llibre[5];
        Llibre l1 = new Llibre();
        Llibre l2 = new Llibre();
        llibre[0] = l1;
        llibre[1] = l2;


        Part[] partsl1= l1.getParts();
        Seccio[] s1 = new Seccio[0];
        Capítol[] c1 = new Capítol[0];
        c1.setSeccions(s1);
        partsl1[0].setCapítols(c1);
        l1.setParts(partsl1);
    }
}
