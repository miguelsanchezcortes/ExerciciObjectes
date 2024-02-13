package Exercici1.Utils;

import java.util.Scanner;

public class Utils {
    
    public static String llegirStringPerTeclat() {
        Scanner lector = new Scanner(System.in);
        String paraula = "";
        boolean llegit = false;
        while (!llegit) {
            llegit = lector.hasNextLine();
            if (llegit) {
                paraula = lector.nextLine();
            } else {
                System.out.println("Això no és una cadena de text");
                lector.next();
            }
        }
        return paraula;
    }

    /**
     * Llegeix un enter per teclat i el retorna
     * @return retorna l'enter
     */
    public static int llegirEnterPerTeclat() {
        Scanner lector = new Scanner(System.in);
        int enterLlegit = 0;
        boolean llegit = false;
        while (!llegit) {
            llegit = lector.hasNextInt();
            if (llegit) {
                enterLlegit = lector.nextInt();
            } else {
                System.out.println("Això no és un enter");
                lector.next();
            }
        }
        lector.nextLine();
        return enterLlegit;
    }
}
