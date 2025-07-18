import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a number: ");
        int n = Integer.parseInt(br.readLine()); 

        printNN(1, n);
    }

    public static void printNN(int i, int n) {
        if (i > n)
            return;
        System.out.println(i);
        printNN(i + 1, n);
    }
}
