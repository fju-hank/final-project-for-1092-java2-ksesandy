package com.fju;

public class CokeCola extends Drink{
    public CokeCola(){
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
