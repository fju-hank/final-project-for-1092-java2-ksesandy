package com.fju;

public class Mixedcongee extends Drink{
    public Mixedcongee(){
        int price = 38;
        String name = "Mixed Congee";
    }

    @Override
    public String getName() {
        return "Mixed Congee";
    }

    @Override
    public int getPrice() {
        return 38;
    }
}
