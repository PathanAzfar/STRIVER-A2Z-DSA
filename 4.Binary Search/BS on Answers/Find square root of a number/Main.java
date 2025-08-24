import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     
     int ans = findSqrt(n); 
      System.out.println(ans);
     sc.close();
	
	}
	
	private static int findSqrt(int n){
	    int low=1,high=n;
	    
	    while(low<=high){
	        int mid=(low+high)/2;
	        long val=mid*mid;
	        if(val<=n){
	            low=mid+1;
	        }
	        else{
	            high=mid-1;
	        }
	    }
	    return high;
	}
}