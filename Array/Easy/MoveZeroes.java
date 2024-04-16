package Array.Easy;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;

        // way 1
        int i=0;
        for(int ele : arr){
            if(ele != 0)
                arr[i++] = ele;
        }
        while(i<n){
            arr[i++] = 0;
        }
        for(int ele:arr)
            System.out.print(ele + " ");


        // way 2
        int j = -1;
        for(int k=0;k<n;k++){
            if(arr[k] == 0){
                j=k;
                break;
            }
        }

        if(j == -1) {
            System.out.println("No Zeroes..");
            return ;
        }

        for(int k = j+1; k<n;k++){
            if(arr[k] != 0){
                int temp = arr[k];
                arr[k] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        System.out.println();
        for(int k:arr)
            System.out.print(k + " ");
    }
}
