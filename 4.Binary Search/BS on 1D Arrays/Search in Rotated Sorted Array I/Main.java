import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		int k =sc.nextInt();
		int ind = searchInRotatedMat(arr,n,k);
		System.out.print(ind);
	}
	
	private static int searchInRotatedMat(int[] arr,int n,int k){
	    int low=0,high=n-1;
	    while(low<=high){
	        int mid = (low+high)/2;
	        if(arr[mid]==k){
	            return mid;
	        }
	            
	            if(arr[low]<=arr[mid]){
	                if(arr[low]<= k && k < arr[mid])
	                 high = mid-1;
	                 else
	                 low=mid+1;
	            }
	        else{
	            
	          if (arr[mid] < k && k <= arr[high])
	             low = mid+1;
	          else
	             high = mid-1;
	        }
	    }
	    return -1;
	}
}