package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class leftrotateby1 {
public static void main(String[] args)
{
	ArrayList<Integer> arr=new ArrayList<Integer>(10);
	arr.add(1);
	arr.add(2);
	arr.add(3);
	arr.add(4);
	arr.add(5);
	//optimal approch
	int num=arr.get(0);
	for (int i=0;i<arr.size()-1;i++)
	{
		arr.set(i,arr.get(i+1));
	}
	arr.set(arr.size()-1, num);
	System.out.println(arr);
}
}
