import java.util.Scanner;

public class Anton_Danik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        int a = 0;
        int d = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'A') a++;
            else d++;
        }

        if (a == d) System.out.println("Friendship");
        else {
            if (a > d) System.out.println("Anton");
            else System.out.println("Danik");
        }
    }
}
