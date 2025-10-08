import java.util.Scanner;

public class George_And_Accommodation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Step 1 : Declare variables

        int n = sc.nextInt();
        int countFreeRoom = 0;

        //Step 2 : Input values

        for(int i = 1; i <= n; i++){
            int p = sc.nextInt();
            int q = sc.nextInt();

            if(q-p >= 2){
                countFreeRoom++;
            }

        }

        //Step 3 : Display values

        System.out.println(countFreeRoom);

    }
}
