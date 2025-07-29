import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int arr[] = new int[n];
	for(int i=0;i<n;i++){
	    arr[i]=sc.nextInt();
	}
	int m = appearOnce(arr,n);
	System.out.print(m);
	}
	
	private static int appearOnce(int[] arr, int n){
	    int xor=0;
	    for(int i=0;i<n;i++){
	        xor=xor^arr[i];
	    }
	    return xor;
	}
}