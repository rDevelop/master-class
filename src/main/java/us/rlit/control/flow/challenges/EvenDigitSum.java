package us.rlit.control.flow.challenges;

public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(-252));
        System.out.println(getEvenDigitSum(1144));


    }

    public static int getEvenDigitSum(int number){
        if(number < 0) {
            return -1;
        }
        int sum = 0;
        int lastDigit;
        while(number != 0){
            lastDigit = number % 10;
            if(lastDigit %2 == 0) {
                sum += lastDigit;
            }
            number = number / 10;
        }
        return sum;
    }
}
