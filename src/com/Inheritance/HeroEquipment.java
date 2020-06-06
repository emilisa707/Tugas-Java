package com.Inheritance;

public class HeroEquipment extends Hero{
    String equipment;

    HeroEquipment(String inputName, String inputEquipment){

        super(inputName);

        name = inputName;
        equipment = inputEquipment;

        
    }

    void Display(){
        System.out.println("\nHero Strength");
        System.out.println("Hero Name: " + this.name);
        System.out.println("Equipment : " + this.equipment);

    }
}