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
		int h=sc.nextInt();
		
		int ans = minTimeToEatBananas(arr,h);
		System.out.print(ans);
	}
	
	private static int minTimeToEatBananas(int[] arr,int h){
	    int low=1,high=findMaxInArray(arr);
	    
	    while(low<=high){
	        int mid=(low+high)/2;
	        int totalHours = calHours(arr,mid);
	        if(totalHours<=h){
	            high=mid-1;
	        }
	        else{
	            low=mid+1;
	        } 
	    }
	    return low;
	}
	
	private static int findMaxInArray(int[] arr){
	    int n =arr.length;
	    int maxi=Integer.MIN_VALUE;
	    for(int i=0;i<n;i++){
	        maxi=Math.max(maxi,arr[i]);
	    }
	    return maxi;
	}
	
	private static int calHours(int[] arr,int hours){
	    int n =arr.length;
	    int totalHours =0;
	    for(int i=0;i<n;i++){
	        totalHours+=(int)Math.ceil((double)arr[i]/hours);
	    }
	    return totalHours;
	}
}