package models;

import utils.TimeConverter;


public class ConverterModel {
    public String secondsToTimeDurationString (long seconds) {
        TimeConverter converter = new TimeConverter();
        return converter.secondsToTimeString(seconds);
    }

    public String timeStringToSeconds (String timeString) {
        TimeConverter converter = new TimeConverter();
        return Long.toString(converter.timeStringToSeconds(timeString));
    }

}

