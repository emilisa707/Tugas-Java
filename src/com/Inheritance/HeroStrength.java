package com.Inheritance;

public class HeroStrength extends Hero{
    private int defencePower;

    HeroStrength(String inputName, int inputDefencePower){

        super(inputName);

        name = inputName;
        defencePower = inputDefencePower;

        
    }

    //fungsi GETTER
    public int getDefencePower()
    {
        return this.defencePower;
    }

    public void setDefencePower(int setValue)
    {
        this.defencePower = setValue;
    }

    void Display(){
        System.out.println("\nHero Strength");
        System.out.println("Hero Name: " + this.name);
        System.out.println("defence Power : " + this.defencePower);

    }
}