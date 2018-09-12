package us.rlit.expressions.exercises;

public class BarkingDog {

    public static boolean bark(boolean barking, int hourOfDay) {
        boolean wakeUp = false;
        if( hourOfDay < 0 || hourOfDay > 23) {
            wakeUp = false;
        } else if( hourOfDay > 22 || hourOfDay < 8 && barking) {
            wakeUp = true;
        } else {
            wakeUp = false;
        }
        return wakeUp;
    }
}
