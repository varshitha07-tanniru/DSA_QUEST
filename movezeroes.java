package arrays;

import java.util.ArrayList;

public class movezeroes {

	public static void main(String[] args)
	{
	ArrayList<Integer> list=new ArrayList<Integer>(10);
	list.add(0);
	list.add(1);
	list.add(4);
	list.add(0);
	list.add(5);
	list.add(2);
	/*brute force
	ArrayList<Integer> list1=new ArrayList<Integer>(10);
	int cnt=0;
	for(int num:list)
	{
		if(num!=0)
			list1.add(num);
		else
			cnt+=1;
	}
	for(int i=0;i<cnt;i++)
	{
		list1.add(0);
	}
	System.out.println(list1);
	}
	*/
	
	//optimal approach
	
	int i=0,j=0,temp;
	while(j!=list.size())
	{
		if(list.get(j)!=0) {
			temp = list.get(i);//a[i]
			list.set(i,list.get(j));
			list.set(j, temp);
			i++;
		}
		j++;
	}
	System.out.println(list);

}
}
