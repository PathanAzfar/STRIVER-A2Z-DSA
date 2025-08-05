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
		int indices[] = sortZeroOneTwo(arr,n);
		for(int i:indices){
		    System.out.print(i+" ");
		}
		sc.close();
	}
	
	private static int[] sortZeroOneTwo(int[] arr,int n){
        int low=0, mid=0, high = n-1;
	   while(mid <= high){
	       if(arr[mid]==0){
	           int temp = arr[low];
	               arr[low] = arr[mid];
	               arr[mid] = temp;
	           low++;
	           mid++;
	       }
	       else if(arr[mid]==1){
	            mid++;
	       }
	       else {
	           int temp = arr[high];
	               arr[high] = arr[mid];
	               arr[mid] = temp;
	               high--;
	       }
	   }
	    return arr;
	}
}