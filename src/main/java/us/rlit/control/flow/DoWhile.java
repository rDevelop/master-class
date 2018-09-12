package us.rlit.control.flow;

public class DoWhile {
    public static void main(String[] args) {

        /*

        ALWAYS RUNS ONCE

        */



        boolean keepGoing = true;
        int count = 1;
        do {
            System.out.println("Going " + count);
            if( count >= 5) {
                keepGoing = false;
            }
            count++;
        } while (keepGoing);


    }
}
