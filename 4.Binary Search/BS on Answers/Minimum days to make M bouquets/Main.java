import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		int b=sc.nextInt();
		int f=sc.nextInt();
		
		int ans = roseGarden(arr,b,f);
		System.out.print(ans);
	}
	
	private static int roseGarden(int[] arr,int b,int f){
	    int n=arr.length;
	    long val = (long) b*f;
	    if(val>n) return -1;
	    
	    int mini=Integer.MAX_VALUE,maxi=Integer.MIN_VALUE;
	    
	    for(int i=0;i<n;i++){
	         mini = Math.min(mini,arr[i]);
	         maxi = Math.max(maxi,arr[i]);
	    }
	    
	   int low=mini,high=maxi;
	   while(low<=high){
	       int mid=(low+high)/2;
	       if(possible(arr,mid,b,f)){
	           high=mid-1;
	       }
	       else{
	           low=mid+1;
	       }
	   }
	   return low;
	}
	
	private static boolean possible(int[] arr, int days,int b,int f){
	    int n=arr.length;
	    int cnt=0,noOfB=0;
	    for(int i=0;i<n;i++){
	        if(arr[i]<=days) cnt++;
	        else{
	            noOfB=noOfB+(cnt/f);
	            cnt=0;
	        }
	    }
	    noOfB=noOfB+(cnt/f);
	    return noOfB>=b;
	    
	}
}