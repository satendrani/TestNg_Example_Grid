package examples_java;

import java.lang.reflect.Array;

public class FindMissingArrayNumber {

    static int[] expectedArray = {2, 3, 4, 5, 6};
    static int[] actualArray = {2, 3, 4, 4, 6};

    public static void main(String arg[]) {


        for (int i = 0; i <= actualArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                System.out.println("missing number: " + expectedArray[i]);
                break;
            }

        }
    }
}
