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
        int[] arr1={1,7,32,4,21,9,98,2};
        int[] arr2=Arrays.copyOf(arr1,arr1.length);
        long start1 = System.currentTimeMillis();
        Arrays.sort(arr1);
        long end1 = System.currentTimeMillis();
        System.out.println("Arrays.sort() time: " + (end1 - start1) + " ms");

        long start2 = System.currentTimeMillis();
        Arrays.parallelSort(arr2);
        long end2 = System.currentTimeMillis();
        System.out.println("Arrays.parallelSort() time: " + (end2 - start2) + " ms");
    }
}
