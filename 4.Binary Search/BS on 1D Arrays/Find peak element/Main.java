import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		 int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = findPeakElement(arr,n);
        if (ans != -1)
            System.out.println(ans);
        else
            System.out.println("No peak element found!");
            
    sc.close();
	}
	
	 public static int findPeakElement(int[] arr,int n) {
	     
        if (n == 1) return 0;
        if (arr[0] > arr[1]) return 0;
        if (arr[n - 1] > arr[n - 2]) return n - 1;

        int low = 1, high = n - 2;
        while (low <= high) {
            int mid = (low + high) / 2;
            
            if (arr[mid - 1] < arr[mid] && arr[mid] > arr[mid + 1])
                return mid;

            if (arr[mid] > arr[mid - 1])
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1; 
    }
}