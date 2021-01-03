package Array;

import java.util.Arrays;

public class SplitMethod {
    public static void main(String[] args) {

        String str = "Split method is coming from the String Class";

        String[] word = str.split(" ");
        System.out.println(Arrays.toString(word));
        System.out.println(word.length);


        String cities = "Chicago.Denver.Austin.Houston.Portland";
        String [] city = cities.split("\\.");
        System.out.println(Arrays.toString(city));

        String name = "\"Techtorial\"\t\nAcademy";
        System.out.println(name);  //  output: "Techtorial"
                                   //           Academy


    }
}
