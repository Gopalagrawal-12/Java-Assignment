public class Main {

    public static void main(String[] args) {
        int n = 10;
        int[] primes = new int[10];
        int num = 2;
        int c=0;
        while (c < n) {
            boolean x = true;
            for (int j = 2; j * j <= num; j++) {
                if (num % j == 0) {
                    x= false;
                    break;
                }
            }
            if (x) {
                primes[c++] = num;
            }
            num++;
        }for(int i=0;i<primes.length;++i){
            System.out.print(primes[i]+" ");
        }
    }
}
