package arrays;

public class buy_stock_sell {

	public static void main(String[] args) { 
		int[] arr= {10,7,5,8,11,9};
		int maxprofit=0;
		
		/*brute force
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]-arr[i]>maxprofit)
					maxprofit=arr[j]-arr[i];}}
		System.out.println(maxprofit);*/
		
		//optimal way
		int minprice=arr[0];
		for(int price:arr)
		{
			minprice=Math.min(minprice,price);
			maxprofit=Math.max(maxprofit,price-minprice);
		}
		System.out.println(maxprofit);
		
		
	}

}
