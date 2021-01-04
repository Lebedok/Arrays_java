package Array;

import java.util.Arrays;

public class TwoMissingNumberArray {
    public static void main(String[] args) {

        int [] numbers = {2,3,6,5,7,9,1};
        // from given array print all missing numbers between 1 - 9
        Arrays.sort(numbers);
        // 1,2,3,4,5,6,7,8,9

        for (int i = 1; i < 9; i++){
            boolean missingNum = true;

            for (int k = 0; k < numbers.length; k++){
                if (i == numbers[k]){
                    missingNum = false;

                }
            }
            if (missingNum == true){
                System.out.println(i);
            }

        }


    }
}
