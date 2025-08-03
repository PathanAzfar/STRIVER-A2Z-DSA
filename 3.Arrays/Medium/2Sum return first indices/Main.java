import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); 
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); 
        }

        int k = sc.nextInt(); 
        int[] pair = twoSum(arr, n, k);

        if (pair == null) {
            System.out.println("No pair found");
        } else {
            System.out.println("Pair at indices " + pair[0] + ", " + pair[1]);
        }
    }

    private static int[] twoSum(int[] arr, int n, int k) {
        HashMap<Integer, Integer> hash = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int eleNeeded = k - arr[i];

            if (hash.containsKey(eleNeeded)) {
                int index1 = hash.get(eleNeeded);
                int index2 = i;
                return new int[]{index1, index2}; 
            }

            hash.put(arr[i], i); 
        }

        return null; 
    }
}
