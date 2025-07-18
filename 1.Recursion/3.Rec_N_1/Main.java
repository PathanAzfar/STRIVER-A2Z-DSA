import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main {
        public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          int n = Integer.parseInt(br.readLine());
          printNN(n,n);
          
        }
        
        public static void printNN(int n,int i) {
        
            if (i<1)
                return;
            System.out.println(i);
            printNN(n,i-1);
            
        }
    
}
