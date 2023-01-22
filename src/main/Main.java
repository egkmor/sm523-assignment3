package main;

import command.CancelOrderCommand;
import command.Command;
import command.Invoker;
import command.Order;
import command.ProcessOrderCommand;
import observer.Company;
import observer.GoldUser;
import observer.RegularUser;
import observer.THY;
import observer.User;

public class Main {
    public static void main(String[] args) {

        System.out.println("Case 1 (Observer): ");
        System.out.println("-------------------------------");
        Company thy = new THY();
        User regularUser = new RegularUser("John Doe");
        User goldUser = new GoldUser("Jane Doe");

        thy.addObserver(regularUser);
        thy.addObserver(goldUser);
        thy.notifyObservers();
        System.out.println("-------------------------------");
        System.out.println("Case 2 (Command): ");

        Order order = new Order("T-shirt");

        Command processCommand = new ProcessOrderCommand(order);
        Command cancelCommand = new CancelOrderCommand(order);

        Invoker invoker = new Invoker();
        invoker.setCommand(processCommand);
        invoker.executeCommand();
        System.out.println("Client Message: Order processed.");

        invoker.setCommand(cancelCommand);
        invoker.executeCommand();
        System.out.println("Client Message: Order cancelled.");
        System.out.println("-------------------------------");

    }
}