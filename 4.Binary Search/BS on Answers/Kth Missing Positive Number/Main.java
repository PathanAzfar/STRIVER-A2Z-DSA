import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		
		int p=sc.nextInt();
		int ans = missingKthNo(arr,p);
		System.out.print(ans);
	}
	
	private static int missingKthNo(int[] arr,int k){
	    int n =arr.length;
	    int low=0,high=n-1;
	    while(low<=high){
	        int mid=(low+high)/2;
	        int missing = arr[mid] - (mid+1);
	        if(missing < k) low=mid+1;
	        else high=mid-1;
	    }
	        int ans = k+high+1;
	    return ans;
	}
}