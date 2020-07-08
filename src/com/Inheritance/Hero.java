package com.Inheritance;

public class Hero {
    String name;

    Hero(String inputName){
        name = inputName;
    }

    Hero()
    {
        name = "anda belum memasukan nama";
    }

    
    void Display(){
        System.out.println("hero name : " + this.name);
    }
}