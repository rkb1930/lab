package list;

public class first_repeated {

	

	    public static void main(String[] args) {
	        int[] array = {4, 2, 5, 8, 2, 4, 6};
	        int firstRepeated = findFirstRepeatedElement(array);

	        if (firstRepeated != -1) {
	            System.out.println("The first repeated element is: " + firstRepeated);
	        } else {
	            System.out.println("No repeated elements found.");
	        }
	    }

	    public static int findFirstRepeatedElement(int[] array) {
	        for (int i = 0; i < array.length; i++) {
	            for (int j = i + 1; j < array.length; j++) {
	                if (array[i] == array[j]) {
	                  
	                    return array[i];
	                }
	            }
	        }
	        
	        return -1;
	    }
	}


