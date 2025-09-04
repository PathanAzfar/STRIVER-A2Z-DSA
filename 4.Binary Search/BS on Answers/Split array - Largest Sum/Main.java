import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int ans = splitArray(nums, k);
        System.out.print(ans);

        sc.close();
    }

    private static int splitArray(int[] nums, int k) {
        int n = nums.length;
        int low = nums[0];
        int high = nums[0];
        for (int i = 1; i < n; i++) {
            if (nums[i] > low) {
                low = nums[i];
            }
            high += nums[i];
        }

        while (low <= high) {
            int mid = (low + high) / 2;
            int subarrays = countSubarrays(nums, mid);

            if (subarrays > k) {
                low = mid + 1;   
            } else {
                high = mid - 1;  
            }
        }
        return low; 
    }

    private static int countSubarrays(int[] nums, int maxSum) {
        int n = nums.length;
        int subarrays = 1;
        int currentSum = 0;

        for (int i = 0; i < n; i++) {
            if (currentSum + nums[i] <= maxSum) {
                currentSum += nums[i];
            } else {
                subarrays++;
                currentSum = nums[i];
            }
        }
        return subarrays;
    }
}
