import java.util.Scanner;

public class Easy_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int hard = 0;

        for(int i = 0; i<n; i++){
            int a = sc.nextInt();
            if(a == 1) hard = 1;
        }

        if(hard == 1) System.out.println("HARD");
        else System.out.println("EASY");
    }
}
