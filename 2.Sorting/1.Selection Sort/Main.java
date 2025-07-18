import java.util.Scanner;

public class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        selectionSort(arr,n);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    
    private static void selectionSort(int[] arr,int n){
        
        for(int i=0;i<=n-2;i++){
           int min=i;
            for(int j=i;j<=n-1;j++){
                if(arr[j]<arr[min])
                   min=j;
            }
            if(min!=i){
                int temp=arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
            }
        }
    }
}
