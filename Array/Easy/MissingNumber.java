package Array.Easy;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        int n = nums.length;
        int total = (n * (n + 1)) / 2;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        System.out.println(total - sum);
    }
}
