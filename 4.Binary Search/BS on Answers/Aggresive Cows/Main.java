import java.util.Scanner;
import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		int c = sc.nextInt();
        
		int ans = aggCows(arr,c);
		System.out.print(ans);
		sc.close();
	}
	
	private static int aggCows(int[] arr,int c){
	    int n=arr.length;
	    Arrays.sort(arr);
	    
	    int low=1,high=arr[n-1]-arr[0];
	    while(low<=high){
	        int mid=(low+high)/2;
	        if(canWePlace(arr,mid,c)==true) low=mid+1;
	        else high=mid-1;
	    }
	   return high;
	}
	
	private static boolean canWePlace(int[] arr,int dis,int c){
	    int n=arr.length;
	    int cntCows=1,lastCow=arr[0];
	    for(int i=1;i<n;i++){
	        if(arr[i]-lastCow>=dis){
	            cntCows++;
	            lastCow=arr[i];
	        }
	        if(cntCows>=c) return true;
	    }
	    return false;
	}
}