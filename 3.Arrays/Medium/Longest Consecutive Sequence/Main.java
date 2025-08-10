import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		
		int ele=longestConsecutiveSeq(arr,n);
		System.out.print(ele);
	}
	
	private static int longestConsecutiveSeq(int[] arr,int n){
	  if(n==0) return 0;
	  int longest = 1;
        Set<Integer> set = new HashSet<>();

        for (int i : arr) {
            set.add(i);
        }

        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int count = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }
        return longest;
    }
}
	
