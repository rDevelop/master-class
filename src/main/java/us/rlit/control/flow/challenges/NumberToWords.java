package us.rlit.control.flow.challenges;

public class NumberToWords {
    public static void main(String[] args) {
        int[] testNumbers = {123, 1010, 1000, -12};
        for (int i = 0; i < testNumbers.length; i++) {
            int n = testNumbers[i];
            System.out.print("numberToWord : " + n + " ");
            numberToWords(n);
            System.out.println("");
        }
        System.out.println(getDigitCount(0));
        System.out.println(getDigitCount(123));
        System.out.println(getDigitCount(-12));
        System.out.println(getDigitCount(5200));
        System.out.println(getDigitCount(1234567890));

        System.out.println();
        System.out.println(reverse(-121));
        System.out.println(reverse(2121));
        System.out.println(reverse(4321));
        System.out.println(reverse(100));




    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            String word = "";
            int r = reverse(number);
            int rDigits = getDigitCount(r);
            int nDigits = getDigitCount(number);
            int diff = nDigits - rDigits;
            for (int i = 0; i < rDigits; i++) {
                int digit = r % 10;
                r /= 10;
                String digitString = "";
                switch (digit) {
                    case 0:
                        digitString = "Zero ";
                        break;
                    case 1:
                        digitString = "One ";
                        break;
                    case 2:
                        digitString = "Two ";
                        break;
                    case 3:
                        digitString = "Three ";
                        break;
                    case 4:
                        digitString = "Four ";
                        break;
                    case 5:
                        digitString = "Five ";
                        break;
                    case 6:
                        digitString = "Six ";
                        break;
                    case 7:
                        digitString = "Seven ";
                        break;
                    case 8:
                        digitString = "Eight ";
                        break;
                    case 9:
                        digitString = "Nine ";
                        break;
                }
                word += digitString;
            }
            while (diff > 0) {
                word += "Zero ";
                diff--;
            }
            System.out.print(word);
        }
    }

    public static int getDigitCount(int number) {
        int originalNumber = number;
        if (number < 0) {
            return -1;
        }
        int count = 0;
        do  {
            number /= 10;
            count ++;
        } while (number > 0);
        return count;
    }

    public static int reverse(int number) {
        int reverse = 0;
        int lastDigit;
        int num = number;
        while (num != 0) {
            lastDigit = num % 10;
            reverse = reverse * 10 + lastDigit;
            num /= 10;
        }
        return reverse;
    }
}
