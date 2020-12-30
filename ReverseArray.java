package Array;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        //Reverse the given array and print the new array

        int [] arr = {1,2,3,4,5,6,7};
        for (int i = arr.length-1, k = 0; k < arr.length/2; i--, k++){

            int temp = arr[k];
            arr[k] = arr[i];
            arr[i] = temp;

        }

        System.out.println(Arrays.toString(arr));

        // [1, 2, 3, 4, 5, 6, 7] reverse back

        for (int i = 0; i < arr.length/2; i++){
            int temp = arr[i];
             arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }

        System.out.println(Arrays.toString(arr));







    }
}
