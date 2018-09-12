package us.rlit.control.flow;

public class While {



    /*

    While checks condition at top of code block...
     Do while checks after (always runs once)
     */
    public static void main(String[] args) {
//        boolean it = true;
//        while(it) {
//            int random = (int)(Math.random()*100);
//            System.out.println(random);
//            if(random % 10 == 0 ) {
//                it = false;
//            }
//        }
//
//
//        int count =0;
//        while(count != 6) {
//            System.out.println("count is "  + count);
//            count ++;
//        }
//        System.out.println("--------------");
//        count = 0;
//        while(true) {
//            if(count == 6 ){
//                break;
//            }
//            System.out.println("count is "  + count);
//            count ++;
//        }

        int number = 4;
        int finishNumber = 20;
        int count = 0;
        while(number <= finishNumber) {
            number ++;
            if(! isEvenNumber(number)) {
                continue;
            }
            if(count == 5){
                break;
            }
            System.out.println("Even number " + number);
            count ++;
        }

    }

    public static boolean isEvenNumber(int number) {
        return (number % 2) == 0;
    }
}
