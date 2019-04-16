package flanker.sort;

import org.junit.Test;

import java.util.Arrays;

public class QuickSortTest {

    @Test
    public void testSort() {
        int array[] = Util.GetR100();
        int array2[] = Util.GetR100();
        QuickSort.sort(array);
//
        Arrays.sort(array2);

        System.out.println(Util.compare(array, array2));
    }

    @Test
    public void init() {

    }
}