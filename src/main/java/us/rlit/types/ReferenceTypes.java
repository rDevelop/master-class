package us.rlit.types;

import java.util.Arrays;

public class ReferenceTypes {

    public static void main(String[] args) {

        // reference to an array in memory
        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println("array " + Arrays.toString(myIntArray));
        System.out.println("another " + Arrays.toString(anotherArray));

        // memory changes - two references to it.
        anotherArray[0] = 1;

        System.out.println();
        System.out.println("After change");
        System.out.println("array " + Arrays.toString(myIntArray));
        System.out.println("another " + Arrays.toString(anotherArray));

        // comment and uncomment to see actions.
        // deference (equals gives it away)
        anotherArray = new int[]{4,5,6,7,9};

        modifyArray(myIntArray);
        System.out.println();
        System.out.println("After modify");
        System.out.println("array " + Arrays.toString(myIntArray));
        System.out.println("another " + Arrays.toString(anotherArray));
    }

    private static void modifyArray(int[] array) {

        array[0] = 2;

        // deference that array.
        array = new int[] {1,2,3,4,5};
                // new int is a new address
    }

}
