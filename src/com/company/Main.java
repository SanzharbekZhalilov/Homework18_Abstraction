package com.company;

public class Main {
    public static void main(String[] args) {

        Cow cow1 = new Cow(250,4,"female", "Cow1");
        Cow cow2 = new Cow(270,5,"female", "Cow2");
        Cow cow3 = new Cow(400,7,"male", "Cow3");
        Cow cow4 = new Cow(310,5,"female", "Cow4");
        Cow cow5 = new Cow(350,6,"female", "Cow5");
        Cow cow6 = new Cow(150,2,"female", "Cow6");

        Cow[] cowsOfFarm1 = {cow1, cow2, cow3, cow4, cow5};
        Cow[] cowsOfFarm2 = {cow6};

        Sheep sheep1 = new Sheep(50, 3, "female", "Sheep1");
        Sheep sheep2 = new Sheep(45, 4, "female", "Sheep2");
        Sheep sheep3 = new Sheep(60, 4, "male", "Sheep3");
        Sheep sheep4 = new Sheep(40, 2, "female", "Sheep4");

        Sheep[] sheepOfFarm1 = {sheep1, sheep2, sheep3};
        Sheep[] sheepOfFarm2 = {sheep4};

        Horse horse1 = new Horse(500, 5, "female", "Horse1");
        Horse horse2 = new Horse(700, 7, "male", "Horse2");
        Horse horse3 = new Horse(550, 6, "female", "Horse3");

        Horse[] horsesOfFarm1 = {horse1, horse2};
        Horse[] horsesOfFarm2 = {horse3};

        Farm farm1 = new Farm("Sokuluk", "Asan Usenov", cowsOfFarm1, sheepOfFarm1, horsesOfFarm1);
        Farm farm2 = new Farm("Belovodsk", "Aman Esenov", cowsOfFarm2, sheepOfFarm2, horsesOfFarm2);
        Farm[] farms1 = {farm1};
        Farm[] farms2 = {farm2};

        System.out.print("FARM 1: ");
        for (Farm i : farms1) {
            System.out.println(i.toString());
        }

        System.out.print("FARM 2: ");
        for (Farm i : farms2) {
            System.out.println(i.toString());
        }
    }
}