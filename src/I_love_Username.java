import java.util.Scanner;

public class I_love_Username {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] contestPoints = new int[n];
        int pointsCrossed = 0;

        for (int i = 0; i < n; i++) {
            contestPoints[i] = input.nextInt();
        }

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n; j++) {
                if(contestPoints[i] > contestPoints[j]){
                    pointsCrossed++;
                    i=j;
                    continue;
                }
            }
        }
    }
}
