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
		leftRotateArray(arr,n);
		for(int i:arr){
		    System.out.print(i+" ");
		}
	}
	private static void leftRotateArray(int[] arr,int n){
	    int temp=arr[0];
	    for(int i=1;i<n;i++){
	        arr[i-1]=arr[i];
	    }
	    arr[n-1]=temp;
	}
	
}