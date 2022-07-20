package com.company;

public abstract class AbstractAnimal {

    private int weight;
    private int age;
    private String gender;
    private String nickName;

    public AbstractAnimal(int weight, int age, String gender, String nickName) {
        this.weight = weight;
        this.age = age;
        this.gender = gender;
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "{" +
                "weight=" + weight +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
