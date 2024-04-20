package String.Medium;

public class MaxProductSubArr {
    public static void main(String[] args) {
        int[] arr = {-2,0,-1};
        int n = arr.length;
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int product=1;
            for(int j=i;j<n;j++){
                product *= arr[j];
                largest = Math.max(largest,product);
            }
        }
        System.out.println(largest);
    }
}
