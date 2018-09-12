package us.rlit.control.flow;

public class For {
    public static void main(String[] args) {
//        for( int i = 1; i < 10; i++) {
//            System.out.println(String.format("%.2f", calculateInterest(10000, i)));
//        }

        int count = 0;
        for(int i=10; i< 50 && count != 3; i++) {
            if(isPrime(i)){
                System.out.println(i);
                count++;
            }
        }
        count= 0;
        for(int i=10; i< 50; i++) {
            if(isPrime(i)){

            }
        }


    }

    public static double calculateInterest(double amount, double interest) {
        return (amount * (interest/100));
    }

    public static boolean isPrime(int n) {
        if( n == 1) {
            return false;
        }
        //for( int i=2; i <= n/2; i++) {
        for(int i=2; i <= (long) Math.sqrt(n); i++) {
            if( n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
