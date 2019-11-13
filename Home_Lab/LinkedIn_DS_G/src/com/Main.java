package com;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> myFirstList = new ArrayList<>();

        myFirstList.add("apples");
        myFirstList.add("oranges");
        myFirstList.add("bananas");

        System.out.println("My firstList original: " + myFirstList);
        System.out.println();

        ArrayList<String> mySecondList = new ArrayList<>();

        mySecondList.add("pineapple");
        mySecondList.add("cherries");
        mySecondList.add("Strawberries");

        System.out.println("My second original: " +mySecondList);
        System.out.println();

        myFirstList.addAll(mySecondList);

        System.out.println("my mixed list: " + myFirstList);
        System.out.println();

        String searchedTerm = myFirstList.get(4);
        System.out.println("searched Term (red balls): " + searchedTerm);
        System.out.println();

        myFirstList.remove(4);
        System.out.println("My firstList after delete cherries: " + myFirstList);

    }
}
