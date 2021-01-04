package Array;

import java.util.Arrays;
import java.util.Scanner;

public class StoreNamesArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of names:");
        int number = input.nextInt();



        String [] names = new String[number];

        int index = 0;
        for (int i = 0; i < number; i++){
            System.out.println("Enter name:");
            String name = input.next();
            if (name.length()>5){
                names[index++] = name;
            }

        }

        System.out.println(Arrays.toString(names));




    }
}
