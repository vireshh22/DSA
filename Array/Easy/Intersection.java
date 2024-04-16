package Array.Easy;

import java.util.ArrayList;

public class Intersection {
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 4, 5, 6 ,8};
        int[] nums2 = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int s1 = nums1.length;
        int s2 = nums2.length;
        int i = 0;
        int j = 0;
        ArrayList<Integer> l = new ArrayList<>();

        while (i < s1 && j < s2) {
        if (nums1[i] < nums2[j]) {
        i++;
        } else if (nums2[j] < nums1[i]) {
        j++;
        } else {
        l.add(nums1[i]);
        i++;
        j++;
        }
        }

        int[] ans = new int[l.size()];
        for (int k = 0; k < ans.length; k++)
        ans[k] = l.get(k);
        for(int ele:ans)
            System.out.println(ele);
    }
}
