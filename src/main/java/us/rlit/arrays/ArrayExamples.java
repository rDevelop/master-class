package us.rlit.arrays;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class ArrayExamples {


    public static void main(String[] args) {
        int a[] = {50, 60, 2 , 4};
        int b[] = new int[10];
        b[5] = 50;

        Integer[] c = new Integer[10];
        for(int i = 0; i < b.length; i ++) {
            b[i] = i;
            c[i] = i;
            c[i] = 1;
        }


        LinkedHashSet<Integer> aList =
                (new LinkedHashSet<Integer>(Arrays.asList(c)));
        System.out.println("hasSet: " + aList);

        System.out.println("c: " + Arrays.asList(c));
    }
}
