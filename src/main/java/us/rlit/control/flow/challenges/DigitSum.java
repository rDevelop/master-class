package us.rlit.control.flow.challenges;

public class DigitSum {

    public static void main(String[] args) {

        System.out.println("sum of digits 9 : " + sumDigits(9));
        System.out.println("sum of digits 123 : " + sumDigits(123));
        System.out.println("sum of digits 125 : " + sumDigits(125));
        System.out.println("sum of digits 32123 : " + sumDigits(32123));
        System.out.println("sum of digits 12332 : " + sumDigits(12332));


    }

    public static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }
        int sum = 0;
        while (number > 0) {
            // extract least significant number
            // add to sum
            sum += number % 10;
            // drop of the least significant digit
            // number = number / 10;
            number /= 10;
        }

        return sum;
    }

}
