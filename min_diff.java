package list;
import java.util.*;
public class min_diff {

	public static void main(String[] args) {
		int[] arr= {1,3,5,6,8};
		int min =Integer.MAX_VALUE;
		for(int i=1; i<arr.length;i++) {
			int diff = arr[i]-arr[i-1];
			min=Math.min(min,diff);
			
		}
		System.out.println(min);

	}
	
}
