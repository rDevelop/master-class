package us.rlit.expressions.exercises;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces1(double val1, double val2) {
        boolean equalByThree = false;

        String strNum1 = "" + val1;
        String strDec1 = "";
        String strNum2 = "" + val2;
        String strDec2 = "";
        if( strNum1.contains(".")) {
            String[] splits = strNum1.split("\\.");
            strNum1 = splits[0];
            strDec1 = splits[1];
        }
        if( strNum2.contains(".")) {
            String[] splits = strNum2.split("\\.");
            strNum2 = splits[0];
            strDec2 = splits[1];
        }
        if( strDec1.length() >= 3) {
            strDec1 = strDec1.substring(0, 3);
        } else {
            strDec1 = strDec1.substring(0, strDec1.length());
        }
        if( strDec2.length() >= 3) {
            strDec2 = strDec2.substring(0, 3);
        } else {
            strDec2 = strDec2.substring(0, strDec2.length());
        }
        if(strNum1.equals(strNum2) &&
                strDec1.equals(strDec2)) {
            equalByThree = true;
        }
        return equalByThree;
    }

    public static boolean areEqualByThreeDecimalPlaces(double val1, double val2) {
        val1 = (int) (val1 * 1000);
        val2 = (int) (val2 * 1000);
        return (val1 == val2);
    }
}
