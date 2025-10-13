import java.util.Scanner;

public class I_Wanna_Be_The_Guy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Step 1: Declare variables

        int n = input.nextInt();
        int[] level = new int[n];
        int total = 0;

        //Input for little X

        int p = input.nextInt();
        int[] a = new int[p];
        for (int i = 0; i < p; i++) {
            a[i] = input.nextInt();
        }

        //Input for little Y

        int q = input.nextInt();
        int[] b = new int[q];
        for (int i = 0; i < q; i++) {
            b[i] = input.nextInt();
        }

        //check if they cleared the levels

        for(int X: a){
            level[X-1] = 1;
        }

        for(int Y: b){
            level[Y-1] = 1;
        }

        for(int i = 0; i< n ; i++){
            total += level[i];
        }

        if(total == n) System.out.println("I become the guy.");
        else System.out.println("Oh, my keyboard!");

    }
}
