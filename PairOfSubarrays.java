import java.util.*;

public class Main {
    public static int calculatePairs(int n, int[] arr) {
        int[] prefix_sum=new int[arr.length+1];
        prefix_sum[0]=0;
        //prefixsum calculation which is very useful to find sum of subarrays
        for(int i=1;i<=n;i++)
        {
            prefix_sum[i]=prefix_sum[i-1]+arr[i-1];
        }
        //***finding subarrays
        Map<Integer,List<int[]>> subgroups=new HashMap<>();
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n;j++)
            {
                int sum=prefix_sum[j]-prefix_sum[i-1];
                subgroups.putIfAbsent(sum,new ArrayList<>());
                subgroups.get(sum).add(new int[]{i,j});
            }
        }
        //finding the non-overlapping subarrays
        int cnt=0;
        for(int sum:subgroups.keySet())
        {
            List<int[]> subarrays=subgroups.get(sum);
            for(int i=0;i<subarrays.size();i++)
            {
                int l1=subarrays.get(i)[0];
                int r1=subarrays.get(i)[1];
                for(int j=i+1;j<subarrays.size();j++)
                {
                    int l2=subarrays.get(j)[0];
                    int r2=subarrays.get(j)[1];
                    if(r1<l2 || r2<l1)
                    {
                        cnt++;
                    }
                }
            }
        }
        
        return cnt;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int result = calculatePairs(n, arr);
        System.out.println(result);
    }
}
