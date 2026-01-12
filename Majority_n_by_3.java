package arrays;

import java.util.HashMap;
import java.util.Map;

public class Majority_n_by_3 {

	public static void main(String[] args) {
		
		/*
		 * nums = [1,2,1,1,3,2,2]
		 * c1=1 p1=1
		 * c2=2 p2=1
		 * p1=2
		 * p1=3
		 * p1=2
		 * p2=2
		 * p2=3
		 * l=[1,2]
		 * 1 cnt=3
		 * 2 cnt=3
		 * overall cnt=7/3=2
		 * 3>2 so answer is 1,2
		 */

		int[] nums = new int[] {1,2,1,1,3,2};
		int can1 = 0, can2 = 0;
		int points1 = 0, points2 = 0;

		// Phase 1: Candidate selection
		for (int num : nums) {
			if (can1 == 0 && points1 == 0) {
				can1 = num;
				points1 += 1;
			} else if (can1 == num) {
				points1 += 1;
			} else if (can2 == 0 && points2 == 0) {
				can2 = num;
				points2 += 1;
			} else if (can2 == num) {
				points2 += 1;
			} else {
				points1 -= 1;
				points2 -= 1;
			}
		}

		Map<Integer, Integer> map = new HashMap<>();
		for (int num : nums) {
			if (num == can1) {
				map.put(num, map.getOrDefault(num, 0) + 1);
			}
			if (num == can2) {
				map.put(num, map.getOrDefault(num, 0) + 1);
			}
		}

		int threshold = nums.length / 3;
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() > threshold) {
				System.out.println(entry.getKey());
			}
		}
	}
}
