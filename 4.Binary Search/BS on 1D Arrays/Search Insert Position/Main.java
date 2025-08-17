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
		 int index = searchInsertPosition(arr,n,x);
		     System.out.print(index);
	}

    private static int searchInsertPosition(int[] arr,int n,int x){
        int low=0,high=n-1;
        int ans=n;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid] >= x){
                ans=mid;
                high = mid - 1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
}