package main;

import observer.Company;
import observer.GoldUser;
import observer.RegularUser;
import observer.THY;
import observer.User;

public class Main {
    public static void main(String[] args) {

        System.out.println("Case 1: ");
        System.out.println("-------------------------------");
        Company thy = new THY();
        User regularUser = new RegularUser("John Doe");
        User goldUser = new GoldUser("Jane Doe");

        thy.addObserver(regularUser);
        thy.addObserver(goldUser);
        thy.notifyObservers();
        System.out.println("-------------------------------");
        System.out.println("Case 2: ");
    }
}