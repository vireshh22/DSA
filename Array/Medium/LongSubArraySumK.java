class LongSubArraySumK{
    public static void main(String[] args) {
        int[] arr = {3,1,1,3};
        int d = 3;
        int n = arr.length;
        int len = 0;


        // // brute force solution
        // for(int i=0;i<n;i++){
        //     int sum=0;
        //     for(int j=i;j<n;j++){
        //         sum += arr[j];
        //         // for(int k=i;k<=j;k++)
        //         //     sum += arr[k];
        //         if(sum == d){
        //             len = Math.max(len,j-i+1);
        //         }
        //     }
        // }
        // System.out.println();
        // System.out.println(len);
        
    }
}