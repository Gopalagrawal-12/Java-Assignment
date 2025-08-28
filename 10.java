import java.util.Arrays;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        int[][] x=new int[3][3];
        int c=1;
        for(int i=0;i<x.length;++i){
            for(int j=0;j<x[0].length;++j){
                x[i][j]=c++;
            }
        }int s1=0;
        for(int i=0;i<x.length;++i){
            s1+=x[i][i];
        }int s2=0;
        for(int i=0;i<x.length;++i){
            s2+=x[i][x.length-1-i];
        }System.out.println(s1);
        System.out.println(s2);
        
    }
}
