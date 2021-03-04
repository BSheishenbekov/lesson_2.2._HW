package com.company;

public class Honda extends Car {

    public int year;

    public Honda(){
    }

    public Honda(int year) {
        this.year = year;
    }

    @Override
    public void applyPrint (String printWord) {
        System.out.println("MUGEN " + year);
    }
}
