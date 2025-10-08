import java.util.Scanner;

public class Calculating_Function {
    public static void main( String [] args ) {
        Scanner sc = new Scanner( System.in );

        //Step 1: Declaring Variables

        long n = sc.nextLong();
        long sumOfn = 0;

        //Step 2: Setting function

        if ( n % 2 == 0 ){
            sumOfn = n / 2;
        } else {
            sumOfn = -( ( n + 1 ) / 2 );
        }

        //Step 3: Display values

        System.out.println( sumOfn );
    }
}
