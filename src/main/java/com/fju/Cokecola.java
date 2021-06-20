package com.fju;

public class Cokecola extends Drink{
    public Cokecola(){
        int price = 29;
        String name = "CokeCola";
    }

    @Override
    public  String getName() {
        return "CokeCola";
    }

    @Override
    public  int getPrice() {
        return 29;
    }
}
