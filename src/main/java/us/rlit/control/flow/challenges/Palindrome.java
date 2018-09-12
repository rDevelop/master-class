package us.rlit.control.flow.challenges;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println("isPalindrome -1221 " + isPalindrome(-1221));
        System.out.println("isPalindrome 707 " + isPalindrome(707));
        System.out.println("isPalindrome 11212 " + isPalindrome(11212));
        System.out.println("isPalindrome 1 " + isPalindrome(1));
        System.out.println("isPalindrome 33 " + isPalindrome(33));
        System.out.println("isPalindrome 17 " + isPalindrome(17));



    }


    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int lastDigit;
        int num = number;
        while(num != 0) {
            lastDigit = num % 10;
            reverse = reverse * 10 + lastDigit;
            num /= 10;
        }
        if( number == reverse  ) {
            return true;
        }
        return false;
    }
}
