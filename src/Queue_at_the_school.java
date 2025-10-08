import java.util.Scanner;

public class Queue_at_the_school {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int queue = sc.nextInt();
        int time = sc.nextInt();
        sc.nextLine();
        char [] a = sc.nextLine().toCharArray();
        int flag = 0;


        for(int i =0; i<queue; i++){
            char temp = a[i];


            for(int j = i+1; j<queue; j++) {
                if (a[i] < a[i + time] && flag != time ) {
                    a[i] = a[i + time];
                    a[i + time] = temp;
                    flag++;
                }
                System.out.println(flag);

            }

            flag--;

        }
        System.out.println(a);
    }
}
