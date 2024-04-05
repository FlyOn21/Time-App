package views;

import config.Config;
import models.ConverterModel;
import utils.Validate;

import java.util.Scanner;

public class SecondsToTimeStringView {

    public void secondsToTimeStringV (Scanner scanner) {
        Validate validator = new Validate();
        ConverterModel converter = new ConverterModel();
        String rangeMassage = "Seconds value must be in range 0 - " + Config.SECONDS_IN_ONE_DAY;
        String exceptionMassage = "Input data must be seconds string. Example 123456";
        while (true) {
            try {
                System.out.print("Input seconds: ");
                String inputSeconds = scanner.nextLine();
                long inputSecondsToLong = Long.parseLong(inputSeconds);
                boolean isValid = validator.secondStringIsAllow(inputSecondsToLong);
                if (!isValid) {
                    System.out.println(rangeMassage);
                    continue;
                }
                System.out.println(converter.secondsToTimeDurationString(inputSecondsToLong));
                return;
            }
            catch (NumberFormatException e) {
                System.out.println(exceptionMassage);
                System.out.println(rangeMassage);
            }
        }
    }
}
