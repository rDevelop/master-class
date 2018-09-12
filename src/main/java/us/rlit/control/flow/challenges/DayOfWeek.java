package us.rlit.control.flow.challenges;

public class DayOfWeek {
    public static void main(String[] args) {
        printDayOfTheWeek(0);
    }

    public static void printDayOfTheWeek(int day) {
        switch(day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }

        if(day == 1) {
            System.out.println("Monday");
        } else if( day == 0){
            System.out.println("Sunday");
        }
    }
}
