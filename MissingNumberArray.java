package Array;

public class MissingNumberArray {
    public static void main(String[] args) {

        int [] numbers = {1,2,3,4,5,7,8,9};   // formula to find missing number:  N * (N +1)/2
        int sum = 0;
        for (int i = 0; i < numbers.length; i++){
            sum += numbers[i];

            if (numbers[i] != i+1){
                System.out.println(i + 1);
                break;

            }
        }



    }
}

