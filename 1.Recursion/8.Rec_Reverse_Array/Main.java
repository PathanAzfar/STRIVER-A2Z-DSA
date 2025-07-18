import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        
        System.out.print("Enter size of array: ");
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];

        System.out.print("Enter " + n + " elements: ");
        String[] elements = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(elements[i]);
        }

        
        System.out.print("Entered elements: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        
        printRev(0, arr, n);

        
        System.out.print("\nReversed elements: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static void printRev(int i, int[] arr, int n) {
        if (i >= n / 2)
            return;

        int temp = arr[i];
        arr[i] = arr[n - i - 1];
        arr[n - i - 1] = temp;
        printRev(i + 1, arr, n);
    }
}