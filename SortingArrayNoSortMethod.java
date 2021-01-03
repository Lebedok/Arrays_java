package Array;

import java.util.Arrays;

public class SortingArrayNoSortMethod {
    public static void main(String[] args) {

        int[] numbers = {5, 6, 14, 8, 45, 34};

        for (int i = 0; i < numbers.length; i++){
            for (int k = i + 1; k < numbers.length; k++){

                if (numbers[i] > numbers[k]){
                    int temp = numbers[i];  // 10
                    numbers[i] = numbers [k]; // 6
                    numbers[k] = temp;

                }

            }
        }

        System.out.println(Arrays.toString(numbers));




        }
    }

