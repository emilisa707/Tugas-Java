package com.Inheritance;

public class Hero {
    String name;

    Hero(String inputName){
        name = inputName;

        
        
    }

    void Display(){
        System.out.println("hero name: " + this.name);
    }
}