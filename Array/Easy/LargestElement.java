package Array.Easy;

class LargestElement{
    public static void main(String[] args) {
        int[] arr = {2,4,6,5,1};
        // way 1
        // sort the array and print (length - 1) index's element

        // way 2
        int largest = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest) largest = arr[i];
        }
        System.out.println(largest);
    }
}