import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n < 0) {
            System.out.print("Array size cannot be Negative");
            sc.close();
            return;
        }

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        quickSort(arr, 0, n - 1);

        for (int i : arr) {
            System.out.print(i + " ");
        }

        sc.close();
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int partition = quick(arr, low, high);
            quickSort(arr, low, partition - 1);
            quickSort(arr, partition + 1, high);
        }
    }

    private static int quick(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low + 1;
        int j = high;

        while (i <= j) {
            while (i <= high && arr[i] <= pivot) {
                i++;
            }
            while (j >= low && arr[j] > pivot) {
                j--;
            }
            if (i < j) {
                int temp1 = arr[i];
                arr[i] = arr[j];
                arr[j] = temp1;
            }
        }

        int temp2 = arr[low];
        arr[low] = arr[j];
        arr[j] = temp2;

        return j;
    }
}
