package Array.Medium;

public class Sort012 {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 2, 2, 2, 0, 0, 0, 1, 2 };
        int n = nums.length;
        // int start = 0, end = nums.length - 1;
        // int mid = 0;
        // while (mid <= end) {
        //     if (nums[mid] == 0) {
        //         int temp = nums[start];
        //         nums[start] = nums[mid];
        //         nums[mid] = temp;
        //         start++;
        //         mid++;
        //     } else if (nums[mid] == 2) {
        //         int temp = nums[end];
        //         nums[end] = nums[mid];
        //         nums[mid] = temp;
        //         end--;
        //     } else {
        //         mid++;
        //     }
        // }
        // for(int i:nums) System.out.println(i);

        int num0=0,num1=0,num2=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0) num0+=1;
            else if(nums[i]==1) num1+=1;
            else num2+=1;
        }

        for(int i=0;i<num0;i++) nums[i]=0;
        for(int i=num0;i<num0 + num1;i++) nums[i]=1;
        for(int i=num0 + num1;i<n;i++) nums[i]=2;

        for(int i:nums) System.out.println(i);
    }
}
