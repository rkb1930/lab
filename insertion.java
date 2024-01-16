package list;

public class insertion {

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            
            int j;
            for (j = i - 1; j >= 0 && arr[j] > key; --j) {
                arr[j + 1] = arr[j];
            }
            
            arr[j + 1] = key;
        }

        
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
