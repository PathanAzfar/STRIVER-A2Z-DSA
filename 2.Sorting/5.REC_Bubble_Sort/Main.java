import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        bubbleSort(arr, n);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static void bubbleSort(int arr[], int n) {
        if (n == 1)
            return;

        boolean swap = false;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                swap = true;
            }
        }

        if (!swap)
            return;
        bubbleSort(arr, n - 1);
    }
}
