package us.rlit.linked.lists;

import java.util.ArrayList;

public class ExpensiveArrayList {

    public static void main(String[] args) {

        Customer c1 = new Customer("Rob", 77.77);
        Customer c2 = c1;
        c2.setBalance(22.22);
        System.out.println("Balance for c1 " + c1.getName() + " is " + c1.getBalance());
        // c2 points to c1 (memory allocation)


        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        printList(intList);

        // moving elements....
        //
        //
        // Very large data and array manipulation is expensive
        //
        //
        ///////
        intList.add(1,2);
        printList(intList);



    }
    private static void printList(ArrayList<Integer> list)
    {
        for(Integer i: list) {
            System.out.println(i-1  + " :" + list.get(i-1));
        }
        System.out.println();

    }
}
