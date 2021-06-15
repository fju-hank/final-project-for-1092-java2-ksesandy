package com.fju;

public class CokeCola extends Drink{
    public CokeCola(){
        int price = 29;
        String name = "CokeCola";
    }

    @Override
    public static String getName() {
        return name;
    }

    @Override
    public static int getPrice() {
        return price;
    }
}
