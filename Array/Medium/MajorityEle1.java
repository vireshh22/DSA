// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

/*
Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
 
 */

public class MajorityEle1 {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        int n = nums.length;

        for(int i=0;i<n;i++){
            int cnt=0;
            for(int j=0;j<n;j++){
                if(nums[j]==nums[i]) cnt+=1;
            }
            if(cnt > (n/2)){
                System.out.println();
                System.out.println(nums[i]);
                break;
            }
        }
    }
}