package us.rlit.expressions.exercises;

public class AreaCalculator {
    private static double INVALID_VALUE = -1;


    public static void main(String[] args) {
        System.out.println(area(-3));
        System.out.println(area(5));
        System.out.println(area(5,4));
        System.out.println(area(-1,4));


    }


    public static double area(double radius) {
        return radius < 0 ? -1 : Math.PI * Math.pow(radius, 2);
    }
    public static double area(double x, double y) {
        return (x < 0 || y < 0) ? -1 : x * y;
    }

}
