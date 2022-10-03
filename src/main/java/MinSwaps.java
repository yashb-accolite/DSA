import java.util.Arrays;
import java.util.HashMap;

//Finding minimum number of swaps to sort the array in strictly increasing order. Array contains distinct elements.


public class MinSwaps {

    public static int findMinSwaps(int[] a) {
        int res = 0;
        int temp[] = a.clone();
        Arrays.sort(temp);
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i=0; i<a.length; i++) {
            hm.put(a[i], i);             //key: element, value: index
        }

        for(int i=0; i<a.length; i++) {
            if(a[i] != temp[i]) {
                res++;
                int x = a[i];

                swap(a, i, hm.get(temp[i]));

                hm.put(x, hm.get(temp[i]));
                hm.put(temp[i], i);
            }
        }
        return res;
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;

    }

}