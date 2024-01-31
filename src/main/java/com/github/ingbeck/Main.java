package com.github.ingbeck;

public class Main {
    public static void main(String[] args) {
        Vehicle  scooter = new Vehicle("Peugeot", "Tweet 125", 2022);
        Car bmw = new Car("BMW", "X1", 2015, 3);

        System.out.println(scooter);
        System.out.println(bmw);
    }
}