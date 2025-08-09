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
		int finArr[] = permutation(arr, n);
		for(int i:finArr){
		System.out.print(i+" ");
		}
		sc.close();
	}
	
	private static int[] permutation(int[] arr,int n){
	    int index=-1;
	    
	    for(int i=n-2;i>=0;i--){
	        if(arr[i]<arr[i+1]){
	            index=i;
	            break;
	        }
	    }
	    if(index==-1){
	        reverse(arr,0,n-1);
	        return arr;
	    }
	    for(int i=n-1;i>index;i--){
	        if(arr[i]>arr[index]){
	           swap(arr,i,index);
	            break;
	        }
	    }
	    reverse(arr,index+1,n-1);
	    return arr;
	    }
	
	private static void reverse(int[] arr,int left,int right){
	    while(left<right){
	        swap(arr,left,right);
	        left++;
	        right--;
	    }
	}
	
	private static void swap(int[] arr,int i,int index){
	    int temp = arr[i];
	    arr[i]   = arr[index];
	    arr[index]   = temp;
	}
	
}