import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int m =sc.nextInt();
		
		int ans = nthRoot(n,m);
		
		System.out.print(ans);
	}
	
	private static int nthRoot(int n,int m){
	     int low = 1, high = m;
        while (low <= high) {
            int mid = (low + high) / 2;
            int value = pow(mid, n, m);
            if (value == 1) {
                return mid;
            } else if (value == 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
	}
	
	 public static int pow(int mid, int n, int m) {
        long ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = ans * mid;
            if (ans > m) return 2;
        }
        if (ans == m) return 1;
        return 0;
    }
}