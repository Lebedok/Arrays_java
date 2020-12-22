package Array;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {

        /*
        We have to sort the array before using the binary search method.
        Arrays.binarySearch(nameOfArray, number);
         */
        int [] numbers = {4, 5, 6787, 3, 6, 856};

        Arrays.sort(numbers);
        // {3, 4, 5, 6, 856, 6787}

        int result = Arrays.binarySearch(numbers, 0);
        System.out.println(result);
    }
}
