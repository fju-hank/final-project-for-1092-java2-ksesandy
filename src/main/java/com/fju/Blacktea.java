package com.fju;

public class Blacktea extends Drink{

    public Blacktea(){
        int price = 20;
        String name = "Black Tea";
    }

    @Override
    public String getName() {
        return "Black Tea";
    }

    @Override
    public int getPrice() {
        return 20;
    }
}
