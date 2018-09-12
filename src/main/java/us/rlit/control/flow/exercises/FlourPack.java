package us.rlit.control.flow.exercises;

public class FlourPack {
    public static void main(String[] args) {

        System.out.println(canPack(1,0,4));
//        System.out.println(canPack(1,0,5));
        System.out.println(canPack(0,5,6));
       System.out.println(canPack(2,2,12));
//        System.out.println(canPack(-3,2,12));
//        System.out.println(canPack(0,10,12));
//        System.out.println(canPack(1,10,12));
        System.out.println(canPack(2,7,18));




    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if( bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        int bigBags = bigCount;
        if (bigCount * 5 > goal){
            bigBags = goal / 5;
        }
        int totalBags = bigBags * 5 + smallCount;
        return totalBags >= goal;
    }
}
