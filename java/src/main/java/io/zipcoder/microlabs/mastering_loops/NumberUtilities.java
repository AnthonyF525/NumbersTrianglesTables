package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
                           
    public static String getExponentiations(int start, int stop, int step, int exponent)  {
        String result = "";
        for (int i = start; i < stop; i = + step) {
            result = result + Math.pow(i, exponent);
            //Turn to int then to a String
            result = result + Math.round(Math.pow(i, exponent));
        
        }
        return result;
    }


    public static String getRange(int start, int stop, int step) {
        String result = "";
        for (int i = start; i < stop; i = + step) {
            result = result + i;
        
        }
        return result;
    }

    public static String getRange(int start, int stop) {
         String result = "";
        for (int i = start; i < stop; i++) {
            result = result + i;
        
        }
        return result; // getRange(start, stop, step;1));
    }

    public static String getRange(int stop) {
        String result = "";
        for (int i = 0; i < stop; i++) {
            result = result + i;
        }
        return result; // getRange(start:0, stop, step:1);
    }

    /*
     * natural break
     */

    public static boolean isNumberEven(int toTest) { return false; }
    public static boolean isNumberOdd(int toTest) { return false; }

    public static String getEvenNumbers(int start, int stop) {
        int firstEven = -1;
        
        if (start % 2 == 0) {
            firstEven = start;
        } else {
            firstEven = start + 1;  
        }

        String result = "";

        for (int i = firstEven; i < stop;) {
            if (i % 2 == 0) {
            result += i;
        }
        
    }
    return result;
    }

    public static String getOddNumbers(int start, int stop) {
        return null;
    }

    public static String getSquareNumbers(int start, int stop, int step) {
        return null;
    }

}
