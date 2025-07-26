import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int[] a= new int[n1];
		for(int i=0;i<n1;i++){
	         a[i]=sc.nextInt();
		}
		
		int n2 = sc.nextInt();
		int[] b = new int[n2];
		for(int i=0;i<n2;i++){
		    b[i]=sc.nextInt();
		}
		int[] finArr = unionArr(a,n1,b,n2);
		for(int i:finArr){
		System.out.print(i+" ");
		}
		sc.close();
	}
	
	private static int[] unionArr(int[] a,int n1,int[] b,int n2){
	    ArrayList<Integer> uA = new ArrayList<>();
	    int i=0,j=0;
	    while(i<n1 && j<n2){
	        if(a[i]<=b[j]){
	            if(uA.isEmpty() || uA.get(uA.size()-1)!=a[i]){
	                uA.add(a[i]);
	            }
	                i++;
	        }
	        else{
	            if(uA.isEmpty() || uA.get(uA.size()-1)!=b[j]){
	               uA.add(b[j]);
	            }
	               j++;
	        }
	    }
	    while(i<n1){
	       if(uA.isEmpty() || uA.get(uA.size()-1)!=a[i]){
	       uA.add(a[i]);
	       }
	       i++;
	        }
	        while(j<n2){
	            if(uA.isEmpty() || uA.get(uA.size()-1)!=b[j]){
	               uA.add(b[j]);
	            }
	               j++;
	        }
	        
	      int result[] = new int[uA.size()];
	      for(int k=0;k<uA.size();k++){
	          result[k]=uA.get(k);
	      }
	      return result;
	    }
}
