package arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
public class leftrotatedplaces {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> arr=new ArrayList<Integer>(10);
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		System.out.println("Enter the k steps to forward");
		int k=sc.nextInt();
		k=k%(arr.size());
		//optimal approach
		for(int j=0;j<k;j++)
		{
		int num=arr.get(0);
		for (int i=0;i<arr.size()-1;i++)
		{
			arr.set(i,arr.get(i+1));
		}
		arr.set(arr.size()-1, num);
		}
		System.out.println(arr);
	}
}
