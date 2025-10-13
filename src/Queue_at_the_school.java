import java.util.Scanner;

public class Queue_at_the_school {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Step 1: Declare variables

        int n = sc.nextInt();
        int t = sc.nextInt();
        String s = sc.next();
        char[] arr = s.toCharArray();

        //Step 2: Find pattern BG then swap t times sequentially

        for (int i = 0; i < n; i++) {
            int x = 1;
            if (s.charAt(i) == 'B') {
                if (i + 1 < n && s.charAt(i + 1) == 'G') {

                    ///now swap t times using variable X. How?

                    char temp = s.charAt(i);
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }


        //Step 3: Reassign value of s and display the string

        s = String.valueOf(arr);
        System.out.println(s);

    }
}