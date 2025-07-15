package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getMultiplicationTable(int tableSize) {
        String result = "";
        for (int i = 1; i <= tableSize; i++) { // Loop for the row, i = row
            for (int j = 1; j <= tableSize; j++) { // Loop for column, j = column
                result += String.format("%3d |", i * j); // %d means print number. 3 notes the amount of space
            }
            result += "\n"; //new line after each row
        }
    return result;
    }

    public static String getSmallMultiplicationTable() {
        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);
    }
}
