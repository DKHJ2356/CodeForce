import java.util.Scanner;

public class HitTheLottery {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Step 1: Declare variables

        int n = input.nextInt();
        int[] bills = {100, 20, 5, 1};
        int count = 0;

        for(int bill : bills){
            count += n / bill;
            n%=bill;
        }

        System.out.println(count);

    }
}
