package us.rlit.arrays;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayChallenge {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int a[] = getIntegers(5);
        //int[] sorted = ;
        for (int i : sort(a)) {
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i: sortIntegers(a)) {
            System.out.print(i + " ");
        }
    }

    public static int[] getIntegers(int size) {
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = s.nextInt();
        }
        return a;
    }

    public static int[] sort(int[] a) {
        List<Integer> list = Arrays.stream(a).boxed().collect(Collectors.toList());
        Collections.sort(list);
        int[] sorted = list.stream().mapToInt(Integer::intValue).toArray();
        int[] reverse = a;
        for (int i = 0, j = a.length - 1; i < a.length; i++, j--) {
            reverse[i] = sorted[j];
        }
        return reverse;
    }


    public static int[] sortIntegers(int[] a) {
        // from Udemy's way
        int[] sortedArray = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            sortedArray[i] = a[i];
        }

        // cool kids way to copy
        int[] sortedArray2 = Arrays.copyOf(a, a.length);

        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }


            }


        }
        return sortedArray;
    }


}
