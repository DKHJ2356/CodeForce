import java.util.Scanner;

public class Presents {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] slot = new int[n];
        int[] slotGave = new int[n];

        for (int i = 0; i < n; i++) {
            slot[i] = input.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int whoReceived = slot[i];
            int whoGave = i;
            slotGave[whoReceived - 1] = whoGave + 1;

        }

        for (int i : slotGave) {
            System.out.print(i + " ");
        }
    }
}
