import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n=sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            
            int large=largeElement(arr,n);
            System.out.print(large);
            sc.close();
        }
        
        private static int largeElement(int[] arr,int n){
            int large=arr[0];
            for(int i=0;i<n;i++){
              if(arr[i]>large)
                 large=arr[i];
              }
              return large;
           }
}
