import java.util.ArrayList;

//Finding leaders of an array and a leader is greater than or equal to all the elements to its right side.
// The rightmost element is always a leader.

public class LeadersOfArray {

    public static int[] findLeaders(int N, int[] a) {
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            int flag = 1;
            for(int j = i+1; j< N; j++) {
                if(a[i]<a[j]) {
                    flag = 0;
                    break;
                }
            }
            if(flag == 1) res.add(a[i]);
        }


        int[] result = new int[res.size()];
        int index = 0;
        for (Integer value: res) {
            result[index++] = value;
        }
        return result;
    }

}