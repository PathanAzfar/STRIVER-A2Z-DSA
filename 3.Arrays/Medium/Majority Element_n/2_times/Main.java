import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int majorityEle = majorityElement(arr,n);
        if(majorityEle==-1){
            System.out.print("No element found");
        }
        else{
            System.out.print(majorityEle);
        }
	}
	
	private static int majorityElement(int[] arr,int n){
	        int count=0;
	        int ele=0;
	    for(int i=0;i<n;i++){
	        if(count==0){
	            count++;
	            ele=arr[i];
	        }
	        else if(arr[i]==ele){
	            count++;
	        }
	        else{
	            count--;
	        }
	    }
	        int count1=0;
	    for(int i=0;i<n;i++){
	        if(arr[i]==ele){
	            count1++;
	        }
	    }
	    if(count1>n/2) return ele;
	    
	    return -1;
	}
}