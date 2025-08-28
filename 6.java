import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {7, 2, 9, 4, 1};

        Arrays.sort(arr);

        int index =-1;
        int l=0;
        int r=arr.length - 1;
        while(l<=r){
            int mid=(l+r)/2;
            if(arr[mid]==4){
                index=mid;
                break;
            }else if(arr[mid]>4) r=mid-1;
            else l=mid+1;
        }
        System.out.println("Sorted array: " + Arrays.toString(arr));
        System.out.println("Index of 4: " + index);
    }
}
