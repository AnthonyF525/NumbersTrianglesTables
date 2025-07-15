package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {
                           
    public static String getExponentiations(int start, int stop, int step, int exponent)  {
        String result = "";
        for (int i = start; i < stop; i += step) {
            int outcome = (int)Math.pow(i, exponent);
            result = result + outcome;

        }
        return result;
    }


    public static String getRange(int start, int stop, int step) {
        String result = "";
        for (int i = start; i < stop; i  += step) {
            result = result + i;
            System.out.println(result);
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

    public static boolean isNumberEven(int toTest) { return toTest % 2 == 0; }
    public static boolean isNumberOdd(int toTest) { return toTest % 2 != 0; }

    public static String getEvenNumbers(int start, int stop) {

        
        String result = "";

        for (int i = start; i < stop; i++) {
            if (i % 2 == 0) {
            result += i;
        }
        
    }
    return result;
    }

    public static String getOddNumbers(int start, int stop) {
        String result = "";

        for (int i = start; i < stop; i++) {
            if (i % 2 != 0) {
                result += i;
            }

        }
        return result;
    }

    public static String getSquareNumbers(int start, int stop, int step) {
        String result = "";
        for (int i = start; i < stop; i += step) {
            result = result + (i * i);

        
    }
    return result;
    }

}
