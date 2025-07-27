import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n-1];
		for(int i=0;i<n-1;i++){
		    arr[i]=sc.nextInt();
		}
		
		int miss= findMissingEle(arr,n);
		System.out.print(miss);
	}
	
	
	private static int findMissingEle(int[] arr,int n){
	    int sum=0;
	   for(int i=0;i<n-1;i++){
	       sum=sum+arr[i];
	   }
	   int aS=(n*(n+1)/2);
	   
	   return aS-sum;
	   
	}
}