import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter a number: ");
        int n = Integer.parseInt(br.readLine());
        
        System.out.print(printfact(n));
    }

    private static int printfact(int n) {
        if (n <= 1)
            return 1;
        return n * printfact(n - 1);
    }
}
