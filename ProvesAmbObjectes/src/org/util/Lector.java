package org.util;

import java.util.Scanner;

public class Lector {
    private static Scanner lector = new Scanner(System.in);
    
    public static int llegirEnterPerTeclat() {

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

    public static double llegirDoublePerTeclat() {

        double enterLlegit = 0;
        boolean llegit = false;
        while (!llegit) {
            llegit = lector.hasNextDouble();
            if (llegit) {
                enterLlegit = lector.nextDouble();
            } else {
                System.out.println("Això no és un double");
                lector.next();
            }
        }
        lector.nextLine();
        return enterLlegit;
    }

    public static String llegirStringPerTeclat() {

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

    public static char llegirLletraPerTeclat() {

        char lletra = ' ';
        String paraula = "";
        boolean llegit = false;
        while (!llegit) {
            System.out.println("Escriu una lletra");
            llegit = lector.hasNextLine();
            if (llegit) {
                paraula = lector.nextLine();
                if (paraula.length() > 1) {
                    System.out.println("Agafo només la primera lletra");
                }
                lletra = paraula.charAt(0);
            } else {
                System.out.println("Això no és una lletra");
                lector.next();
            }
        }
        return lletra;
    }
}
