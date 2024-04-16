class Solution {
    public int singleNumber(int[] nums) {
        int ans=0;

        for(int num: nums)
        ans ^= num;

        return ans;

        // for(int i=0;i<nums.length;i++){
        // int num=nums[i];
        // int count=0;
        // for(int j=0;j<nums.length;j++){
        // if(nums[j]==num){
        // count++;
        // }
        // }
        // if(count == 1) return num;
        // }
        // return -1;



        // Map<Integer, Integer> m = new HashMap<>();

        // for (int i : nums) {
        //     m.put(i, m.getOrDefault(i, 0) + 1);
        // }
        // for(Integer key:m.keySet()){
        //     if(m.get(key) == 1) return key;
        // }
        // return -1;



        // Set<Integer> s = new HashSet<>();
        // for(int num:nums){
        //     if(s.contains(num)) s.remove(num);
        //     else s.add(num);
        // }
        // return s.iterator().next();
    }
}

public class NumberAppearsOnes {
    public static void main(String[] args) {
        int[] arr = {2,1,2};
        int result = new Solution().singleNumber(arr);
        System.out.println();
        System.out.println("Single Number:" + result);
    }
}
