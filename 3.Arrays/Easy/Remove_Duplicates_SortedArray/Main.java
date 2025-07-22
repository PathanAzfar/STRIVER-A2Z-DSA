import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==0){
            System.out.print("Empty array");
            return;
        }
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int newLength=removeDuplicates(arr,n);
        for(int i=0;i<newLength;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
    
    private static int removeDuplicates(int[] arr,int n){
        int i=0;
        for(int j=1;j<n;j++){
            if(arr[j]!=arr[i]){
                arr[i+1]=arr[j];
                i++;
            }
        }
        
            return (i+1);
        
    }
}