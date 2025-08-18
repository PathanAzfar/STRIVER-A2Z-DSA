import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int x = sc.nextInt();
        int occ = occurrence(arr,n,x);
        System.out.print(occ);
    }

    private static int occurrence(int[] arr,int n,int x){
        int first = firstOcc(arr,n,x);
        if(first==-1) return 0;
        int last = lastOcc(arr,n,x);
        return last-first+1;
    }

    private static int firstOcc(int[] arr,int n,int x){
        int low=0,high=n-1;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==x){
                ans=mid;
                high=mid-1;
            }
            else if(arr[mid] < x){
                low=mid+1;
            }
            else {
                high = mid-1;
            }
        }
        return ans;
    }

      private static int lastOcc(int[] arr,int n,int x){
        int low=0,high=n-1;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==x){
                ans=mid;
                low=mid+1;
            }
            else if(arr[mid] < x){
                low=mid+1;
            }
            else {
                high = mid-1;
            }
        }
        return ans;
    }
}
