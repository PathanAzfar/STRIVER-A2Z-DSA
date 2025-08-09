import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 int[] arr = new int[n];
		 for(int i=0;i<n;i++){
		     arr[i]=sc.nextInt();
		 }
		 
		 ArrayList<Integer> finArr = leadersInArray(arr,n);
		 for(int i:finArr){
		     System.out.print(i+" ");
		 }
         sc.close();
    }

    private static ArrayList<Integer> leadersInArray(int[] arr,int n){
        ArrayList<Integer> arrList = new ArrayList<>();
        int maxFromRight = arr[n-1];
        arrList.add(maxFromRight);
        for(int i=n-2;i>=0;i--){
            if(arr[i] >= maxFromRight){
                maxFromRight = arr[i];
                arrList.add(maxFromRight);
            }
        }
        Collections.reverse(arrList);
        return arrList;
    }
}
