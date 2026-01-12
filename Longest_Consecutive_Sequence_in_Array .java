package arrays;

import java.util.HashSet;

public class Longest_Consecutive_Sequence_in_Array {
    public static void main(String[] args) {
        int[] nums ={0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        int cnt = 0, maxcnt = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        for (int i = 0; i < nums.length; i++) {
            cnt = 0;
            if (!set.contains(nums[i] - 1)) {
                cnt += 1;
                int number = nums[i] + 1;
                while (set.contains(number)) {
                    cnt += 1;
                    number += 1;
                }
                maxcnt = Math.max(cnt, maxcnt);
            }
        }
        System.out.println(maxcnt);
    }
}
