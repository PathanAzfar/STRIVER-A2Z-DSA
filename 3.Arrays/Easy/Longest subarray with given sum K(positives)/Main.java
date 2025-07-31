import java.util.Scanner;
public class Main {
 public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n =sc.nextInt(); 
       int k =sc.nextInt();
         int[] arr = new int[n];
         for(int i = 0; i < n; i++) {
              arr[i] = sc.nextInt();
    }
      int a =longestSubarray(arr,k,n);
         System.out.println(a);
         sc.close();
}



    public static int longestSubarray(int []arr, int k,int n) {

        int left = 0, right = 0;
        long sum = arr[0];
        int maxLen = 0;
        while (right < n) {
            while (left <= right && sum > k) {
                sum -= arr[left];
                left++;
            }
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
            right++;
            if (right < n) sum += arr[right];
        }

        return maxLen;
    }

   
}

