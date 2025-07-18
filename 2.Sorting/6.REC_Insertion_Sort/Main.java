import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        recInsertionSort(arr, n);

        for (int i : arr) {
            System.out.print(i + " ");
        }

        sc.close();
    }

    private static void recInsertionSort(int[] arr, int n) {
        if (n <= 1) return;

        for (int i = 0; i <= n - 1; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }

        recInsertionSort(arr, n - 1);
    }
}
