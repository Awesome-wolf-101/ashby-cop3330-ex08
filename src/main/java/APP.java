/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Joshua Ashby
 */

import java.util.Calendar;
import java.util.Scanner;

public class APP {


    public static void main(String[] args) {
        System.out.println("How many people?");
        Scanner sc = new Scanner(System.in);
        String NumPeople = sc.nextLine();
        System.out.println("How many pizzas do you have?");
        String Pizzas = sc.nextLine();
        System.out.println("How many slices per pizza?");
        String SlicesPerPizza = sc.nextLine();

        int NumPeopleInt = Integer.parseInt(NumPeople);
        int PizzasInt = Integer.parseInt(Pizzas);
        int SlicesPerPizzaInt = Integer.parseInt(SlicesPerPizza);
        int TotalSlices = PizzasInt * SlicesPerPizzaInt;
        System.out.println(NumPeopleInt + " people with "+ PizzasInt + " pizzas (" + TotalSlices + " slices)");


        int PizzaPerHuman = TotalSlices / NumPeopleInt;
        int LeftoverPizza = TotalSlices % NumPeopleInt;


        System.out.println("Each person gets " + PizzaPerHuman + " pieces of pizza.");
        System.out.println("There are " + LeftoverPizza + " leftover pieces.");



    }
}
