import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr =new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		int d=sc.nextInt();
		int ans = minWeightCap(arr,d);
		System.out.print(ans);
	}
	
	private static int minWeightCap(int[] weights,int days){
	    int low=0;
	    int high=0;
	    int n =weights.length;
	    for(int i=0;i<n;i++){
	        high+=weights[i];
	        low=Math.max(low,weights[i]);
	    }
	    while (low<=high) {
	        int mid=(low+high)/2;
	        int noOfDays = findDays(weights,mid);
	        if(noOfDays<=days) high=mid-1;
	        else low=mid+1;
	}
	return low;
}

   private static int findDays(int[] weights,int cap){
       int n = weights.length;
       int days=1,load=0;
       for(int i=0;i<n;i++){
           if(load+weights[i]>cap){
               days+=1;
               load=weights[i];
           }
           else{
               load+=weights[i];
           }
       }
       return days;
   }
}