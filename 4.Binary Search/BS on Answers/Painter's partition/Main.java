import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] boards = new int[n];
        for(int i = 0; i < n; i++){
            boards[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int ans = painterPartition(boards, k);
        System.out.print(ans);
    }

    private static int painterPartition(int[] boards, int k) {
        int n = boards.length;
        int low = boards[0];
        int high = boards[0];

        for (int i = 1; i < n; i++) {
            low = Math.max(low, boards[i]);
            high += boards[i];
        }

        while (low <= high) {
            int mid = (low + high) / 2;

            int painters = countPainters(boards, mid);

            if (painters > k) {
                low = mid + 1;   
            } else {
                high = mid - 1;  
            }
        }

        return low; 
    }

    private static int countPainters(int[] boards, int maxTime) {
        int painters = 1;
        int time = 0;

        for (int i = 0; i < boards.length; i++) {
            if (time + boards[i] <= maxTime) {
                time += boards[i];
            } else {
                painters++;
                time = boards[i];
            }
        }
        return painters;
    }
}
