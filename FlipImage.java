package Array;

import java.util.Arrays;

public class FlipImage {
    public static void main(String[] args) {

        int [][] image = {{1,1,0,0}, {0,1,0,1}, {1,1,1}, {0,0,1,1,}};
        System.out.println("last element from first array:" + image[0][image[0].length-1]);  // find last element from first array


        for (int i = 0; i <image.length ; i++){

            for (int j = 0; j < image[i].length/2; j++){
                int temp =  image[i][j];
                image[i][j] = image[i][image[i].length-j-1];
                image[i][image[i].length-j-1]= temp;

            }

            System.out.println(Arrays.toString(image[i]));

            // TASK#2: Invert every 0 to 1 and every 1 to 0


        }

    }
}
