package list;

public class Lsearch {
	
	    public static int linearSearch(int []arr,int n,int x){
	        if(n==0)
	            return -1;
	        if(arr[n-1]==x)
	            return n-1;

	        //System.out.println(arr[n-1]);
	        return linearSearch(arr,n-1,x);
	    }
	    public static void main(String[] args) {
	        int arr[]={1,2,8,5,16};
	        int x=2;
	        System.out.println(linearSearch(arr,arr.length,x));
	    }
}

