package Array.Easy;

public class isSorted {
    public static void main(String[] args) {
        int[] arr = {2,3,6,4,7,1};
        int flag=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>=arr[i-1]){

            }
            else{
                 flag=0;
                 break;
            }
        }
        if(flag == 0) System.out.println("Not Sorted");
        else System.out.println("Sorted");
    }
}
