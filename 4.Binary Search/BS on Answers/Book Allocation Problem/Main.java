import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int s=sc.nextInt();
        int ans= findPages(arr,s);
        System.out.print(ans);
    }
    
    private static int findPages(int[] arr,int s) {
        int n=arr.length;
        if (s > n)
            return -1;

        int low = arr[0];
        int high = arr[0];
        for (int i = 1; i < n; i++) {
            low = Math.max(low, arr[i]);  
            high += arr[i];               
        }

        while (low <= high) {
            int mid = (low + high) / 2;
            int students = countStudents(arr, mid);

            if (students > s) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low; 
    }
    
    private static int countStudents(int[] arr, int pages) {
        int n = arr.length;
        int students = 1;
        int pagesStudent = 0;

        for (int i = 0; i < n; i++) {
            if (pagesStudent + arr[i] <= pages) {
                pagesStudent += arr[i];
            } else {
                students++;
                pagesStudent = arr[i];
            }
        }
        return students;
    }
}
