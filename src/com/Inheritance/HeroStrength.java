package com.latihan;

public class HeroStrength extends Hero{
    double defencePower;

    void display(){
        System.out.println("\nHero Strength");
        System.out.println("Hero Name: " + this.name);
        System.out.println("defence Power : " + this.defencePower);
    }
}