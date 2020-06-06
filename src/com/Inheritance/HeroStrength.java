package com.Inheritance;

public class HeroStrength extends Hero{
    double defencePower;

    HeroStrength(String inputName, double inputDefencePower){

        super(inputName);

        name = inputName;
        defencePower = inputDefencePower;

        
    }

    void Display(){
        System.out.println("\nHero Strength");
        System.out.println("Hero Name: " + this.name);
        System.out.println("defence Power : " + this.defencePower);

    }
}