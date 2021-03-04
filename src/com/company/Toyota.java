package com.company;

public class Toyota extends Car {

    public String color;

    public Toyota(){
    }

    public Toyota(String color) {
        this.color = color;
    }

    @Override
    public void applyPrint (String printWord){
        System.out.println("TRD " + color);
    }

}
