import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static boolean findName(String[] arr, String name){
        for(int i=0;i<arr.length;++i){
            if(arr[i].equals(name)) return true;
        }return false;
    }
    public static void main(String[] args) {
        String[] arr={"gopal","madhav","sehal","naman","abhishek"};
        System.out.println(findName(arr,"sehal"));
        boolean f = Arrays.stream(arr).anyMatch("sehal"::equals);
        System.out.println(f);
    }
}
