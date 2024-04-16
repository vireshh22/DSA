package Array.Easy;

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCon = 0;
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1){
                count+=1;
                maxCon = Math.max(maxCon,count);
            }
            else{
                count=0;
            }
        }
        return maxCon;
    }
}

public class maxConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1};
        int result = new Solution().findMaxConsecutiveOnes(arr);
        System.out.println(result);
    }
}
