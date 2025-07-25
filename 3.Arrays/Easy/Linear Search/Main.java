import java.util.Scanner;
public class Main {
    public class O_Linear_Search {
      public static void main(String[] args) {
    	  Scanner sc = new Scanner(System.in);
    	  int n=sc.nextInt();
    	  int[] arr = new int[n];
    	  for(int i=0;i<n;i++) {
    		  arr[i]=sc.nextInt();
    	  }
    	  int se= sc.nextInt();
    	  int r = linearSearch(arr,n,se);
    	  System.out.print(r);
    	  sc.close();
    	  
      }
      
      private static int linearSearch(int[] arr,int n,int se) {
    	  for(int i=0;i<n;i++) {
    		  if(arr[i]==se)
    			  return i;
    	  }
    	  return -1;
      }
}
