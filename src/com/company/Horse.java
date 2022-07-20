package com.company;

public class Horse extends AbstractAnimal {

    public Horse(int weight, int age, String gender, String nickName) {
        super(weight, age, gender, nickName);
    }

    @Override
    public String toString() {
        return "Horse" + super.toString();
    }
}
