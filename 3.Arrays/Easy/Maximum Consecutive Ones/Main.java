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
		 int m = maxConsecutiveOnes(arr,n);
		 System.out.print(m);
		
	}
	
	private static int maxConsecutiveOnes(int arr[],int n){
	    int max=0;
	    int count=0;
	    for(int i=0;i<n;i++){
	        if(arr[i]==1){
	            count++;
	            max=Math.max(max,count);
	        }
	        else{
	            count=0;
	        }
	    }
	    return max;
	}
}