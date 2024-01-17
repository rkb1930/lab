package list;

public class missing_num {


	    public static void main(String[] args) {
	        int[] arr = {1, 2, 4, 6, 3, 7, 8};

	        int n = arr.length + 1;

	        
	        int expectedSum = n * (n + 1) / 2;

	       
	        int actualSum = 0;
	        for (int value : arr) {
	            actualSum += value;
	        }

	       
	        int missingNumber = expectedSum - actualSum;

	        System.out.println("Missing number: " + missingNumber);
	    }
	}


	


