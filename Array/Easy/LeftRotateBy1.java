package Array.Easy;

class LeftRotateBy1{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        // way 1 (Store first index's element in temp and move all towards left and lastly store temp at length-1)
        int temp=arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1] = temp;
        for(int i:arr){
            System.out.print(i+" ");
        }
          
        
    }
}