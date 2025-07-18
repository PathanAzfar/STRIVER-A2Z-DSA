import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter a number: ");
        int n = Integer.parseInt(br.readLine());
        
        printSum(n, 0);
    }

    private static void printSum(int n, int sum) {
        if (n < 1) {
            System.out.println(sum);
            return;
        }
        printSum(n - 1, sum + n);
    }
}
