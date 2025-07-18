import java.util.Scanner;

public class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        bubbleSort(arr,n);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    
    private static void bubbleSort(int[] arr,int n){
        
        for(int i=n-1;i>=1;i--){
            boolean swapped = false;
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                swapped = true;    
                }    
            }
            if(!swapped) {
                break;
            }
        }
    }
}
