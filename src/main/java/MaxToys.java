import java.util.Arrays;

//Given an array arr[ ] of length N consisting cost of N toys and an integer K depicting the amount.
//find the maximum toys you can buy with K amount.


public class MaxToys {

    public static int findMaxToys(int[] a, int k) {
        Arrays.sort(a);
        int sum = 0;
        int res = 0;
        for(int i=0 ; i<a.length; i++) {
            sum = sum + a[i];
            if(sum<=k) {
                res++;
            }
            else {
                break;
            }
        }

        return res;

    }

}