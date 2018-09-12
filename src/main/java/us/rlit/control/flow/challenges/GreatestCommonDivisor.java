package us.rlit.control.flow.challenges;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(25, 5));


    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        for (int i = first; i > 0; i--) {
            if (first % i == 0) {
                for (int j = second; j > 0; j--) {
                    if (second % i == 0) {
                        return i;
                    }
                }
            }

        }

        return -1;
    }
}
