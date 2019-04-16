package flanker.sort;

/**
 * Created by lihui37 on 2019/4/15.
 */
public class QuickSort {

    public static void sort(int[] array) {
        sort(array, 0, array.length - 1);
    }

    private static void sort(int[] array, int from, int to) {
        if (from < to) {
            int l = from;
            int r = to;
            int m = array[(from + to) / 2];
            while (l < r) {
                while (l <= to && array[l] < m) {
                    l++;
                }
                while (r >= from && array[r] > m) {
                    r--;
                }
                if (l < r) {
                    swap(array, l, r);
                }
            }

            sort(array, from, l - 1);
            sort(array, l + 1, to);
        }
    }

    private static void swap(int[] array, int from, int to) {
        int t = array[from];
        array[from] = array[to];
        array[to] = t;
    }
}
