package us.rlit.control.flow;

public class Switches {
    public static void main(String[] args) {


        int switchValue = 1;
        switch(switchValue) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3: case 4: case 5:
                System.out.println( "3, 4, or 5");
                break;
            default:
                System.out.println("Was not 1 through 5");
                break;
        }


        char c = 'A';
        switch(c) {
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println(c + " was found");
                break;
            default:
                System.out.println("ABCDE not found");
        }

        String month = "January";
        switch(month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "february":
                System.out.println("Feb");
                break;
            default:
                System.out.println("Not sure");
                break;
        }
    }

}
