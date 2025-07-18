import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your name: ");
        String name = br.readLine();
        
        printname(name, 0);
    }

    public static void printname(String name, int count) {
        if (count == 4)
            return;
        System.out.println(name);
        printname(name, count + 1);
    }
}
