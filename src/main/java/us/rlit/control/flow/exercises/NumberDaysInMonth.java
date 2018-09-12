package us.rlit.control.flow.exercises;

public class NumberDaysInMonth {
    public static void main(String[] args) {
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(1,2020));
        System.out.println(getDaysInMonth(9, 2020));
    }

    public static boolean isLeapYear(int year) {
        if( year < 1 || year > 9999) {
            return false;
        } else if ( (year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        }
        return false;
    }

    public static int getDaysInMonth(int month, int year) {
        if( month < 1 || month > 12) {
            return -1;
        }
        if( year < 1 || year > 9999) {
            return -1;
        }
        int daysInMonth = -1;
        switch(month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                daysInMonth = 31;
                break;
            case 2:
                if(isLeapYear(year)) {
                    daysInMonth = 29;
                } else {
                    daysInMonth = 28;
                }
                break;
            default:
                daysInMonth = 30;
                break;
        }
        return daysInMonth;
    }
}
