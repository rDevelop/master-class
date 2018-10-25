package us.rlit.oop.boxing;

import java.util.ArrayList;

public class ArrayBoxing {


    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Rob");

        // can't convert int to Integer
        // ArrayList<int> intArrayList<int>():
        ArrayList<IntClass> integerArrayList = new ArrayList<>();
        integerArrayList.add(new IntClass(54));

        /*
        Must pass a class to object arrays.
        */

        /*
        Java allows conversion from primitive to object using class wrapper
         */
        Integer integer = new Integer(5______4);
        Double dd = new Double(44.4_______9);
        ArrayList<Integer> iArrayList = new ArrayList<>();
        for(int i=0; i <=10; i++) {

            /*
            Autoboxing
             */
            iArrayList.add(Integer.valueOf(i));
        }


        for(int i=0; i <=10; i++) {

            /*
            Unboxing
             */
            System.out.println(i + " --> "  + iArrayList.get(i).intValue());
        }




    }
}


class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

