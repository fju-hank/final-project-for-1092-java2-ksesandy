package com.fju;
import java.util.Scanner;


public class Tester {
    public static void main(String[] args) {
        int ten,five,one,money;
        int option;

        Cokecola cokecola = new Cokecola();
        Calpis calpis = new Calpis();
        Blacktea blacktea = new Blacktea();
        Greentea greentea = new Greentea();
        Juice juice = new Juice();
        Mixedcongee mixedcongee = new Mixedcongee();

        System.out.println("-----------------------------------------");
        System.out.println("Please enter 10$ , 5$ , 1$ coin numbers.");

        Scanner in = new Scanner(System.in);
        ten = in.nextInt();
        five = in.nextInt();
        one = in.nextInt();

        money  = ten*10 + five*5 + one;
        System.out.println("You tossed in " + money + " $.");

        System.out.println("-----------------------------------------");

        System.out.println("Here are our Vending Machine options.");
        System.out.println("1. Black Tea   $: 20");
        System.out.println("2. Calpis   $: 25");
        System.out.println("3. CokeCola   $: 29");
        System.out.println("4. Green Tea   $: 20");
        System.out.println("5. Juice   $: 25");
        System.out.println("6. Mixed Congee   $: 38");

        option = in.nextInt();

        switch (option){
            case 1 :
                if ((money - blacktea.getPrice()) < 0)
                    System.out.println("Money is not enough.");
                else
                {
                    System.out.println("Here is your " + blacktea.getName());
                    System.out.println("Return " + (money - blacktea.getPrice()) + " $");
                }

                break;
            case 2 :
                if ((money - calpis.getPrice()) < 0)
                    System.out.println("Money is not enough.");
                else{
                    System.out.println("Here is your " + calpis.getName());
                    System.out.println("Return " + (money - calpis.getPrice()) + " $");
                }

                break;
            case 3 :
                if ((money - cokecola.getPrice()) < 0)
                    System.out.println("Money is not enough.");
                else
                {
                    System.out.println("Here is your " + cokecola.getName());
                    System.out.println("Return " + (money - cokecola.getPrice()) + " $");
                }

                break;
            case 4 :
                if ((money - greentea.getPrice()) < 0)
                    System.out.println("Money is not enough.");
                else
                {
                    System.out.println("Here is your " + greentea.getName());
                    System.out.println("Return " + (money - greentea.getPrice()) + " $");
                }

                break;
            case 5 :
                if ((money - juice.getPrice()) < 0)
                    System.out.println("Money is not enough.");
                else
                {
                    System.out.println("Here is your " + juice.getName());
                    System.out.println("Return " + (money - juice.getPrice()) + " $");
                }

                break;
            case 6 :
                if ((money - mixedcongee.getPrice()) < 0)
                    System.out.println("Money is not enough.");
                else
                {
                    System.out.println("Here is your " + mixedcongee.getName());
                    System.out.println("Return " + (money - mixedcongee.getPrice()) + " $");
                }

                break;
        }
    }
}
