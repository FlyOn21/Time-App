package utils;

import config.Config;
import net.time4j.ClockUnit;
import net.time4j.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class TimeConverter {
    public String secondsToTimeString (long seconds) {
        Duration<?> duration = Duration.of(seconds, ClockUnit.SECONDS).with(Duration.STD_CLOCK_PERIOD);
        return Duration.Formatter.ofPattern(Config.TRANSFORM_TIME_FORMAT_SECOND_TO_STRING).format(duration.toTemporalAmount());
    }

    public long timeStringToSeconds(String timeString) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(Config.TRANSFORM_TIME_FORMAT_STRING_TO_SECOND);
        LocalTime time = LocalTime.parse(timeString, formatter);
        return time.toSecondOfDay();
    }
}
