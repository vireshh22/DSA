package Array.Easy;

public class LeftRotateByK {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        int k=11;
        k = k % n;

        // way 1
        // int[] temp = new int[k];
        // for(int i=0;i<k;i++)
        //     temp[i]=arr[i];
        // //shifting
        // for(int i=k;i<n;i++){
        //     arr[i-k] = arr[i];
        // }
        // // putting temp array elements at last
        // for(int i=n-k;i<n;i++){
        //     arr[i] = temp[i-(arr.length-k)]; // just subtract base Array Index from i
        // }
        // for(int i:arr)
        //     System.out.print(i + " ");


        // way 2
        // reverse first k elements
        // revrse elements after k elements
        // revrse entire array
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        reverse(arr,0,n-1);
        for(int i: arr)
            System.out.print(i + " ");
    }

    static void reverse(int[] arr, int s, int e){
        while(s<e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
}
