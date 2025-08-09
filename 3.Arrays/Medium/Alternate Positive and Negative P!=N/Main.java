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
	    ArrayList<Integer> positive = new ArrayList<>();
	    ArrayList<Integer> negative = new ArrayList<>();
	    
	    for(int num:arr){
            if(num >= 0){
                positive.add(num);
            }
            else {
                negative.add(num);
            }
	    }
	    int i=0,posIndex=0,negIndex=0;
	    
	    while(posIndex < positive.size() && negIndex < negative.size()){
	        arr[i++]=positive.get(posIndex++);
	        arr[i++]=negative.get(negIndex++);
	    }
	    
	    while(posIndex < positive.size()){
	        arr[i++]=positive.get(posIndex++);
	    }
	    while(negIndex < negative.size()){
	        arr[i++]=negative.get(negIndex++);
	    }
	    return arr;
	    }
	}