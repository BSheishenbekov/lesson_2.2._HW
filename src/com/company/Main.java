package com.company;

public class Main {

    public static void main(String[] args) {

        /*Printable[] applyPrints = {new Honda(2003), new Toyota("Black"), new Nissan(4.3)};

        for (int i = 0; i < applyPrints.length; i++) {
            applyPrints[i].applyPrint("");
        }*/

        createObject("Honda").applyPrint("Mugen");
        createObject("Toyota").applyPrint("TRD");
        createObject("Nissan").applyPrint("NISMO");
    }

    public static Printable createObject (String car) {

        Printable printable = null;

        Toyota toyota = new Toyota();
        toyota.color = "Red";

        Nissan nissan = new Nissan();
        nissan.volume = 5.5;

        switch (car) {
            case "Honda": printable = new Honda(2003); break;
            case "Toyota" : printable = new Toyota("Red"); break;
            case "Nissan" : printable = new Nissan(5.5); break;
        }
        return printable;

    }
}
