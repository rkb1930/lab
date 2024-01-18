public static int gcd(int a,int b){
        if(a==0)
            return b;
        return gcd(b%a,a);
    }
---------------------------------------------------------
public class minMaxArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int s=0,e=5-1;
        int arr1[]=new int[5];
        int i=0;
        while(s<=e){
            if(s==e)
                arr1[i++]=arr[e--];
            else {
                arr1[i++] = arr[e--];
                arr1[i++] = arr[s++];
            }
        }
        for(int j=0;j<5;j++){
            System.out.print(arr1[j]+" ");
        }
        System.out.println();
    }
}
----------------------------------------------------
public class reduceArr {
    public static int findMin(int arr[],int n){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<min && arr[i]>0)
                min=arr[i];
        }
        return min;
    }
    public static void main(String[] args) {
        int []arr={1,3,3,5,7,9};
        int n=arr.length;
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
        int ans=0;
        for(int i=0;i<n;i++) {
            int cnt0 = 0;
            int min = findMin(arr, n);
            for (int j = 0; j < n; j++) {
                if (arr[j] > 0)
                    arr[j] -= min;
                if (arr[j] == 0)
                    cnt0++;
                if (arr[j] != 0)
                    System.out.print(arr[j] + " ");
            }
            if (cnt0 == n) {
                System.out.println(0);
                ans=i;
                break;
            }
            System.out.println();
        }
        System.out.println("total steps required to reduce array is : "+(ans+1));
    }
}






