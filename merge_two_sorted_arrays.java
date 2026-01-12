package arrays;

import java.util.Arrays;

public class merge_two_sorted_arrays {

	public static void main(String[] args) {
		/*
		 * nums1=[-5,-2,4,5]
		 * nums2=[-3,1,8]
		 * brute force
		 * step1:sort nums1
		 * step2:sort nums2
		 * step3:create new array and insert elements
		 *optimal approach
		 *i=0 in nums1,j=0 in nums2
		 *-5<-3 no swap
		 */
		int[] nums1= {-5,-2,4,5};//{-5,-2,1,-3}
		int[] nums2= {-3,1,8};//{5,4,8}
		int i=nums1.length-1,j=0;
		while(i>=0 && j<nums2.length)
		{
			if(nums1[i]>nums2[j])
			{
				int temp=nums1[i];
				nums1[i]=nums2[j];
				nums2[j]=temp;
				i--;
				j++;
			}
			else
				break;
		}
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		/*
		while(i<nums1.length && j<nums2.length)
		{
			if(nums1[i]<=nums2[j]) {
				nums3[k]=nums1[i];
				k++;
				i++;
			}
			else if(nums1[i]>nums2[j])
			{
				nums3[k]=nums2[j];
				k++;
				j++;
			}	
		}
		while(i<nums1.length)
		{
			nums3[k]=nums1[i];
			i++;
			k++;
		}
		while(j<nums2.length)
		{
			nums3[k]=nums2[j];
			k++;
			j++;
		}*/
		System.out.println(Arrays.toString(nums1));
		System.out.println(Arrays.toString(nums2));

	}

}
