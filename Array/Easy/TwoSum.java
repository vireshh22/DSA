package Array.Easy;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,7,5};
        int target=9;
        for(int x=0;x<nums.length-1;x++){
            for(int y=x+1;y<nums.length;y++){
                if(nums[x]+nums[y]==target){
                    int arr[]={x,y};
                    for(int i:arr) System.out.println(i);
                    break;
                }
            }
        }

        // HashMap<Integer,Integer> map = new HashMap<>();
        // int[] arr = new int[2];
        // arr[0]=arr[1]=-1;
        // for(int i=0;i<nums.length;i++){
        //     int num = nums[i];
        //     int sub = target - num;
        //     if(map.containsKey(sub)){
        //         arr[0]=i;
        //         arr[1]= map.getOrDefault(sub,-1);
        //     } 
        //     map.put(nums[i],i);
        // }
        // for(int i:arr) System.out.println(i);
    }
}
