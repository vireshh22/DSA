package Array.Easy;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,1,2};

        // way 1
        Set<Integer> s = new LinkedHashSet<>();
        for(int i:arr)
            s.add(i);
        
        int index=0;
        for(int i:s){
            arr[index]=i;
            index++;
        }
        for(int i:arr)
            System.out.println(i+"\n");
        System.out.println("After Removing: "+s.size());


        // way 2
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i] != arr[j]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        System.out.println("After Removing: " + (i + 1));
    }
}
