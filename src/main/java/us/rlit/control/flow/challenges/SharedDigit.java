package us.rlit.control.flow.challenges;

public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(0, 102));
        System.out.println(hasSharedDigit(19, 91 ));
        System.out.println(hasSharedDigit(14, 41));
        System.out.println(hasSharedDigit(12345, 67890));
        System.out.println(hasSharedDigit(19, 99));




    }

    public static boolean hasSharedDigit(int first, int second) {
        if(first < 10 || first > 99 || second < 10 || second > 99) {
            return false;
        }
        while(first > 0) {
            while(second > 0) {
                if(first % 10 == second %10) {
                    return true;
                }
                second /= 10;
            }
            first /= 10;
        }
        return false;
    }
}
