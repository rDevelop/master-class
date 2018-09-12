package us.rlit.control.flow.challenges;

public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(2));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));



    }

    public static int getLargestPrime(int number) {
        if( number < 0) {
            return -1;
        }
        int largestPrime = 0;
        for (int i = 2; i<=number; i++) {

                if(number%i == 0) {
                  largestPrime = i;
                  number/=i;
                  i--;
                }


        }
        return largestPrime == 0 ? -1 : largestPrime;
    }
}
