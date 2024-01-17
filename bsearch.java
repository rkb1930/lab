package list;

public class bsearch {
	
	    public static int binarySearch(int []arr,int s,int e,int x){
	        int mid=s+(e-s)/2;
	        if(s>e)
	            return -1;
	        if(arr[mid]==x)
	            return mid;
	        if(arr[mid]>x)
	            return binarySearch(arr,s,mid-1,x);
	        else
	            return binarySearch(arr,mid+1,e,x);
	    }
	    public static void main(String[] args) {
	        int arr[]={1,2,3,4,5,7,8,10};
	        System.out.println(binarySearch(arr,0,arr.length-1,10));
	    }
	}
