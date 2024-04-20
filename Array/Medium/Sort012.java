package Array.Medium;

public class Sort012 {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 2, 2, 2, 0, 0, 0, 1, 2 };
        int n = nums.length;
        int start = 0, end = nums.length - 1;
        int mid = 0;
        while (mid <= end) {
            if (nums[mid] == 0) {
                int temp = nums[start];
                nums[start] = nums[mid];
                nums[mid] = temp;
                start++;
                mid++;
            } else if (nums[mid] == 2) {
                int temp = nums[end];
                nums[end] = nums[mid];
                nums[mid] = temp;
                end--;
            } else {
                mid++;
            }
        }
        for(int i:nums) System.out.println(i);
    }
}
