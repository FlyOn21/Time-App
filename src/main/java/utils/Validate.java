package utils;

import config.Config;

import java.util.function.BiPredicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    // Validate time string
    private final BiPredicate<String, String> isValid = (checkData, regexPattern) ->
            checkData != null && !checkData.isEmpty() && isValidProcessing(checkData, regexPattern);

    public boolean timeStringIsAllow (String timeString) {
        final String TIME_FORMAT_REGEX = "^([01]?[0-9]|2[0-3]):([0-5]?[0-9]):([0-5]?[0-9])$";
        return isValid.test(timeString, TIME_FORMAT_REGEX);
    }

    private boolean isValidProcessing(String checkData, String regexPattern) {
        Pattern pattern = Pattern.compile(regexPattern);
        Matcher matcher = pattern.matcher(checkData);
        return matcher.matches();
    }

    // Validate seconds
    public boolean secondStringIsAllow (long seconds) {
        return seconds < Config.SECONDS_IN_ONE_DAY;
    }
}

