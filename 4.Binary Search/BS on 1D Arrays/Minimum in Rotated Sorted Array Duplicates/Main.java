import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int min = findMin(arr, n);
        System.out.print(min);
    }

    private static int findMin(int[] arr, int n) {
        int low = 0, high = n - 1;
        int minEle = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = (low + high) / 2;

            
            if (arr[low] == arr[mid] && arr[mid] == arr[high]) {
                minEle = Math.min(minEle, arr[low]);
                low++;
                high--;
                continue;
            }

            
            if (arr[low] <= arr[mid]) {
                minEle = Math.min(minEle, arr[low]);
                low = mid + 1;
            }
            
            else {
                minEle = Math.min(minEle, arr[mid]);
                high = mid - 1;
            }
        }

        return minEle;
    }
}
