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
		 int k = sc.nextInt();
		 int index = binarySearch(arr,n,k);
		 
		 if(index != -1){
		     System.out.print(index);
		 }
		 else
		    System.out.print("Element not Present");
	}
	
	private static int binarySearch(int[] arr,int n,int k){
	    int low=0,high=n-1;
	   
	   while(low <= high){
	    int mid = (low+high)/2;
	       
	        if(arr[mid]==k){
	            return mid;
	        }
	        else if(k > arr[mid]){
	            low=mid+1;
	        }
	        else
	          high=mid-1;
	   }
	   return -1;
	}
}