package com.fju;

public class Greentea extends Drink{
    public Greentea(){
        int price = 20;
        String name = "Green Tea";
    }

    @Override
    public String getName() {
        return "Green Tea";
    }

    @Override
    public int getPrice() {
        return 20;
    }
}
