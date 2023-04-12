import java.util.Arrays;

public class ArrayValueCalculator {

    public static String[][] array(int sizeA, int sizeB) {
        String[][] array = new String[sizeA][sizeB];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = "" + i;
            }
        }
        return array;
    }

    public static int doCalc(String[][] array) {
        int sum = 0;
        if (array.length != 4 || array[0].length != 4) {
            throw new NegativeArraySizeException("Array size invalid, only 4х4");
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new NumberFormatException("Invalid data in cell (" + i + ", " + j + "): " + array[i][j]);
                }
            }
        }
        return sum;
    }
}