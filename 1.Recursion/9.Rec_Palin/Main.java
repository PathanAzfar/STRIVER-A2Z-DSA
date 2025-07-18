import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a string: ");
        String st = br.readLine();
        String clean = st.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        System.out.print(checkPalin(0, clean) ? "Palindrome" : "Not Palindrome");
    }

    private static boolean checkPalin(int i, String st) {
        int si = st.length();
        if (i >= si / 2)
            return true;
        if (st.charAt(i) != st.charAt(si - i - 1))
            return false;
        return checkPalin(i + 1, st);
    }
}
