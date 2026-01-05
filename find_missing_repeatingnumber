package arrays;
import java.util.*;

public class find_missing_repeatingnumber {

    public static void main(String[] args) {

        /*int[] nums = {3, 5, 4, 1, 1};
        Set<Integer> set = new HashSet<>();
        int setsum = 0;
        for (int num : nums) {
            set.add(num);
        }
        for (int num : set) {
            setsum += num;
        }
        int n = nums.length;
        int originalsum = (n * (n + 1)) / 2;
        int missing_number = originalsum - setsum;

        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        int repeating_number = totalSum - setsum;

        System.out.println("Missing Number: " + missing_number);
        System.out.println("Repeating Number: " + repeating_number);
    }
    /*
     * 1^2^3^4^5=
     * 100
     * 101
     * 001
     */
    	int[] nums= {3,5,4,1,1};
    	long n = nums.length;
        long SN = (n * (n + 1)) / 2;
        long S2N = (n * (n + 1) * (2 * n + 1)) / 6;
        long S = 0, S2 = 0;
        for (int i = 0; i < n; i++) {
            S += nums[i];
            S2 += (long)nums[i] * (long)nums[i];
        }
        long val1 = S - SN;
        long val2 = S2 - S2N;
        val2 = val2 / val1;
        long x = (val1 + val2) / 2;
        long y = x - val1;

        int[] ans = {(int)x, (int)y};
        System.out.println(Arrays.toString(ans));
    }   	
}
