package com.fju;

public class Calpis extends Drink{
    public Calpis(){
        int price = 25;
        String name = "Calpis";
    }

    @Override
    public String getName() {
        return "Calpis";
    }

    @Override
    public int getPrice() {
        return 25;
    }

}

