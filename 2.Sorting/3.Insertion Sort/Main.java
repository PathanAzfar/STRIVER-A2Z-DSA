import java.util.Scanner;

public class Main{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        InsertionSort(arr,n);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    
    private static void InsertionSort(int[] arr,int n){
        
        for(int i=0;i<n;i++){
             int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    j--;
                }    
            }
          
        }
    }
    
