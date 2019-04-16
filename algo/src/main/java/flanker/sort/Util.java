package flanker.sort;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by lihui37 on 2019/4/15.
 */
public class Util {

    public static int[] GetR100() {
        int[] list = {173, 58, 0, 88, 11, 100, 183, 106, 180, 0, 168, 20, 20, 92, 196, 16, 196, 58, 143, 2, 125, 110, 59, 3, 35, 99, 86, 28, 106, 113, 56, 176, 144, 25, 27, 36, 151, 137, 14, 19, 140, 170, 16, 169, 121, 30, 70, 33, 35, 184, 33, 66, 161, 124, 175, 68, 194, 173, 28, 88, 25, 21, 60, 198, 120, 135, 48, 16, 62, 128, 27, 4, 95, 4, 136, 15, 6, 181, 114, 188, 41, 103, 191, 195, 161, 159, 98, 95, 77, 161, 164, 176, 50, 96, 22, 79, 65, 176, 189, 136};
        return list;
    }

    public static int[] GetR10() {
        int[] list = {12, 30, 72, 59, 84, 11, 44, 65, 55, 44};
        return list;
    }

    private static void swap(int[] array, int from, int to) {
        int t = array[from];
        array[from] = array[to];
        array[to] = t;
    }

    public static void init() {

        Random random = new Random();

        int count = 10;
        int max = 100;
        ArrayList<Integer> list = new ArrayList<Integer>(count);
        for (int i = 0; i < count; i++) {

            list.add(random.nextInt(max));
        }
        System.out.println(JSON.toJSONString(list));
    }

    public static boolean compare(int[] a1, int[] a2) {

        if (a1.length == a2.length) {
            for (int i = 0; i < a1.length; i++) {
                if (a1[i] != a2[i]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}