package arrays;

import java.util.ArrayList;

public class missingnumber {

	public static void main(String[] args) {

		ArrayList<Integer> arr=new ArrayList<Integer>(10);
		arr.add(0);
		arr.add(1);
		arr.add(2);
		arr.add(4);
		arr.add(5);
		arr.add(6);
		int i=0,sum=0;
		while(i!=arr.size())
		{
			sum+=arr.get(i);
			i++;
		}
		int total_sum=((arr.size())*(arr.size()+1))/2;
		System.out.println(total_sum-sum+" ");
	}
}
