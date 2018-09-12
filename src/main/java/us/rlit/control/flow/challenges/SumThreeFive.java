package us.rlit.control.flow.challenges;

public class SumThreeFive {


    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for (int i = 1; i <= 1000 && count <5; i++) {
            boolean three = i%3==0;
            boolean five = i%5==0;
            if(three && five){
                System.out.println("found " + i);
                count ++;
                sum += i;
            }
        }
        System.out.println("sum is " + sum);
        System.out.println();
        System.out.println();

    }
}
