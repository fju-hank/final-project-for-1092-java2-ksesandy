package com.fju;
import java.util.Scanner;


public class Tester {
    public static void main(String[] args) {
        int ten,five,one,money;
        int option;
        System.out.println("-----------------------------------------");
        System.out.println("10,5,1");
        Scanner in = new Scanner(System.in);

        ten = in.nextInt();
        five = in.nextInt();
        one = in.nextInt();

        money  = ten*10 + five*5 + one;
        System.out.println("You tossed in " + money + " $");

        System.out.println("-----------------------------------------");

        System.out.println("Here are our Vending Machine options");
        System.out.println("1. Black Tea   $: 20");
        System.out.println("2. Calpis   $: 25");
        System.out.println("3. CokeCola   $: 29");
        System.out.println("4. Green Tea   $: 20");
        System.out.println("5. Juice   $: 25");
        System.out.println("6. Mixed Congee   $: 38");

        option = in.nextInt();

        switch (option){
            case 1 :
                System.out.println("Here is your" + CokeCola.getName());
                System.out.println("Return" + money - CokeCola.getPrice() + "$");
        }
    }
}
