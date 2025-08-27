import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] da = new int[5];
        for (int i = 0; i < da.length; i++) {
            da[i] = i * i;
        }

        int[] sa= {10, 20, 30, 40, 50};

        System.out.println("Dynamic Array: " + Arrays.toString(da));
        System.out.println("Static Array: " + Arrays.toString(sa));
    }
}
