package Array;

public class FindUniqueNumber {
    public static void main(String[] args) {

        int [] nums = {4, 5,6,7,7,8,4,6,5};

        for (int i = 0; i < nums.length; i++){
            int count = 1;

            for (int j = i+1; j < nums.length; j++){
                if (nums[i] == nums[j]){
                    count++;
                    if (nums[i] == nums[i+1]){
                        i++;
                    }
                }
            }
            if (count == 1){
                System.out.println(nums[i]);
             break;
            }
        }
    }
}
