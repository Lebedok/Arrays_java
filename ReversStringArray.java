package Array;

public class ReversStringArray {
    public static void main(String[] args) {

        String[] city = {"Chicago", "Los Angeles", "Miami", "New York", "Denver"};



        for (int i = 0; i < city.length; i++) {
            System.out.println(city[i]);

            String reverse = "";

            for (int k = city[i].length()-1;k >= 0; k--){
                reverse+=city[i].charAt(k);

            }
            System.out.println(reverse);

            }
        }
    }