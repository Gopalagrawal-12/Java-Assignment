import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<arr.length;++i){
            for(int j=0;j<arr[0].length;++j){
                arr[i][j]=(i+1)*(j+1);
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
