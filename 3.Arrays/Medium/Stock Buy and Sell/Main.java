import java.util.Scanner;
public class Main
{
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		int maxProfit = buyOrSell(arr, n);
		System.out.print(maxProfit);
		sc.close();
		}
	
	private static int buyOrSell(int[] arr,int n){
	   int minPrice=Integer.MAX_VALUE;
	   int maxProfit=0;
	   for(int i=0;i<n;i++){
	       minPrice=Math.min(minPrice,arr[i]);
	       maxProfit=Math.max(maxProfit,arr[i]-minPrice);
	   }
	  return maxProfit;
	}

	}