/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.finalexam2501973994;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import robot.DrinkRobot;
import robot.FoodRobot;

/**
 *
 * @author fikriyuwi
 */
public class FinalExam2501973994 {
    // object Hotdog Robot
    static FoodRobot hotdogRobot = new FoodRobot("Hotdog");
    // object French Fries Robot
    static FoodRobot frenchFriesRobot = new FoodRobot("French Fries");
    
    // array list of object Hamburger Robot
    // there will be chicken hamburger robot and beef
    static ArrayList<FoodRobot> hamburgerRobot = new ArrayList<>();
    
    // array list of object Fried CHicken Robot
    // there will be breast chicken and thigh chicken
    static ArrayList<FoodRobot> friedChickenRobot = new ArrayList<>();
    
    // array list of object Drink Robot
    // there will be iced tea and hot coffee
    static ArrayList<DrinkRobot> drinkRobot = new ArrayList<>();
    
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        // initialize steps on Hotdog Robot
        hotdogRobot.addStep("baking hotdog bread and sausage");
        hotdogRobot.addStep("putting sausage in it");
        hotdogRobot.addStep("adding sauce on it");
        hotdogRobot.addStep("adding mayonnaise on it");
        
        // add Chicken Hamburger Robot on Hamburger Robot Array List
        hamburgerRobot.add(new FoodRobot("Chicken Hamburger"));
        // initialize steps on Chicken Hamburger Robot
        hamburgerRobot.get(0).addStep("Baking hamburger bread and chicken patties");
        hamburgerRobot.get(0).addStep("putting lettuce in it");
        hamburgerRobot.get(0).addStep("putting meat in it");
        hamburgerRobot.get(0).addStep("putting cheese in it");
        hamburgerRobot.get(0).addStep("putting tomato in it");
        hamburgerRobot.get(0).addStep("putting pickles in it");
        hamburgerRobot.get(0).addStep("putting lettuce in it");
        
        // add Beed Hamburger Robot on Hamburger Robot Array List
        hamburgerRobot.add(new FoodRobot("Beef Hamburger"));
        // initialize steps on Beef Hamburger Robot
        hamburgerRobot.get(1).addStep("Baking hamburger bread and beef patties");
        hamburgerRobot.get(1).addStep("putting lettuce in it");
        hamburgerRobot.get(1).addStep("putting meat in it");
        hamburgerRobot.get(1).addStep("putting cheese in it");
        hamburgerRobot.get(1).addStep("putting tomato in it");
        hamburgerRobot.get(1).addStep("putting pickles in it");
        hamburgerRobot.get(1).addStep("putting lettuce in it");
        
        // initialize steps on French Fries Robot
        frenchFriesRobot.addStep("Frying some of potato");
        frenchFriesRobot.addStep("adding some of seasoning on it");
        
        // add Breast Fried Chicken Robot on Fried Chicken Robot Array List
        friedChickenRobot.add(new FoodRobot("Breast Fried Chicken"));
        // initialize steps on Breast Fried Chicken Robot
        friedChickenRobot.get(0).addStep("breading a chicken breast");
        friedChickenRobot.get(0).addStep("frying it");
        friedChickenRobot.get(0).addStep("adding some of seasoning it");
        
        // add Thigh Fried Chicken Robot on Fried Chicken Robot Array List
        friedChickenRobot.add(new FoodRobot("Thigh Fried Chicken"));
        // initialize steps on Thigh Fried Chicken Robot
        friedChickenRobot.get(1).addStep("breading a chicken thigh");
        friedChickenRobot.get(1).addStep("frying it");
        friedChickenRobot.get(1).addStep("adding some of seasoning it");
        
        // add Iced Tea Robot on Drink Robot Array List
        drinkRobot.add(new DrinkRobot("Iced Tea",true));
        // initialize steps on Iced Tea Robot
        drinkRobot.get(0).addStep("adding a tea bag in glass");
        drinkRobot.get(0).addStep("adding some of water in it");
        drinkRobot.get(0).addStep("adding some of sugar in it");
        drinkRobot.get(0).addStep("mixing");
        drinkRobot.get(0).addStep("remove a tea bag in it");
        
        // add Hot Coffee Robot on Drink Robot Array List
        drinkRobot.add(new DrinkRobot("Hot Coffee",false));
        // initialize steps on Hot Coffee Robot
        drinkRobot.get(1).addStep("adding 2 spoon of instant coffee in glass");
        drinkRobot.get(1).addStep("adding some of water in it");
        drinkRobot.get(1).addStep("adding some of sugar in it");
        drinkRobot.get(1).addStep("mixing");
        
