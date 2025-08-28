import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void func(int[] arr,int i,int j){
        if(i>j) return;
        int z=arr[i];
        arr[i]=arr[j];
        arr[j]=z;
        func(arr,++i,--j);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[] x=new int[5];
        int c=0;
        for(int i=arr.length-1;i>=0;--i){
            x[c]=arr[i];
            c++;
        }System.out.println(Arrays.toString(x));
        func(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        
    }
}
