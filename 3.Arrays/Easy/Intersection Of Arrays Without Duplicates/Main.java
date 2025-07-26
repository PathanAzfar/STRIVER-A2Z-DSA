import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n1 = sc.nextInt();
        int[] a = new int[n1];
        for(int i = 0; i < n1; i++) {
            a[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] b = new int[n2];
        for(int i = 0; i < n2; i++) {
            b[i] = sc.nextInt();
        }

        int[] finArr = intersectionArrary(a, n1, b, n2);
        for(int i : finArr) {
            System.out.print(i + " ");
        }
        sc.close();
    }

    private static int[] intersectionArrary(int[] a, int n1, int[] b, int n2) {
        ArrayList<Integer> arrList = new ArrayList<>();
        int i = 0, j = 0;

        while(i < n1 && j < n2) {
            if(a[i] < b[j]) {
                i++;
            } else if(b[j] < a[i]) {
                j++;
            } else {
                if(arrList.isEmpty() || arrList.get(arrList.size() - 1) != a[i]) {
                    arrList.add(a[i]);
                }
                i++;
                j++;
            }
        }

        int[] result = new int[arrList.size()];
        for(int k = 0; k < arrList.size(); k++) {
            result[k] = arrList.get(k);
        }

        return result;
    }
}
