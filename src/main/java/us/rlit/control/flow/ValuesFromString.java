package us.rlit.control.flow;

import us.rlit.ConsoleColors;

public class ValuesFromString {

    public static void main(String[] args) {
        String numberAsString = "2018";

        System.out.println("numberAsString " + numberAsString );
        int number = Integer.parseInt(numberAsString);
        System.out.println("number " + number);

        numberAsString += 1;
        number += 1;
        System.out.println("numberAsString " + numberAsString );
        System.out.println("number " + number);

        double d = Double.parseDouble(numberAsString );
        System.out.println("double " + d);
        d += 430.000;
        System.out.println(ConsoleColors.ANSI_RED+"double " + d);



    }
}
