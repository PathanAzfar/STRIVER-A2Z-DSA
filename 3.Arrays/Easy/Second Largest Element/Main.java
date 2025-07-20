import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if (n == 0) {
               System.out.println("Array is empty");
               return;
           }
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        int largeElement=large(arr,n);
        
        int secondLargeElement=secondLarge(arr,n,largeElement);
        if(secondLargeElement==Integer.MIN_VALUE){
            System.out.print("No 2nd largest element");
        }
        else{
        System.out.print(secondLargeElement);
        }
      
    }
    
    private static int large(int[] arr,int n){
        int largeElement=arr[0];
        for(int i=0;i<n;i++){
          if(arr[i]>largeElement)
             largeElement=arr[i];
          }
          return largeElement;
       }
       
       private static int secondLarge(int[]arr,int n,int largeElement){
           int secondLargeElement=Integer.MIN_VALUE;
           for(int i=0;i<n;i++){
               if(arr[i]>secondLargeElement && arr[i]<largeElement)
                 secondLargeElement=arr[i];
           }
           return secondLargeElement;
       }    
}
