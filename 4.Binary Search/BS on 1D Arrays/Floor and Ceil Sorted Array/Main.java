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
        
        int floorEle=floor(arr,n,x);
        int ceilEle =  ceil(arr,n,x);
        
        System.out.println("Floor is: " + floorEle );
        System.out.println("Ceil is: " + ceilEle);
    }


    private static int ceil(int[] arr,int n,int x){
        int low=0,high=n-1;
        int ans=-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>=x){
                 ans=arr[mid];
                 high=mid-1;
                }
                else{
                    low=mid+1;
            }
        }
        return ans;
    }

    private static int floor(int[] arr,int n, int x){
        int low=0,high=n-1;
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]<=x){
                ans=arr[mid];
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
}
