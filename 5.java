import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] x = arr;
        int[] z = Arrays.copyOf(arr, arr.length);

        for (int i = 0; i < x.length; ++i) {
            x[i]++; 
        }

        System.out.println("arr: " + Arrays.toString(arr));
        System.out.println("x:   " + Arrays.toString(x));
        System.out.println("z:   " + Arrays.toString(z));
    }
}
