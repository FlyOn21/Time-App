package views;

import config.Config;
import models.ConverterModel;
import utils.Validate;

import java.util.Scanner;

public class TimeStringToSecondsView {
    public void timeStringToSecondsV(Scanner scanner) {
        Validate validator = new Validate();
        ConverterModel converter = new ConverterModel();
        while (true) {
                System.out.print("Input time string in format " + Config.TRANSFORM_TIME_FORMAT_STRING_TO_SECOND + ": ");
                String inputSeconds = scanner.nextLine();
                boolean isValid = validator.timeStringIsAllow(inputSeconds);
                if (!isValid) {
                    System.out.println("Time string value must be in format " + Config.TRANSFORM_TIME_FORMAT_STRING_TO_SECOND);
                    System.out.println("Examples: (hour 0-23):(minutes 0-59):(seconds 0-59)");
                    continue;
                }
                System.out.println(converter.timeStringToSeconds(inputSeconds));
                return;
        }
    }
}
