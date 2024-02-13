package org.enums;
public enum EnumTipusAnimal {
    GAT,GOS,PERIQUITO;

    public static void mostrar(){
        for (int i = 0; i < EnumTipusAnimal.values().length; i++) {
            System.out.println((i+1) + " " +EnumTipusAnimal.values()[i].toString());
        }
    }
}