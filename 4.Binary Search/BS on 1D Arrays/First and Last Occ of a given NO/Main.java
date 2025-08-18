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
		 int x = sc.nextInt();
		 int first = lowerBound(arr,x);
         int last= upperBound(arr,x)-1;

         if(first==n || arr[first]!= x){
            System.out.print("[-1,-1]");
         }
         else{
            System.out.print("["+first+","+last+"]");
         }
	}
  
    private static int lowerBound(int[] arr,int x){
        int n=arr.length;
        int low=0,high=n;
        while(low<high){
            int mid = low + (high-low)/2;
            if(arr[mid] >= x){
                high= mid;
            }
            else low= mid+1;
        }
     return low;
    }
      
     private static int upperBound(int[] arr,int x){
        int n =arr.length;
        int low=0,high=n;
        while(low<high){
            int mid = low + (high-low)/2;
            if(arr[mid] > x){
                high= mid;
            }
            else low= mid+1;
        }
     return low;
    }

}