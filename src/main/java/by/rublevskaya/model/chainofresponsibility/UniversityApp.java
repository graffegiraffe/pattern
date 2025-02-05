package by.rublevskaya.model.chainofresponsibility;

import by.rublevskaya.model.chainofresponsibility.request.Accountant;
import by.rublevskaya.model.chainofresponsibility.request.GroupCurator;
import by.rublevskaya.model.chainofresponsibility.request.Teacher;
import by.rublevskaya.model.chainofresponsibility.university.RequestHandler;

import java.util.Scanner;

public class UniversityApp {
    public static void main(String[] args) {
        RequestHandler curator = new GroupCurator();
        RequestHandler teacher = new Teacher();
        RequestHandler accountant = new Accountant();

        curator.setNextHandler(teacher);
        teacher.setNextHandler(accountant);

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        System.out.println("Welcome to the University's Request Processing System");

        while (!exit) {
            System.out.println("\nChoose an action:");
            System.out.println("1 - Send request");
            System.out.println("2 - Exit");
            System.out.print("Your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.println("\nEnter the content of the request:");
                    System.out.println("(For example: 'schedule', 'retake', 'debt')");
                    System.out.print("Request: ");
                    String request = scanner.nextLine();
                    curator.handleRequest(request);
                }
                case 2 -> {
                    System.out.println("System shutdown.Goodbye");
                    exit = true;
                }
                default -> System.out.println("Incorrect input.Try again");
            }
        }
        scanner.close();
    }
}