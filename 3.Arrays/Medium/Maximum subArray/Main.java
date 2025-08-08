import java.util.Scanner;
import java.util.Arrays;
public class Main
{
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		int[] subArray = longestSubarray(arr,n);
		for(int i:subArray){
		    System.out.print(i+" ");
		}
		sc.close();
		}
	
	private static int[] longestSubarray(int[] arr,int n){
	    long sum=0;
	    long max=Long.MIN_VALUE;
	    int start=0,end=0,tempStart=0;
	    for(int i=0;i<n;i++){
	        sum+=arr[i];
	        if(sum>max){
	            max=sum;
	            start=tempStart;
	            end=i;
	        }
	        if(sum<0){
	            sum=0;
	            tempStart=i+1;
	        }
	    }
	    return Arrays.copyOfRange(arr,start,end+1);
	}

	}