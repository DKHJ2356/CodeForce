import java.util.Scanner;

public class TheNewYear_MeetingFriends {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int friendsNumber = 3;
        int friend1 = input.nextInt();
        int friend2 = input.nextInt();
        int friend3 = input.nextInt();
        int total = 0;

        if (friend1 > friend2 && friend1 > friend3 && friend2 > friend3) {
            while (friend1 != friend2) {
                friend1--;
                total++;
            }
            while (friend3 != friend2) {
                friend3++;
                total++;
            }
        } else if (friend1 > friend3 && friend3 > friend2) {
            while (friend1 != friend3) {
                friend1--;
                total++;
            }
            while (friend2 != friend3) {
                friend2++;
                total++;
            }
        }

        if (friend2 > friend1 && friend2 > friend3 && friend1 > friend3){
            while (friend2 != friend1) {
                friend2--;
                total++;
            }
            while (friend3 != friend1) {
                friend3++;
                total++;
            }
        }
        else if (friend2 > friend3 && friend3 > friend1){
            while (friend2 != friend3) {
                friend2--;
                total++;
            }
            while (friend1 != friend3) {
                friend1++;
                total++;
            }
        }

        if (friend3 > friend1 && friend3 > friend2 && friend1 > friend2){
            while (friend3 != friend1) {
                friend3--;
                total++;
            }
            while (friend2 != friend1) {
                friend2++;
                total++;
            }
        }
        else if (friend3 > friend2 && friend2 > friend1){
            while (friend3 != friend2) {
                friend3--;
                total++;
            }
            while (friend1 != friend2) {
                friend1++;
                total++;
            }
        }

            System.out.println(total);
    }
}
