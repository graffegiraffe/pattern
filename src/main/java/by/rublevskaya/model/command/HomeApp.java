package by.rublevskaya.model.command;

import by.rublevskaya.model.command.control.FanStartCommand;
import by.rublevskaya.model.command.control.FanStopCommand;
import by.rublevskaya.model.command.control.LightOffCommand;
import by.rublevskaya.model.command.control.LightOnCommand;
import by.rublevskaya.model.command.smarthome.Fan;
import by.rublevskaya.model.command.smarthome.Light;

import java.util.Scanner;

public class HomeApp {
    public static void main(String[] args) {
        Light light = new Light();
        Fan fan = new Fan();

        Command lightOnCommand = new LightOnCommand(light);
        Command lightOffCommand = new LightOffCommand(light);
        Command fanStartCommand = new FanStartCommand(fan);
        Command fanStopCommand = new FanStopCommand(fan);

        RemoteControl remote = new RemoteControl();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        System.out.println("Welcome to the \"Smart Home\" system!))))");

        while (!exit) {
            System.out.println("\nSelect device:");
            System.out.println("1 - Light control");
            System.out.println("2 - Fan control");
            System.out.println("3 - Exit");
            System.out.print("Enter action number: ");
            int deviceChoice = scanner.nextInt();

            switch (deviceChoice) {
                case 1 -> {
                    System.out.println("\nLight control:");
                    System.out.println("1 - Turn on light");
                    System.out.println("2 - Turn off light");
                    System.out.println("3 - Back");
                    System.out.print("Enter action number: ");
                    int lightChoice = scanner.nextInt();

                    switch (lightChoice) {
                        case 1 -> {
                            remote.setCommand(lightOnCommand);
                            remote.pressButton();
                        }
                        case 2 -> {
                            remote.setCommand(lightOffCommand);
                            remote.pressButton();
                        }
                        case 3 -> System.out.println("Returning to main menu");
                        default -> System.out.println("Incorrect input. Try again");
                    }
                }
                case 2 -> {
                    System.out.println("\nFan control:");
                    System.out.println("1 - Turn on fan");
                    System.out.println("2 - Turn off fan");
                    System.out.println("3 - Back");
                    System.out.print("Enter action number: ");
                    int fanChoice = scanner.nextInt();

                    switch (fanChoice) {
                        case 1 -> {
                            remote.setCommand(fanStartCommand);
                            remote.pressButton();
                        }
                        case 2 -> {
                            remote.setCommand(fanStopCommand);
                            remote.pressButton();
                        }
                        case 3 -> System.out.println("Returning to main menu.");
                        default -> System.out.println("Incorrect input. Try again");
                    }
                }
                case 3 -> {
                    System.out.println("Exiting the program");
                    exit = true;
                }
                default -> System.out.println("Incorrect input. Try again");
            }
        }
        scanner.close();
    }
}
