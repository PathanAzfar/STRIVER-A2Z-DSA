import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n =sc.nextInt();
    	int[] arr = new int[n];
    	for(int i=0;i<n;i++) {
    		arr[i]=sc.nextInt();
    	}
    	int finArr[]=moveZeros(arr,n);
    	for(int i:finArr) {
    		System.out.print(i+" ");
    	}
    	sc.close();
    }
    private static int[] moveZeros(int[] arr,int n) {
    	int j=-1;
    	for(int i=0;i<n;i++) {
    		if(arr[i]==0) {
    			j=i;
    			break;
    		}
    	}
    	if(j==-1)
    		return arr;
    	for(int i=j+1;i<n;i++) {
    		if(arr[i]!=0) {
    			int temp= arr[i];
    			arr[i]=arr[j];
    			arr[j]=temp;
    			j++;
    		}
    	}
    	return arr;
    }    
}
