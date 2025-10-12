import java.util.Scanner;

public class Hulk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Step 1 : Declare variables

        int n = input.nextInt();
        int flag;
        if(n%2 == 0) flag = 0;
        else flag = 1;


        //Step 2 : Set flag to help you solve the problem

        while(n>1){

            if(flag == 1){
                if(n%2 == 1) System.out.print("I hate that ");
                else System.out.print("I love that ");
            }

            if(flag == 0){
                if(n%2 == 0) System.out.print("I hate that ");
                else System.out.print("I love that ");
            }

            n--;
        }

        //Step 3 : set the final flag for last message

        if(n%2 == 1 && flag == 1) System.out.print("I hate it");
        else System.out.print("I love it");
    }
}
