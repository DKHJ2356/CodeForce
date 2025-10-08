import java.util.Scanner;

public class Magnets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Step 1 : Declaring variables

        int n = sc.nextInt();
        int[] groupOfMagnets = new int[n];
        int differentGroupsOfMagnets = 1;

        //Step 2 : Input values

        for(int i = 0; i < n; i++){
            groupOfMagnets[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            if(i+1 < n && groupOfMagnets[i+1] != groupOfMagnets[i]){
                differentGroupsOfMagnets++;
            }
        }

        System.out.println(differentGroupsOfMagnets);
    }
}
