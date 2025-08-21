import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = findKRotation(arr, n);
        System.out.println(ans);
    }

    public static int findKRotation(int[] arr, int n) {
        int low = 0, high = n - 1;
        int index = 0;  

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[low] == arr[mid] && arr[mid] == arr[high]) {
                if (arr[low] < arr[index]) index = low;
                low++;
                high--;
                continue;
            }

            if (arr[low] <= arr[high]) {
                if (arr[low] < arr[index]) index = low;
                break;
            }

            if (arr[low] <= arr[mid]) {
                if (arr[low] < arr[index]) index = low;  
                low = mid + 1;
            }
            
            else {
                if (arr[mid] < arr[index]) index = mid;  
                high = mid - 1;
            }
        }
        return index;
    }
}
