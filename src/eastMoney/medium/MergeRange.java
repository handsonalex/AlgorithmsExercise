package eastMoney.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MergeRange {
    public static int[][] merge(int[][] intervals) {
        if (intervals.length == 0){
            return new int[0][2];
        }
        ArrayList<int[]> merge = new ArrayList<>();
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        for (int[] interval : intervals) {
            int l = interval[0];
            int r = interval[1];
            if (merge.size() == 0 || merge.get(merge.size() - 1)[1] < l) {
                merge.add(new int[]{l,r});
            }
            merge.get(merge.size() - 1)[1] = Math.max(r, merge.get(merge.size() - 1)[1]);
        }
        return merge.toArray(new int[merge.size()][2]);
    }

    public static void main(String[] args) {
        int[][] intervals = {
                {1,9},{2,5},{19,20},{10,11},{0,3}
        };
        System.out.println(Arrays.deepToString(merge(intervals)));
    }
}
