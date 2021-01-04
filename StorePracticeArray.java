package Array;

public class StorePracticeArray {
    public static void main(String[] args) {

        String products[] []= new String [3][3];
        products[0][0]="Apple";
        products[0][1]="Microsoft";
        products[0][2]="Google";
        products[1][0]="Apple";
        products[1][1]="Samsung";
        products[1][2]="Huawei";
        products[2][0]="Boss";
        products[2][1]="LG";
        products[2][2]="Beats";

        double prices [][]= {{1250.0,850.9, 590.99},{1000.99,899, 650},{359.0,290.00,499.0}};

        for (int i = 0; i < products.length;i++){
            String result = "";
            for (int j = 0; j < products[i].length; j++){

                result += products[i][j] + " (" + prices[i][j] +") ";
            }

            switch (i){
                case 0:
                    result = "Computer --> " + result;
                    break;
                case 1:
                    result = "phone --> " + result;
                    break;
                case 2:
                    result = "Speaker --> " + result;
                    break;

            }


            System.out.println(result);
        }




    }
}
