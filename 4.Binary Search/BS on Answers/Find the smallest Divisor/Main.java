import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		
		int lim=sc.nextInt();
		int ans = samllestDivisor(arr,lim);
		System.out.print(ans);
	}
	
	private static int samllestDivisor(int[] arr,int lim){
	    int n=arr.length;
	    
	    if(n>lim) return -1;
	    
	    int maxi= Integer.MIN_VALUE;
	    for(int i=0;i<n;i++){
	        maxi=Math.max(maxi,arr[i]);
	    }
	    int low=1,high=maxi;
	    while(low<=high){
	        int mid=(low+high)/2;
	        if(sumByDiv(arr,mid)<=lim){
	            high=mid-1;
	        }
	        else{
	            low=mid+1;
	        }
	    }
	    return low;
	}
	
	private static int sumByDiv(int[] arr,int div){
	    int n=arr.length;
	    int sum=0;
	    for(int i=0;i<n;i++){
	        sum+=Math.ceil((double)arr[i]/(double)(div));
	    }
	    return sum;
	}
}