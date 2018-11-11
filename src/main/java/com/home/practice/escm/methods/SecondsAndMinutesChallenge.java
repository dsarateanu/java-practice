package com.home.practice.escm.methods;

public class SecondsAndMinutesChallenge {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static String getDurationString(long minutes, long seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return "Invalid value";
        }
        long hours = minutes / 60;
        long remainedMinutes = minutes % 60;

        return completeTimeString(hours, "h") + " "
                + completeTimeString(remainedMinutes, "m") + " "
                + completeTimeString(seconds, "s");
    }

    public static String getDurationString(long seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }
        long minutes = seconds / 60;
        long remainedSeconds = seconds % 60;

        return getDurationString(minutes, remainedSeconds);
    }

    public static String completeTimeString(long number, String type){
        String timeString = number + type;
        if(number < 10){
            timeString = "0" + timeString;
        }
        return timeString;
    }

    public static void main(String[] args) {
        System.out.println(getDurationString(500L));
    }


}
