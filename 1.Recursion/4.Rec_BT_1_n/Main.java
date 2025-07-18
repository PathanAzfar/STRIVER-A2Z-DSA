import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(br.readLine());
            printN(n,n);
            
        }
        public static void printN(int i,int n) {
            if(i<1)
                return;
            printN(i-1,n);
            System.out.println(i);
        }
        
}
