package us.rlit.primitive;

public class Operators {

    public static void main(String[] args) {


        int topScore = 10;
        int lowScore = 5;

        if( (topScore > 10) || (lowScore > 3)) {
            System.out.println("Have shit true");
        }

        String high = topScore > lowScore ?  "better be" : "dumb shit";
        System.out.println("high " + high);


    }
}
