package Array;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        // when we create the array, we must give the size for the array
        int [] ages = new int[5];

        ages[0] = 18;
        ages[1] = 22;
        ages[2] = 45;
        ages[3] = 44;
        ages[4] = 54;

        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);
        System.out.println(ages[3]);
        System.out.println(ages[4]);

        System.out.println(ages.length);

        for (int i = 0; i < ages.length; i++){
            System.out.println(ages[i]);
        }

        System.out.println(Arrays.toString(ages));
        //String arra

    }
}