import java.util.Scanner;

public class Beautiful_Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();
        int [] arr = new int[4];
        int number = 0;

            for (int i = y+1; i < 10000;i++) {

                int flag = 0;
                int x = i;
                int j = 0;

                while (x != 0) {
                    arr[j++] = x % 10;
                    x /= 10;
                }

                for (int k = 0; k < arr.length; k++) {
                    for (int l = k + 1; l < arr.length; l++) {
                        if (arr[k] == arr[l]) {
                            flag = 1;
                            break;
                        }
                    }
                    if(flag == 1) break;
                }

                if(flag == 0) {
                    number = i;
                    break;
                }

            }

        System.out.println(number);
    }
}
