package Array;

public class BiggerNumberArray {
    
    public static void main(String[] args) {

        int[] numbers = {6, 45, 367, 23, 97};
        // int biggest = integer.MIN_VALUE;
        int biggestNum = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > biggestNum) {
                biggestNum = numbers[i];

            }
        }
        System.out.println(biggestNum);
    }
}
