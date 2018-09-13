package us.rlit.arrays;


public class ReverseArrayChallenge {

    public static void main(String[] args) {

        int[] array = new int[]{10,20,30,40,50};
        System.out.println("array:");
        for(int i: array) {
            System.out.print(i + " ");
        }
        System.out.println();
        reverse(array);
        System.out.println("reversed:");
        for(int i: array) {
            System.out.print(i + " ");
        }


        System.out.println();
        System.out.println();
        System.out.println("Udemy solution");
        System.out.println("array:");
        array = new int[]{10,20,30,40,50};
        for(int i: array) {
            System.out.print(i + " ");
        }
        System.out.println();
        reverse2(array);
        System.out.println("reversed2:");
        for(int i: array) {
            System.out.print(i + " ");
        }



    }

    // Udemy
    public static void reverse2(int[] arr) {
        int maxIndex =arr.length -1;
        int halfLength = arr.length / 2;
        for(int i=0; i<halfLength; i++) {
            int tmp = arr[i];
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
