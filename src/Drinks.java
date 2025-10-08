import java.util.Scanner;

public class Drinks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Declaring Variables

        int n = sc.nextInt();
        double sumOfPi = 0;

        // Step 2: Input values

        for(int i = 0; i < n; i++){
            double Pi = sc.nextInt();
            sumOfPi += Pi;
        }

        //Step 3: Display values

        double volumeFraction = sumOfPi / n;
        System.out.println(volumeFraction);
    }
}
