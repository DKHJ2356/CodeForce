import java.util.Scanner;

public class Tram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int max = 0;
        int [] total = new int[n];


            int [] a = new int[n];
            int [] b = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] =sc.nextInt();
                b[i] = sc.nextInt();

                if(i-1>=0) {

                    total[i] = (b[i] - a[i])+total[i-1];

                }

                if(total[i]>max){
                    max = total[i];
                }

        }

        System.out.println(max);

    }
}
