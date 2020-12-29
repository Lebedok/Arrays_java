package Array;

public class Numbers {
    public static void main(String[] args) {

        int [] numbers = {10,20,80,25,45,28, 9, 15};
        int count = 0;


        for (int i = 0; i< numbers.length; i++){
            if (numbers [i] > 20){
                count++;
                System.out.println(numbers[i]);

                }
            }
        System.out.println(count);

        }
    }
