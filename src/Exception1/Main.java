import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
            int result = ArrayValueCalculator.doCalc(ArrayValueCalculator.array(4, 4));
            System.out.println("result " + result);
        } catch (NegativeArraySizeException e) {
            System.out.println("Array size invalid: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid data: " + e.getMessage());
        }
    }
}
