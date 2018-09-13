package us.rlit.arrays;


import java.util.Arrays;

public class ReverseArrayChallenge {

    public static void main(String[] args) {

        int[] array = new int[]{10,20,30,40,50};
        System.out.println("array:");
        System.out.println(Arrays.toString(array));
        reverse(array);
        System.out.println("reversed:");
        System.out.println(Arrays.toString(array));

        System.out.println();
        System.out.println();

        System.out.println("Udemy solution");
        System.out.println("array:");
        array = new int[]{10,20,30,40,50};
        System.out.println(Arrays.toString(array));
        reverse2(array);
        System.out.println("reversed2:");
        System.out.println(Arrays.toString(array));

    }

    // Udemy
    public static void reverse2(int[] arr) {
        int maxIndex =arr.length -1;
        int halfLength = arr.length / 2;
        for(int i=0; i<halfLength; i++) {
            int tmp = arr[i];
            arr[i] = arr[maxIndex -i];
            arr[maxIndex -1 ] = tmp;
        }
    }

    public static void reverse(int[] arr) {
        int[] tmp = arr.clone();
        for(int i=0,j=arr.length-1; i < arr.length; i++,j--) {
            arr[j] = tmp[i];
            arr[i] = tmp[j];
        }
    }
}
