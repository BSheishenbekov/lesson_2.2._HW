package com.company;

public class Nissan extends Car{

    public double volume;

    public Nissan(){

    }

    public Nissan(double volume) {
        this.volume = volume;
    }

    @Override
    public void applyPrint (String printWord){
        System.out.println("NISMO " + volume);
    }

}
