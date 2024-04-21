package Array.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class OverlappingIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int n = intervals.length;
        // Arrays.sort(intervals, new Comparator<int[]>() {
        // public int compare(int[] a, int[] b) {
        // return a[0] - b[0];
        // }
        // });
        // List<List<Integer>> ans = new ArrayList<>();
        // for (int i = 0; i < n; i++) {
        // int start = intervals[i][0];
        // int end = intervals[i][1];
        // if (!ans.isEmpty() && end <= ans.get(ans.size() - 1).get(1)) {
        // continue;
        // }

        // for (int j = i + 1; j < n; j++) {
        // if (intervals[j][0] <= end) {
        // end = Math.max(end, intervals[j][1]);
        // } else {
        // break;
        // }
        // }
        // ans.add(Arrays.asList(start, end));
        // }

        // int[][] result = new int[ans.size()][2];
        // for (int i = 0; i < ans.size(); i++) {
        // result[i][0] = ans.get(i).get(0);
        // result[i][1] = ans.get(i).get(1);
        // }
        // return result;

        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (ans.isEmpty() || intervals[i][0] > ans.get(ans.size() - 1).get(1)) {
                ans.add(Arrays.asList(intervals[i][0], intervals[i][1]));
            } else {
                ans.get(ans.size() - 1).set(1, Math.max(ans.get(ans.size() - 1).get(1), intervals[i][1]));
            }
        }

        int[][] result = new int[ans.size()][2];
        for (int i = 0; i < ans.size(); i++) {
            result[i][0] = ans.get(i).get(0);
            result[i][1] = ans.get(i).get(1);
        }
        for(int[] arr: result){
            for(int ele:arr) System.out.print(ele + " ");
            System.out.println();
        }

    }
}
