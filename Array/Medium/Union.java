import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

class Union {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int[] arr1 = { 1, 2, 3, 4, 5, 6, 7 };

        // way 1 (Use set ds) brute force solution
        Set<Integer> s = new LinkedHashSet<>();
        for (int i : arr)
            s.add(i);
        for (int j : arr1)
            s.add(j);

        int i = 0;
        int[] union = new int[s.size()];
        for (int k : s)
            union[i++] = k;

        for (int l : union)
            System.out.println(l);

        // way 2 (2 pointer approach)
        int p1 = 0;
        int p2 = 0;
        int n1 = arr.length;
        int n2 = arr1.length;
        ArrayList<Integer> l = new ArrayList<>();
        while (p1 < n1 && p2 < n2) {
            if (arr[p1] <= arr1[p2]) {
                if (l.size() == 0 || l.size() - 1 != arr[p1]) {
                    l.add(arr[p1]);
                }
                p1++;
            } else {
                if (l.size() == 0 || l.size() - 1 != arr1[p2]) {
                    l.add(arr1[p2]);
                }
                p2++;
            }
        }

        while(p1<n1){
            if (l.size() == 0 || l.size() - 1 != arr[p1]) {
                l.add(arr[p1]);
            }
            p1++;
        }while(p2<n2){
            if (l.size() == 0 || l.size() - 1 != arr1[p2]) {
                l.add(arr1[p2]);
            }
            p2++;
        }

        for(int ele:l){
            System.out.println(ele);
        }
    }
}