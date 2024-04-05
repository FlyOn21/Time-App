package controllers;

import views.SecondsToTimeStringView;
import views.TimeStringToSecondsView;

import java.util.Scanner;

public class ConverterController {

    public void converterControllerProcessing() {
        String title = """
                ############################
                Realize home work 16 Maven
                ############################
                """;
        System.out.println(title);
        boolean running = true;
        Scanner scanner = new Scanner(System.in);
        while (running) {
            String menu = """ 
                    --------------
                    Choice action:
                    --------------
                    Choice 1 => convert seconds to time string
                    Choice 2 => convert time string to seconds
                    Choice 3 => stop and exit
                    """;
            System.out.println(menu);
            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    SecondsToTimeStringView secondsToTimeStringView = new SecondsToTimeStringView();
                    secondsToTimeStringView.secondsToTimeStringV(scanner);
                    break;
                case "2":
                    TimeStringToSecondsView timeStringToSecondsView = new TimeStringToSecondsView();
                    timeStringToSecondsView.timeStringToSecondsV(scanner);
                    break;
                case "3":
                    running = false;
                    System.out.println("Exit...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
        scanner.close();
    }
}
