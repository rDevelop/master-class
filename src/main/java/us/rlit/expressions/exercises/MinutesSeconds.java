package us.rlit.expressions.exercises;

public class MinutesSeconds {

    /*
    1m = 60s
    1h = 60m / 3600s
     */

    private static final String INVALID_VALUE = "invalid value";
    public static void main(String[] args) {

        System.out.println(getDurationString(61,0));
        System.out.println(getDurationString(-9));


    }

    private static String getDurationString(int minutes, int seconds) {
        if((minutes < 0) || (seconds < 0 || seconds > 59)) {
            return INVALID_VALUE;
        }
        int hours = (minutes / 60);
        int remainingMinutes = minutes % 60;
        String strHours = hours < 10 ? "0" + hours : "" +hours;
        String strMinutes = remainingMinutes < 10 ? "0" + remainingMinutes : "" + remainingMinutes;
        String strSeconds = seconds < 10 ? "0" + seconds : "" + seconds;
        return strHours + "h " + strMinutes + "m " + strSeconds+ "s";
    }

    private static String getDurationString(int seconds) {
        if(seconds < 0) {
            return INVALID_VALUE;
        }
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        return getDurationString(minutes, remainingSeconds);
    }

}
