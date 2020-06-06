package com.Inheritance;

public class Main {
    public static void main(String[] args )throws Exception {

        Hero hero1 = new Hero("Saitama");
        HeroStrength hero2 = new HeroStrength("Gundala", 100);
        HeroEquipment hero3 = new HeroEquipment("Thor", "Palu",hero2.getDefencePower());
        hero2.setDefencePower(50);
        HeroEquipment hero4 = new HeroEquipment("Warrior", "Pedang",hero2.getDefencePower());

        hero1.Display();
        hero2.Display();
        hero3.Display();
        hero4.Display();




    }
}