package arrays;

public class linearsearch {
	public static void main(String[] args)
	{
	int[] arr= {1,2,3,4,5};
	int ele=3;
	int flag=-1;
	for(int num:arr)
	{
		if(num==ele)
		{
			flag=1;
			System.out.println("Element found");
			break;
		}
	}
	if(flag==-1)
		System.out.println("Element not found");
	}
}
