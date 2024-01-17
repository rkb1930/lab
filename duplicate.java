package list;
import java.util.*;

public class duplicate {

	public static void main(String[] args) {
		int[] arr= {1,2,3,2,1,4};
		Arrays.sort(arr);
		for (int i =1; i<arr.length; i++) {
			int temp =-1;
			if(temp==arr[i]) {
				continue;
			}
			else if(arr[i-1]==arr[i]){
				System.err.println(arr[i]);
				temp=arr[i];
			}
			
		}

	}

}
