import java.util.Scanner;
public class Main{
      public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	       int n1= sc.nextInt();
	       int a1[] = new int[n1];
	       for(int i=0;i<n1;i++){
	           a1[i]=sc.nextInt();
	       }
	       int n2 = sc.nextInt();
	       int a2[] = new int[n2];
	       for(int i=0;i<n2;i++){
	           a2[i]=sc.nextInt();
	       }
	   double ans = medianOfTwoSortedArray(a1,a2);
	   System.out.print(ans);
	   sc.close();
	}

      public static double medianOfTwoSortedArray(int[] a1, int[] a2) {
        int n1 = a1.length, n2 = a2.length;

        if (n1 > n2) return medianOfTwoSortedArray(a2, a1);

        int n = n1 + n2; 
        int left = (n1 + n2 + 1) / 2; 
        
        int low = 0, high = n1;
        while (low <= high) {
            int mid1 = (low + high) / 2;
            int mid2 = left - mid1;
            
            
            int l1 = (mid1 > 0) ? a1[mid1 - 1] : Integer.MIN_VALUE;
            int l2 = (mid2 > 0) ? a2[mid2 - 1] : Integer.MIN_VALUE;
            int r1 = (mid1 < n1) ? a1[mid1] : Integer.MAX_VALUE;
            int r2 = (mid2 < n2) ? a2[mid2] : Integer.MAX_VALUE;

            if (l1 <= r2 && l2 <= r1) {
                if (n % 2 == 1) return Math.max(l1, l2);
                else return ((double) (Math.max(l1, l2) + Math.min(r1, r2))) / 2.0;
            } else if (l1 > r2) high = mid1 - 1;
            else low = mid1 + 1;
        }
        return 0; 
    }
}