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
		long m = longestSubarray(arr,n);
		System.out.print(m);
		sc.close();
		}
	
	private static long longestSubarray(int[] arr,int n){
	    long sum=0;
	    long max=Long.MIN_VALUE;
	    for(int i=0;i<n;i++){
	        sum+=arr[i];
	        if(sum>max){
	            max=sum;
	        }
	        if(sum<0){
	            sum=0;
	        }
	    }
	    return max;
	}

	}