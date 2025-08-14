import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            int m = sc.nextInt();
            int n = sc.nextInt();
            int[][] arr = new int[m][n];
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    arr[i][j]= sc.nextInt();
                }
            }
            List<Integer> result = spiralMat(arr,m,n);
            System.out.print(result);
            sc.close();
        }
        
        private static List<Integer> spiralMat(int[][] arr, int m,int n){
            List<Integer> result = new ArrayList<>();
            int top=0,bottom = m-1,left=0,right = n-1;
            while (top<=bottom && left<=right){
                for(int i=left;i<=right;i++){
                    result.add(arr[top][i]);
                }
                top++;
                for(int i=top;i<=bottom;i++){
                    result.add(arr[i][right]);
                }
                right--;
                if(top <= bottom){
                    for(int i=right;i>=left;i--){
                        result.add(arr[bottom][i]);
                    }
                    bottom--;
                }
                if(left <= right){
                    for(int i=bottom;i>=top;i--){
                        result.add(arr[i][left]);
                    }
                    left++;
                }
            } 
            return result;
        }
        
}