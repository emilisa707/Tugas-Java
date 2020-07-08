package com.Inheritance;

public class HeroStatus extends Hero {

    String status;

    HeroStatus(String inputName, String inputStatus){
        super(inputName);

        name = inputName;
        status = inputStatus;
    }
    void Display(){
        System.out.println("\nHero Status");
        System.out.println("Hero Name: " + this.name);
        System.out.println("defence Power : " + this.status);
    }
}