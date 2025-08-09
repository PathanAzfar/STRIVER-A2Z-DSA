import java.util.Scanner;
import java.util.ArrayList;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		int finArr[] = rearrangeElements(arr, n);
		for(int i:finArr){
		System.out.print(i+" ");
		}
		sc.close();
		}
	
	private static int[] rearrangeElements(int[] arr,int n){
	    int[] finArr = new int[n];
	    int positiveIndex=0,negativeIndex=1;
	    for(int num:arr){
            if(num >= 0){
                finArr[positiveIndex]=num;
                positiveIndex+=2;
            }
            else {
                finArr[negativeIndex]=num;
                negativeIndex+=2;
            }
	    }
	    return finArr;
	    }
	}