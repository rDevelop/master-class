package us.rlit.control.flow.challenges;

public class SumOdd {

    public static void main(String[] args) {
        System.out.println(isOdd(14));
        System.out.println(isOdd(21));
        System.out.println(sumOdd(1,100));
        System.out.println(sumOdd(100,100));
        System.out.println(sumOdd(10,5));
        System.out.println(sumOdd(-4,6));

    }

    public static boolean isOdd(int number) {
        if (number < 1) {
            return false;
        }
        if(number%2 != 0){
            return true;
        }
        return false;
    }

    public static int sumOdd(int start, int end) {
        if(start > end || start < 0 || end < 0) {
            return -1;
        }
        int sum = 0;
        for(int i=start; i<=end; i++){
            if(isOdd(i)){
                sum += i;
            }
        }
        return sum;
    }

}
