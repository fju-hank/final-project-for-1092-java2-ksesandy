package com.fju;

public class MixedCongee extends Drink{
    public MixedCongee(){
        int price = 38;
        String name = "Mixed Congee";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
