package us.rlit.control.flow.challenges;

public class PerfectNumber {

    public static void main(String[] args) {
        System.out.println("isPerfect number 6 : " + isPerfectNumber(6) );
        System.out.println("isPerfect number 28 : " + isPerfectNumber(28) );
        System.out.println("isPerfect number 5 : " + isPerfectNumber(5) );
        System.out.println("isPerfect number -1 : " + isPerfectNumber(-1) );
        System.out.println("isPerfect number 496 : " + isPerfectNumber(496) );
        System.out.println("isPerfect number 8128 : " + isPerfectNumber(8128) );
        System.out.println("isPerfect number 0 : " + isPerfectNumber(0) );






    }

    public static boolean isPerfectNumber(int number) {
        if( number < 1) {
            return false;
        }
        int total = 0;
        for(int i = number -1; i > 0; i-- ) {
            if( number%i == 0 ) {
                total += i;
            }
        }
        return (total == number);
    }
}
