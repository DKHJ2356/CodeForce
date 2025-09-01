import java.util.Scanner;

public class Vanya_and_fence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int h = sc.nextInt();
        int r = 0;

        int [] a = new int[n];

        for(int i =0; i<n; i++){
            a[i] = sc.nextInt();
        }

        for(int i =0; i<n; i++){

            if( a[i]>h ){
                if( a[i]/2 <=h ){
                    r+=2;
                }
            }else if(a[i]<=h){
                r++;
            }else continue;

        }

        System.out.println(r);

    }
}
