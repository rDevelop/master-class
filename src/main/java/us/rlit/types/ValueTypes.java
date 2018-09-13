package us.rlit.types;

public class ValueTypes {
    public static void main(String[] args) {

        int thisHoldsAValue = 10;
        int anotherValue = thisHoldsAValue;

        // stored in unique memory spaces
        // treated individually

        System.out.println("value 1 " + thisHoldsAValue);
        System.out.println("value 2 " + anotherValue);

        anotherValue ++;

        System.out.println("value 1 " + thisHoldsAValue);
        System.out.println("value 2 " + anotherValue);

    }
}

