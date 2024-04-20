package String.Medium;

public class MaxProductSubArr {
    public static void main(String[] args) {
        // int[] arr = {-2,0,-1};
        // int n = arr.length;
        // int largest = Integer.MIN_VALUE;
        // for(int i=0;i<n;i++){
        //     int product=1;
        //     for(int j=i;j<n;j++){
        //         product *= arr[j];
        //         largest = Math.max(largest,product);
        //     }
        // }
        // System.out.println(largest);

        int[] nums = {2,4,-1,3};
        int n = nums.length;

        int prefix=1, suffix=1;
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(prefix==0) prefix=1;
            if(suffix==0) suffix=1;
            prefix = prefix * nums[i];
            suffix = suffix * nums[n - i -1];
            ans = Math.max(ans, Math.max(prefix,suffix));
        }
        System.out.println(ans);
    }
}
