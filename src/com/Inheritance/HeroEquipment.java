package com.Inheritance;

public class HeroEquipment extends Hero{
    
    String equipment;
    double defence;

    HeroEquipment(String inputName, String inputEquipment, int inputDefencePower)
    {
        super(inputName);

        name = inputName;
        equipment = inputEquipment;
        defence = inputDefencePower;
    }

    void Display(){
        System.out.println("\nHero Strength");
        System.out.println("Nero Name : " + this.name);
        System.out.println("Equipment: " + this.equipment);
        System.out.println("Defence : " + this.defence);
    }
}