package Array;

public class MultiDimensionalArray {
    public static void main(String[] args) {

       double [][] prices = new double[3][4];
      // [ [3.7, 2.9, 5.4, 4.8], [0,0,0,0][0,0,0,0] ]

        prices[0][0] = 3.7;  // first array first element
        prices[0][1] = 2.9;  // first array second element
        prices[0][2] = 5.4;  // first array third element
        prices[0][3] = 4.8;  // first array forth element
        prices[2][1] = 20;   // third array second element
        prices[1][3] = 11;   // second array forth element
        prices[2][3] = 18.9; //


        for (int i = 0; i < prices.length; i++){
            for (int j = 0; j < prices[i].length; j++){
                System.out.println((prices[i][j]));
            }
        }





    }
}
