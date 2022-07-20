package com.company;

import java.util.Arrays;

public class Farm {

    String address;
    String ownerName;
    Cow[] cows;
    Sheep[] sheep;
    Horse[] horses;

    public Farm(String address, String ownerName, Cow[] cows, Sheep[] sheep, Horse[] horses) {
        this.address = address;
        this.ownerName = ownerName;
        this.cows = cows;
        this.sheep = sheep;
        this.horses = horses;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "address='" + address + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", cows=" + Arrays.toString(cows) +
                ", sheep=" + Arrays.toString(sheep) +
                ", horses=" + Arrays.toString(horses) +
                '}';
    }
}
