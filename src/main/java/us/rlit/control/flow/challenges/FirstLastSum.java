package us.rlit.control.flow.challenges;

public class FirstLastSum {
    public static void main(String[] args) {
        System.out.println("sum "+ sumFirstAndLastDigit(252));
        System.out.println("sum "+ sumFirstAndLastDigit(257));
        System.out.println("sum "+ sumFirstAndLastDigit(-10));

        System.out.println("sum "+ sumFirstAndLastDigit(0));

        System.out.println("sum "+ sumFirstAndLastDigit(5));


    }

    public static int sumFirstAndLastDigit(int number) {
        if(number < 0) {
            return -1;
        }
        int lastDigit = number %10;
        int sum = lastDigit;
        while(number != 0){
            lastDigit = number % 10;
            number = number / 10;
        }
        sum += lastDigit;
        return sum;
    }
}
