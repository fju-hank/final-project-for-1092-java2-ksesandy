package com.fju;

public class Juice extends Drink{
    public Juice(){
        int price = 25;
        String name = "Juice";
    }

    @Override
    public String getName() {
        return "Juice";
    }

    @Override
    public int getPrice() {
        return 25;
    }
}
