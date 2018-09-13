package us.rlit.types.challenges;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class MinimumElement {

    public static void main(String[] args) {
        findMin(readIntegers());
        int[] a = {1, 400, 20, 40, 10};
        find2Min(a);
    }

    private static Integer[] readIntegers() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Integer[] inputs = new Integer[n];
        while(n-->0) {
            inputs[n] = s.nextInt();

        }
        return inputs;
    }

    private static void findMin(Integer[] array){
        TreeSet<Integer> set = new TreeSet<>();
        set.addAll(Arrays.asList(array));
        System.out.println("Min: " + set.first());
    }


    /*
    Udemy's method
     */
    private static void find2Min(int[] array) {
        int min = Integer.MAX_VALUE;
        for(int i=0; i< array.length; i++) {
            if(array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Min2 " + min);
    }

}


