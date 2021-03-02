package MockInterview;

public class oddLengthBiggestNum {

    // given odd length numbers. compare first, middle, last number. Print biggest one.

    public static int maxTriple(int [] nums) {
        int large = 0;

        if(nums[0]>nums[((nums.length+1)/2)-1] -1&&nums[0]>nums[nums.length-1])
            large = nums[0];
        if (nums[((nums.length+1)/2)-1]>nums[0]&&nums[((nums.length+1)/2)-1]>nums[nums.length-1])
            large = nums[((nums.length+1)/2)-1];
        if (nums[nums.length-1]>nums[0]&&nums[nums.length-1]>nums[((nums.length+1)/2)-1])
            large = nums[nums.length-1];

        return large;

    }

    public static void main(String[] args) {

        int nums[] = {2,3,9,1,11};
        System.out.println(maxTriple(nums));

    }
}
