import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); 
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); 
        }

        int k = sc.nextInt(); 
        List<int[]> pairs = findAllPairs(arr, n, k);

        if (pairs.isEmpty()) {
            System.out.println("No pair found");
        } else {
            for (int[] pair : pairs) {
                System.out.println("Pair with values: " + pair[0] + ", " + pair[1]);
            }
        }
    }

    private static List<int[]> findAllPairs(int[] arr, int n, int k) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        List<int[]> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int eleNeeded = k - arr[i];

            if (hash.containsKey(eleNeeded)) {
                result.add(new int[]{eleNeeded, arr[i]});
            }
            hash.put(arr[i], i); 
        }
        return result;
    }
}