        // print restaurant program header
        System.out.println("CHEONG-SUN Restaurant");
        System.out.println("Created by : Mochammad Latifulfikri");
        System.out.println("Student ID : 2501973994\n");
        
        // for save running information
        boolean run = true;
        
        // loop until user stop the program
        do {
            // get picked menu user
            int menu = pickMenu();
            switch(menu) {
                case 1:
                    // get picked method user
                    int method = pickMethod();
                    switch(method) {
                        // USING MULTI-THREADING
                        case 1:
                            // get picked package user
                            int pickMultithread = pickPackage();
                            switch(pickMultithread) {
                                // process package one using multi-threading
                                case 1:
                                    processPackageOneWithMultiThread();
                                    break;
                                // process package two using multi-threading
                                case 2:
                                    processPackageTwoWithMultiThread();
                                    break;
                                // process package three using multi-threading
                                case 3:
                                    processPackageThreeWithMultiThread();
                                    break;
                                default:
                                    System.out.println("Please input using valid package number!\n");
                                    break;
                            }
                            break;
                        // WITHOUT MULTI-THREADING
                        case 2:
                            // get picked package user
                            int pick = pickPackage();
                            switch(pick) {
                                // process package one without multi-threading
                                case 1:
                                    processPackageOne();
                                    break;
                                // process package two without multi-threading
                                case 2:
                                    processPackageTwo();
                                    break;
                                // process package three without multi-threading
                                case 3:
                                    processPackageThree();
                                    break;
                                default:
                                    System.out.println("Please input using valid package number!\n");
                                    break;
                            }
                            break;
                        default:
                            System.out.println("Please input using valid method number!\n");
                            break;
                    }
                    break;
                case 2:
                    run = false;
                    break;
                default:
                    System.out.println("Please input using valid menu number!\n");
                    break;
            }
        } while (run); // untill run = false
    }
    
    // for process package one using multi-threading
    public static void processPackageOneWithMultiThread()
    {
        int drinkPicked = pickDrink();
        
        long startTime = System.currentTimeMillis();
        try (ExecutorService executor = Executors.newFixedThreadPool(3)) {
            executor.submit(hotdogRobot);
            executor.submit(frenchFriesRobot);
            executor.submit(drinkRobot.get(drinkPicked));
        }
        endProcess(startTime);
    }
    
    // for process package two using multi-threading
    public static void processPackageTwoWithMultiThread()
    {
        int drinkPicked = pickDrink();
        int hamburgerPicked = pickHamburger();
        
        long startTime = System.currentTimeMillis();
        try (ExecutorService executor = Executors.newFixedThreadPool(3)) {
            executor.submit(hamburgerRobot.get(hamburgerPicked));
            executor.submit(frenchFriesRobot);
            executor.submit(drinkRobot.get(drinkPicked));
        }
        endProcess(startTime);
    }
    
    // for process package three using multi-threading
    public static void processPackageThreeWithMultiThread()
    {
        int drinkPicked = pickDrink();
        int friedChickenPicked = pickFriedChicken();
        
        long startTime = System.currentTimeMillis();
        try (ExecutorService executor = Executors.newFixedThreadPool(3)) {
            executor.submit(friedChickenRobot.get(friedChickenPicked));
            executor.submit(frenchFriesRobot);
            executor.submit(drinkRobot.get(drinkPicked));
        }
        endProcess(startTime);
    }
    
    // for process package one without multi-threading
    public static void processPackageOne()
    {
        int drinkPicked = pickDrink();
        
        long startTime = System.currentTimeMillis();
        hotdogRobot.run();
        frenchFriesRobot.run();
        drinkRobot.get(drinkPicked).run();
        endProcess(startTime);
    }
    
    // for process package two without multi-threading
    public static void processPackageTwo()
    {
        int drinkPicked = pickDrink();
        int hamburgerPicked = pickHamburger();
        
        long startTime = System.currentTimeMillis();
        hamburgerRobot.get(hamburgerPicked).run();
        frenchFriesRobot.run();
        drinkRobot.get(drinkPicked).run();
        endProcess(startTime);
    }
    
    // for process package three without multi-threading
    public static void processPackageThree()
    {
        int drinkPicked = pickDrink();
        int friedChickenPicked = pickFriedChicken();
        
        long startTime = System.currentTimeMillis();
        friedChickenRobot.get(friedChickenPicked).run();
        frenchFriesRobot.run();
        drinkRobot.get(drinkPicked).run();
        endProcess(startTime);
    }
    
    // for get picked menu from user
    public static int pickMenu()
    {
        int picked;
        System.out.println("\nMENU :");
        System.out.println("1. Order");
        System.out.println("2. Exit");

        System.out.print("Pick menu : ");
        picked = scanner.nextInt();
        
        while(picked < 1 || picked > 2) {
            System.out.println("\n[Please input using valid menu number!]");
            System.out.println("\nMENU :");
            System.out.println("1. Order");
            System.out.println("2. Exit");

            System.out.print("Pick menu : ");
            picked = scanner.nextInt();
        }
        
        return picked;
    }
    
    // for get picked package from user
    public static int pickPackage()
    {
        int picked;
        System.out.println("\n   Package :");
        System.out.println("   1. Hotdog + French Fries + Drink");
        System.out.println("   2. Hamburger + French Fries + Drink");
        System.out.println("   3. Friend Chicken + French Fries + Drink");

        System.out.print("   Pick package : ");
        picked = scanner.nextInt();
        
        while(picked < 1 || picked > 3) {
            System.out.println("\n   [Please input using valid package number!]");
            System.out.println("\n   Package :");
            System.out.println("   1. Hotdog + French Fries + Drink");
            System.out.println("   2. Hamburger + French Fries + Drink");
            System.out.println("   3. Friend Chicken + French Fries + Drink");

            System.out.print("   Pick package : ");
            picked = scanner.nextInt();
        }
        
        return picked;
    }
    
    // for get picked method from user
    public static int pickMethod()
    {
        int picked;
        System.out.println("\n   Method :");
        System.out.println("   1. Using multithread");
        System.out.println("   2. Without using multithread");

        System.out.print("   Pick method : ");
        picked = scanner.nextInt();
        
        while(picked < 1 || picked > 2) {
            System.out.println("\n   [Please input using valid method number!]");
            System.out.println("\n   Method :");
            System.out.println("   1. Using multithread");
            System.out.println("   2. Without using multithread");

            System.out.print("   Pick method : ");
            picked = scanner.nextInt();
        }
        
        return picked;
    }
    
    // for get picked hamburger option from user
    public static int pickHamburger()
    {
        int picked;
        System.out.println("\n   Hamburger :");
        for (int i = 0; i < hamburgerRobot.size(); i++) {
            System.out.println("   "+ (i+1) +". " + hamburgerRobot.get(i).getName());
        }

        System.out.print("   Pick hamburger : ");
        picked = scanner.nextInt();
        
        while(picked < 1 || picked > hamburgerRobot.size()) {
            System.out.println("\n   [Please input using valid hamburger number!]");
            System.out.println("\n   Hamburger :");
            for (int i = 0; i < hamburgerRobot.size(); i++) {
                System.out.println("   "+ (i+1) +". " + hamburgerRobot.get(i).getName());
            }

            System.out.print("   Pick hamburger : ");
            picked = scanner.nextInt();
        }
        
        return (picked-1);
    }
    
    // for get picked fried chicken option from user
    public static int pickFriedChicken()
    {
        int picked;
        System.out.println("\n   Fried Chicken :");
        for (int i = 0; i < friedChickenRobot.size(); i++) {
            System.out.println("   "+ (i+1) +". " + friedChickenRobot.get(i).getName());
        }

        System.out.print("   Pick fried chicken : ");
        picked = scanner.nextInt();
        
        while(picked < 1 || picked > friedChickenRobot.size()) {
            System.out.println("\n   [Please input using valid fried chicken number!]");
            System.out.println("\n   Fried Chicken :");
            for (int i = 0; i < friedChickenRobot.size(); i++) {
                System.out.println("   "+ (i+1) +". " + friedChickenRobot.get(i).getName());
            }

            System.out.print("   Pick fried chicken : ");
            picked = scanner.nextInt();
        }
        
        return (picked-1);
    }
    
    // for get picked drink option from user
    public static int pickDrink()
    {
        int picked;
        System.out.println("\n   Drink :");
        for (int i = 0; i < drinkRobot.size(); i++) {
            System.out.println("   "+ (i+1) +". " + drinkRobot.get(i).getName());
        }

        System.out.print("   Pick drink : ");
        picked = scanner.nextInt();
        
        while(picked < 1 || picked > drinkRobot.size()) {
            System.out.println("\n   [Please input using valid drink number!]");
            System.out.println("\n   Drink :");
            for (int i = 0; i < drinkRobot.size(); i++) {
                System.out.println("   "+ (i+1) +". " + drinkRobot.get(i).getName());
            }

            System.out.print("   Pick drink : ");
            picked = scanner.nextInt();
        }
        
        return (picked-1);
    }
    
    // for display count of time of running program in second
    public static void endProcess(long startTime)
    {
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("\nYour order has been served in "+ elapsedTime/1000 +" seconds.\nEnjoy the meal\n");
    }

}