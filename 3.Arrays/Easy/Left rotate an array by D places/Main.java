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
		int d =sc.nextInt();
		leftRotate(arr,n,d);
		for(int i:arr){
		    System.out.print(i+" ");
		}
	}
	
	private static void leftRotate(int[] arr,int n,int d){
	    d=d%n;
	    reverseArray(arr,0,d-1);
	    reverseArray(arr,d,n-1);
	    reverseArray(arr,0,n-1);
	}
	private static void reverseArray(int arr[],int start,int end){
	    while(start<end){
	        int temp = arr[start];
	        arr[start]=arr[end];
	        arr[end]=temp;
	        start++;
	        end--;
	    }
	}
}