package com.Inheritance;

public class HeroLeaderBoard extends Hero{

    int Score;

    HeroLeaderBoard(String inputName, int inputScore){
        super(inputName);

        name = inputName;
        Score = inputScore;
    }
    void Display(){
        System.out.println("\nHero Strength");
        System.out.println("Hero Name: " + this.name);
        System.out.println("defence Power : " + this.Score);
    }
    
}