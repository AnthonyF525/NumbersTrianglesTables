package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String result = "";
        int i = 1;
        while (i <= numberOfStars) {
            result = result + "*";
            i++;
        }
        return result;
    }

    public static String getTriangle(int numberOfRows) {
        String result = "";
        int i = 1;
        while (i <= numberOfRows) {
            result = result + getRow(i) + "\n";
            i++;
        }
        return result;
    }

    
    public static String getSmallTriangle() {
        return getTriangle(5);
    }

    public static String getLargeTriangle() {
        return getTriangle(10);
    }
}
