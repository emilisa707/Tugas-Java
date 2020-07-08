package com.Inheritance;

public class Main { 
    public static void main (String[] args) throws Exception{
        Hero hero1 = new Hero("Saitama");
        HeroStrength hero2 = new HeroStrength("Gundala", 500);
        HeroEquipment hero3 = new HeroEquipment("Thor", "Palu", hero2.getDefencePower());
        hero2.setDefencePower(200);
        HeroStatus hero4 = new HeroStatus("Warior", "single");
        HeroLeaderBoard hero5 = new HeroLeaderBoard("Superman", 100);
        HeroEquipment hero6 = new HeroEquipment("spyderman", "jaring laba2", hero2.getDefencePower());
        Hero hero7 = new Hero();

        hero1.Display();
        hero2.Display();
        hero3.Display();
        hero4.Display();
        hero5.Display();
        hero6.Display();
        hero7.Display();

    }
}