package us.rlit.arrays;


import java.util.Arrays;
import java.util.Scanner;

public class ResizingArrays {

    private static Scanner s = new Scanner(System.in);
    private static int[] baseData = new int[10];


    public static void main(String[] args) {
        System.out.println("Enter 10 numbers:");
        readInput();
        printArray();
        System.out.println("Enter 15 numbers:");
        resizeArray(15);
        readInput();
        printArray();
    }

    private static void readInput() {
        for(int i=0; i< baseData.length; i++) {
            baseData[i] = s.nextInt();
        }
    }

    private static void printArray() {
        System.out.println(Arrays.toString(baseData));
    }

    private static void resizeArray(int size) {
        int[] original = baseData;
        baseData = new int[size];
        for(int i=0; i<original.length; i++) {
            baseData[i] = original[i];
        }
    }
}
