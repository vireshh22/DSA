package Array.Easy;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {4,2,1,7,7,5};
        int n = arr.length;

        // way 1 (sort tha array and do following) (brute force solution)

        // Arrays.sort(arr);
        // int largest = arr[n-1];
        // int secondLargest=0;
        // for(int i = n-2; i>=0;i++){
        //     if(arr[i] != largest) {
        //         secondLargest=arr[i];
        //         break;
        //     }
        // }
        // System.out.println(secondLargest);



        // way 2 (Better Solution)

        // int largest = arr[n-1];
        // for(int i=0; i<n;i++){
        //     if(arr[i]>largest) largest=arr[i];
        // }
        // int secondLargest=-1;
        // for(int i=0;i<n;i++){
        //     if(arr[i]>secondLargest && arr[i]!= largest){
        //         secondLargest=arr[i];
        //     }
        // }
        // System.out.println(secondLargest);


        // way 3 (2-pointer approach (Optimal Solution))
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;
        for(int i=1;i<n;i++){
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i]<largest && arr[i]>secondLargest){
                secondLargest = arr[i];
            }
        }   
        System.out.println(secondLargest);
    }
}
