package com.fju;
import java.util.Scanner;


public class Tester {
    public static void main(String[] args) {
        int ten,five,one,money;
        int option;

        CokeCola CokeCola = new CokeCola();
        Calpis Calpis = new Calpis();
        Blacktea Blacktea = new Blacktea();
        Greentea Greentea = new Greentea();
        Juice Juice = new Juice();
        MixedCongee MixedCongee = new MixedCongee();

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
                if ((money - Blacktea.getPrice()) < 0)
                    System.out.println("Money is not enough.");
                else
                {
                    System.out.println("Here is your " + Blacktea.getName());
                    System.out.println("Return " + (money - Blacktea.getPrice()) + " $");
                }

                break;
            case 2 :
                if ((money - Calpis.getPrice()) < 0)
                    System.out.println("Money is not enough.");
                else{
                    System.out.println("Here is your " + Calpis.getName());
                    System.out.println("Return " + (money - Calpis.getPrice()) + " $");
                }

                break;
            case 3 :
                if ((money - CokeCola.getPrice()) < 0)
                    System.out.println("Money is not enough.");
                else
                {
                    System.out.println("Here is your " + CokeCola.getName());
                    System.out.println("Return " + (money - CokeCola.getPrice()) + " $");
                }

                break;
            case 4 :
                if ((money - Greentea.getPrice()) < 0)
                    System.out.println("Money is not enough.");
                else
                {
                    System.out.println("Here is your " + Greentea.getName());
                    System.out.println("Return " + (money - Greentea.getPrice()) + " $");
                }

                break;
            case 5 :
                if ((money - Juice.getPrice()) < 0)
                    System.out.println("Money is not enough.");
                else
                {
                    System.out.println("Here is your " + Juice.getName());
                    System.out.println("Return " + (money - Juice.getPrice()) + " $");
                }

                break;
            case 6 :
                if ((money - MixedCongee.getPrice()) < 0)
                    System.out.println("Money is not enough.");
                else
                {
                    System.out.println("Here is your " + MixedCongee.getName());
                    System.out.println("Return " + (money - MixedCongee.getPrice()) + " $");
                }

                break;
        }
    }
}
